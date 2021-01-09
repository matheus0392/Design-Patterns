package dev.msnascimento.factory;

import java.util.ArrayList;

public class CandyStore {

	public static void main(String[] args) {

		CandyFactory candyFactory = new CandyFactory();

		ArrayList<Candy> pack = candyFactory.getCandyPackage(5, "chocolate");
		System.out.println(pack.toString());

		pack = candyFactory.getCandyPackage(8, "hard candy");
		System.out.println(pack.toString());

	}

}
