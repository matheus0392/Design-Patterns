package dev.msnascimento.iterator.challenge;

public class StaffList implements Iterable {

	private Employee[] employees;

	public StaffList(Employee... employees) {
		this.employees = employees;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	@Override
	public StaffListIterator iterator() {
		return new StaffListIterator(this);
	}
}
