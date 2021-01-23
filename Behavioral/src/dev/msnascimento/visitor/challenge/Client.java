package dev.msnascimento.visitor.challenge;

public class Client {

	public static void main(String[] args) {
		StaffList staffList = new StaffList();
		System.out.println("Total amount paid to staff: " + staffList.getSalary());
		staffList.changeSalary(new SalaryVisitor());
		System.out.println("new Total amount paid to staff: " + staffList.getSalary());
	}

}
