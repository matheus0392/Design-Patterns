package dev.msnascimento.decorator;

import java.awt.Color;
import java.awt.Graphics;

public class ComponentWithRedBorder implements Component {

	Component decorateComponent;

	public ComponentWithRedBorder(Component decorateComponent) {
		super();
		this.decorateComponent = decorateComponent;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.RED);
		decorateComponent.draw(graphics);
		graphics.setColor(Color.BLACK);
	}

}
