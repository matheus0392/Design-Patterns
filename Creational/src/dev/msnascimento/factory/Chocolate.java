package dev.msnascimento.factory;

import java.util.ArrayList;

public class Chocolate extends Candy {

	@Override
	ArrayList<Candy> makeCandyPackage(int quantity) {

		ArrayList<Candy> pack = new ArrayList<Candy>();

		for (int i = 0; i < quantity; i++) {
			pack.add(new Chocolate());
		}

		return pack;
	}

	@Override
	public String toString() {
		return "chocolate";
	}

}
