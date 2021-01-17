package dev.msnascimento.command.challenge;

public class ReturnJacket implements Command {

	Jacket jacket;

	public ReturnJacket(Jacket jacket) {
		this.jacket = jacket;
	}

	@Override
	public void execute() {
		jacket.returnOrder();
	}

}
