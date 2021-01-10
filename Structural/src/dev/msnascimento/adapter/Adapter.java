package dev.msnascimento.adapter;

import org.example.UKCarPriceCalculator;

public class Adapter implements PriceCalculator {

	UKCarPriceCalculator ukCarPriceCalculator;
	
	public Adapter(UKCarPriceCalculator ukCarPriceCalculator) {
		super();
		this.ukCarPriceCalculator = ukCarPriceCalculator;
	}

	@Override
	public String calculatePrice() {
		return ukCarPriceCalculator.getPrice() + " GBP";
	}

}
