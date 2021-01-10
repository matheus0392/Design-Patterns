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

}
