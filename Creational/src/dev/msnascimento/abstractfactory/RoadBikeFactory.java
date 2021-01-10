package dev.msnascimento.abstractfactory;

public class RoadBikeFactory extends BikeFactory {

	@Override
	Tire createTire() {
		return new RoadBikeTire();
	}

	@Override
	Handlebar createHandlebar() {
		return new RoadBikeHandlebar();
	}

	@Override
	BikePart create(String type) {
		if (type.equalsIgnoreCase("tire")) {
			return new RoadBikeTire();
		} else if (type.equalsIgnoreCase("handlebar")) {
			return new RoadBikeHandlebar();
		}

		return null;
	}

}
