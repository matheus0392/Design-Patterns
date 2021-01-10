package dev.msnascimento.factory;

import java.util.ArrayList;

public class CandyStore {

	private final static CandyFactory chocolateFactory = new ChocolateFactory();
	private final static CandyFactory hardCandyFactory = new HardCandyFactory();

	public static void main(String[] args) {

		chocolateFactory.getCandyPackage(5, "dark");
		hardCandyFactory.getCandyPackage(14, "lollipop");
		hardCandyFactory.getCandyPackage(50, "candy cane");

	}

}