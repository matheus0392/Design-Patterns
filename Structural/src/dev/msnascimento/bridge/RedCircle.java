package dev.msnascimento.bridge;

import java.awt.Color;
import java.awt.Graphics;

public class RedCircle extends Circle{

  public void draw(Graphics graphics) {
    graphics.setColor(Color.RED);
    super.draw(graphics);
  }

}
