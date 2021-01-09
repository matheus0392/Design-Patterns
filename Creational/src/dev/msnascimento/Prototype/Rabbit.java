package dev.msnascimento.Prototype;

public class Rabbit implements Cloneable {

	public enum Breed {
		Himalaio, Americano, MiniRex, LionHead, Holandes
	};

	private int age;
	private Breed breed;
	private Person owner;

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

	public Person getPerson() {
		return owner;
	}

	public void setPerson(String owner) {
		this.owner = new Person(owner);
	}

	@Override
	protected Rabbit clone() {

		try {
			 Rabbit rabbit=(Rabbit) super.clone();
			 rabbit.owner= owner.clone();

			 return rabbit;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}

	}


}
