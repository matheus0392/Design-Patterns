package dev.msnascimento.builder;

import java.awt.Color;
import java.awt.Dimension;

public class RoomBuilder implements Builder {

	private Dimension dimensions;
	private int ceillingHeight;
	private int floorNumber;
	private Color wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private RoomListBuilder roomListBuilder;

	public RoomBuilder() {
	}

	public RoomBuilder(RoomListBuilder roomListBuilder) {
		this.roomListBuilder = roomListBuilder;
	}

	@Override
	public RoomBuilder setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
		return this;
	}

	@Override
	public RoomBuilder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}

	@Override
	public RoomBuilder setWallColor(Color wallColor) {
		this.wallColor = wallColor;
		return this;
	}

	@Override
	public RoomBuilder setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
		return this;
	}

	@Override
	public RoomBuilder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}
	
	@Override
	public RoomBuilder setCeillingHeight(int ceillingHeight) {
		this.ceillingHeight = ceillingHeight;
		return this;
	}


	public Room build() {
		return new Room(dimensions, ceillingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors);
	}

	public RoomListBuilder addRoomToList() {
		Room room = build();
		this.roomListBuilder.addRoom(room);
		return this.roomListBuilder;
	}



}
