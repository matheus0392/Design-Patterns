package dev.msnascimento.visitor;

public class DiscountVisitor implements Visitor {

	@Override
	public void visit(Bread bread) {
		bread.setPrice(0.9);
	}

	@Override
	public void visit(Milk milk) {
		milk.setPrice(1.6);

	}

	@Override
	public void visit(GroceryList groceryList) {
		System.out.println("Disconts has been applied to your list");

	}

}
