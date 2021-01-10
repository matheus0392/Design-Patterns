package dev.msnascimento.abstractfactory;

public class MountainBikeFactory extends BikeFactory {

	@Override
	Tire createTire() {
		return new MountainBikeTire();
	}

	@Override
	Handlebar createHandlebar() {
		return new MountainBikeHandlebar();
	}

	@Override
	BikePart create(String type) {
		if (type.equalsIgnoreCase("tire")) {
			return new MountainBikeTire();
		} else if (type.equalsIgnoreCase("handlebar")) {
			return new MountainBikeHandlebar();
		}

		return null;
	}

}
