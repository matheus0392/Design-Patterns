package dev.msnascimento.facade.challenge;

public class GearStick {

  private int gear = 0;

  public void changeGear(int gear) {
    System.out.println("Changing gear to " + gear);
    this.gear = gear;
  }

}
