package dev.msnascimento.builder;

import java.awt.Color;
import java.awt.Dimension;

public class Bedroom {

	private Dimension dimensions;
	private int ceillingHeight;
	private int floorNumber;
	private Color wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private boolean isDouble;
	private boolean hasEnsuite;

	/*
	 * Bedroom(BedroomBuilder builder) { this.dimensions = builder.dimensions;
	 * this.ceillingHeight = builder.ceillingHeight; this.floorNumber =
	 * builder.floorNumber; this.wallColor = builder.wallColor; this.numberOfWindows
	 * = builder.numberOfWindows; this.numberOfDoors = builder.numberOfDoors;
	 * this.isDouble = builder.isDouble; this.hasEnsuite = builder.hasEnsuite; }
	 */

	public Bedroom(Dimension dimensions, int ceillingHeight, int floorNumber, Color wallColor, int numberOfWindows,
			int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
		super();
		this.dimensions = dimensions;
		this.ceillingHeight = ceillingHeight;
		this.floorNumber = floorNumber;
		this.wallColor = wallColor;
		this.numberOfWindows = numberOfWindows;
		this.numberOfDoors = numberOfDoors;
		this.isDouble = isDouble;
		this.hasEnsuite = hasEnsuite;
	}

}
