package dev.msnascimento.adapter;

import org.example.UKCarPriceCalculator;

public class Main {

	public static void main(String[] args) {

		CarPriceCalculator carPrice = new CarPriceCalculator("Ford", 3);
		printVehiclePrice(carPrice);

		TruckPriceCalculator truckPrice = new TruckPriceCalculator(10,0);
		printVehiclePrice(truckPrice);
		
		UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("BMW",7);
		Adapter adapter = new Adapter(ukCarPriceCalculator);
		printVehiclePrice(adapter);
	}

	public static void printVehiclePrice(PriceCalculator calculator) {
		String price = calculator.calculatePrice();
		System.out.println("The price of vehicle is: " + price);
	}
}
