package dev.msnascimento.bridge.challenge;

public class RadioButton extends Button {

	ButtonSize size;

	public RadioButton(ButtonSize size) {
		super();
		this.size=size;
	}

	public void draw() {
		System.out.println(this.size.getButtomSize());
		System.out.println("Drawing a radio button.\n");
	}

}
