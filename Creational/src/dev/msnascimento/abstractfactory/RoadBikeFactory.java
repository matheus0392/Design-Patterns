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

}
