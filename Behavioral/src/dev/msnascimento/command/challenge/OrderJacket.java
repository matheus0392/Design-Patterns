package dev.msnascimento.command.challenge;

public class OrderJacket implements Command {

	Jacket jacket;

	public OrderJacket(Jacket jacket) {
		this.jacket = jacket;
	}

	@Override
	public void execute() {
		jacket.placeOrder();
	}

}
