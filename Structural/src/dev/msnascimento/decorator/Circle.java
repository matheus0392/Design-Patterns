package dev.msnascimento.decorator;

import java.awt.Graphics;

public class Circle implements Component {

	private int x;
	private int y;

	public Circle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.drawOval(x, y, 50, 50);
	}

}
