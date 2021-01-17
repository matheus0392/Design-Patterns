package dev.msnascimento.iterator.challenge;

import java.util.Iterator;

public class StaffListIterator implements Iterator {

	private Employee[] employees;
	int index;

	public StaffListIterator(StaffList staffList) {
		this.employees = staffList.getEmployees();
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < employees.length) {
			return true;
		}
		return false;
	}

	@Override
	public Employee next() {
		if (hasNext()) {
			return employees[index++];
		}
		return null;
	}
}
