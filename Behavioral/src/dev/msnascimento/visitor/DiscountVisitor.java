package dev.msnascimento.visitor;

public class DiscountVisitor implements Visitor {

	@Override
	public void visit(Bread bread) {
		bread.setPrice(0.9);
	}

	@Override
	public void visitor(Milk milk) {
		milk.setPrice(1.6);

	}

	@Override
	public void visitor(GroceryList groceryList) {
		System.out.println("Disconts has been applied to your list");

	}

}
