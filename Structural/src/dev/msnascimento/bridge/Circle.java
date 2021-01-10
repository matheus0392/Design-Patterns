package dev.msnascimento.bridge;

import java.awt.Graphics;

public class Circle extends Shape {

	ColorShape colorShape;

	public Circle(ColorShape colorShape) {
		super();
		this.colorShape = colorShape;
	}

	public void draw(Graphics graphics) {
		colorShape.setColor(graphics);
		graphics.fillOval(75, 15, 50, 50);
	}

}
