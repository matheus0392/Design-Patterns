package dev.msnascimento.builder;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Architect {

	public static void main(String[] args) {

		Bedroom bedroom = new Bedroom(new Dimension(200, 100), 132, 2, Color.yellow, 2, 1, true, true);
		
		Bedroom bedroom1 =new BedroomBuilder().setDimensions(new Dimension(200,100)).setCeillingHeight(3).build();
		Bedroom bedroom2 =new BedroomBuilder().setDimensions(new Dimension(300,250)).build();	

		Room room1 = new RoomBuilder().setFloorNumber(2).build();
		Room room2 = new RoomBuilder().setFloorNumber(2).build();

		ArrayList<Room> rooms = new /*ArrayList<>(); rooms.add(room1); rooms.add(room2); */
		RoomListBuilder().addList().addRoom(room1).addRoom(room2).buildList();

		House house = new House(rooms);
		
		rooms = new RoomListBuilder().addList().addRoom().setFloorNumber(1).addRoomToList().addRoom().setFloorNumber(2).addRoomToList().buildList();

		house = new House(rooms);
	}

}
