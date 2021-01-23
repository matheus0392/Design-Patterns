package dev.msnascimento.visitor.challenge;

public interface Employee {

	int getSalary();

	void changeSalary(Visitor visitor);

}
