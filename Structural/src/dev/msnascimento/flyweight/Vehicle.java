package dev.msnascimento.flyweight;

public interface Vehicle {

  String getType();
  int[] getLocation();
  void setLocation(int latitude, int longitude);
}
