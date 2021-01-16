package dev.msnascimento.flyweight.challenge;

import java.util.HashMap;

public class AnimalFactory {

	HashMap<Integer, Animal> animais = new HashMap();

	public Animal getAnimal(int type) {

		if (animais.containsKey(type)) {
			return animais.get(type);
		}

		Animal animal;
		if (type == 0) {
			animal = new Lion();
		} else {
			animal = new Tiger();
		}
		animais.put(type, animal);
		return animal;
	}

}
