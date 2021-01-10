package dev.msnascimento.bridge.challenge;

public class DropdownButton extends Button {

	ButtonSize size;

	public DropdownButton(ButtonSize size) {
		super();
		this.size = size;
	}

	public void draw() {
		System.out.println(this.size.getButtomSize());
		System.out.println("Drawing a dropdown button.\n");
	}

}
