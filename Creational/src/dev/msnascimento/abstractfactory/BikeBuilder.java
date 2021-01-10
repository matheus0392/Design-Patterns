package dev.msnascimento.abstractfactory;

public class BikeBuilder {

	public static void main(String[] args) {

		createBikeWithoutAbstractFactory();

		createBikeWithAbstractFactory("road bike");
	}

	private static void createBikeWithoutAbstractFactory() {

		MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
		MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
		MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();

		System.out.println(mountainBikeTireFront.getDescription());
		System.out.println(mountainBikeTireBack.getDescription());
		System.out.println(mountainBikeHandlebar.getDescription());
		System.out.println();
	}

	private static void createBikeWithAbstractFactory(String type) {

		BikeFactory bikeFactory = FactoryCreator.createFactory(type);

		Tire tireFront = bikeFactory.createTire();
		Tire tireBack = bikeFactory.createTire();
		Handlebar handlebar = bikeFactory.createHandlebar();

		System.out.println(tireFront.getDescription());
		System.out.println(tireBack.getDescription());
		System.out.println(handlebar.getDescription());
		System.out.println();
	}

}
