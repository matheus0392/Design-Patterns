package dev.msnascimento.mediator.challenge;

public class Mediator {

	private Plane plane;
	private PlanesInFlight planesInFlight;
	private PlanesOnGround planesOnGround;
	private Runway runway;

	public Mediator() {
		super();
		plane = new Plane(123);
		runway = new Runway();
		planesInFlight = new PlanesInFlight();
		planesOnGround = new PlanesOnGround();
		planesOnGround.addPlane(plane);
	}

	public void takeOff() {
		if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
			System.out.println("Plane " + plane.getId() + " is taking off...");
			planesOnGround.removePlane(plane);
			planesInFlight.addPlane(plane);
			plane.setIsInTheAir(true);
			runway.setIsAvailable(false);
		}

	}

}
