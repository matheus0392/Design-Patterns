package dev.msnascimento.builder;

import java.awt.Color;
import java.awt.Dimension;

public final class BedroomBuilder implements Builder {
	private Dimension dimensions;
	private int ceillingHeight;
	private int floorNumber;
	private Color wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private boolean isDouble;
	private boolean hasEnsuite;

	public BedroomBuilder() {
	}

	public Bedroom build() {
		// return new Bedroom(this);
		return new Bedroom(dimensions, ceillingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, isDouble,
				hasEnsuite);
	}

	public BedroomBuilder setIsDouble(boolean isDouble) {
		this.isDouble = isDouble;
		return this;
	}

	public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
		this.hasEnsuite = hasEnsuite;
		return this;
	}


	public BedroomBuilder setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
		return this;
	}

	
	public BedroomBuilder setCeillingHeight(int ceillingHeight) {
		this.ceillingHeight = ceillingHeight;
		return this;
	}


	public BedroomBuilder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}


	public BedroomBuilder setWallColor(Color wallColor) {
		this.wallColor = wallColor;
		return this;
	}


	public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
		return this;
	}


	public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}

}