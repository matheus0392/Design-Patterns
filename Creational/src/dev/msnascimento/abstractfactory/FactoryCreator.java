package dev.msnascimento.abstractfactory;

public class FactoryCreator {

	public static BikeFactory createFactory(String type) {

		if (type.equalsIgnoreCase("mountain bike")) {
			return new MountainBikeFactory();
		} else if (type.equalsIgnoreCase("road bike")) {
			return new RoadBikeFactory();
		}

		System.out.println("Please verify  a valid type");
		return null;

	}
}
