package dev.msnascimento.abstractfactory;

public abstract class BikeFactory {

	abstract Tire createTire();

	abstract Handlebar createHandlebar();

	abstract BikePart create(String type);
}
