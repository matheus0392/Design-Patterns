package dev.msnascimento.visitor.challenge;

public interface Visitor {

	public void visit(SalesPerson employee);

	public void visit(Manager manager);

	public void visit(StaffList staff);
}
