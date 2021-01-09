package dev.msnascimento.Prototype;

public class Rabbit implements Cloneable {

	public enum Breed {
		Himalaio, Americano, MiniRex, LionHead, Holandes
	};

	private int age;
	private Breed breed;

	public Rabbit() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	@Override
	protected Rabbit clone() {

		try {
			return (Rabbit) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}

	}

}
