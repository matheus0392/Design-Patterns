package dev.msnascimento.builder;

import java.awt.Color;
import java.awt.Dimension;


public interface Builder {

	Builder setDimensions(Dimension dimensions);

	Builder setCeillingHeight(int ceillingHeight);

	Builder setFloorNumber(int floorNumber);

	Builder setWallColor(Color wallColor);

	Builder setNumberOfWindows(int numberOfWindows);

	Builder setNumberOfDoors(int numberOfDoors);

}