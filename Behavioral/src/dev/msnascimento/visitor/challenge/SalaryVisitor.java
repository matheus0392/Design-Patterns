package dev.msnascimento.visitor.challenge;

public class SalaryVisitor implements Visitor {

	@Override
	public void visit(SalesPerson employee) {
		employee.setSalary(57000);
	}

	@Override
	public void visit(Manager manager) {
		manager.setSalary(70000);
	}

	@Override
	public void visit(StaffList staff) {
		System.out.println("Salaries were changed");
	}

}