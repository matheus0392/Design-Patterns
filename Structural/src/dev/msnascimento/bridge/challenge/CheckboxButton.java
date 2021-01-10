package dev.msnascimento.bridge.challenge;

public class CheckboxButton extends Button {
	ButtonSize size;

	public CheckboxButton(ButtonSize size) {
		super();
		this.size=size;
	}

	public void draw() {
		System.out.println(this.size.getButtomSize());
		System.out.println("Drawing a checkbox button.\n");
	}

}
