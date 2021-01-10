package dev.msnascimento.adapter;

public class TruckPriceCalculator implements PriceCalculator {

	private int age;
	private int mileage;
	private static int averagePrice = 10000;

	public TruckPriceCalculator(int age, int mileage) {
		super();
		this.age = age;
		this.mileage = mileage;
	}

	@Override
	public String calculatePrice() {
		int price = Math.max(averagePrice - age * 100 - mileage / 100, 0);
		return price + " USD";
	}

}
