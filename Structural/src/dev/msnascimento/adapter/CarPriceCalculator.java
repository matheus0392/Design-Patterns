package dev.msnascimento.adapter;

public class CarPriceCalculator implements PriceCalculator {

	private int age;
	private String model;
	private static int averagePrice = 6000;

	public CarPriceCalculator(String model, int age) {
		super();
		this.age = age;
		this.model = model;
	}

	public int getRetailPrice() {

		switch (model) {
		case "Ford":
			return 3000;
		case "Audi":
			return 5000;
		case "BMW":
			return 7000;
		case "Tesla":
			return 10000;

		default:
			return averagePrice;
		}
	}

	@Override
	public String calculatePrice() {
		int price = Math.max(averagePrice - age * 100 - getRetailPrice(), 0);
		return price + " USD";
	}

}
