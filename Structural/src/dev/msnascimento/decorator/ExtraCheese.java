package dev.msnascimento.decorator;

import java.util.ArrayList;

public class ExtraCheese implements Pizza {

	Pizza currentPizza;

	public ExtraCheese(Pizza currentPizza) {
		super();
		this.currentPizza = currentPizza;
	}

	@Override
	public ArrayList getToppings() {
		this.currentPizza.getToppings().add("Extra cheese");
		return this.currentPizza.getToppings();
	}

	@Override
	public String getName() {
		return "Extra cheese";

	}

}
