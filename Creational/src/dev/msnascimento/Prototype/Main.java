package dev.msnascimento.Prototype;

import dev.msnascimento.Prototype.Rabbit.Breed;

public class Main {

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();

		rabbit.setAge(2);
		rabbit.setBreed(Breed.Holandes);
		rabbit.setPerson("Sally");

		Rabbit rabbitCopy = rabbit.clone();

		System.out.println("Age of first rabbit:" + rabbit.getAge());
		System.out.println("Age of second rabbit:" + rabbitCopy.getAge());
		System.out.println("Owner of first rabbit:" + rabbit.getPerson().getName());
		System.out.println("Owner of second rabbit:" + rabbitCopy.getPerson().getName());

		rabbitCopy.getPerson().setName("Steve");
		System.out.println("Owner of first rabbit:" + rabbit.getPerson().getName());
		System.out.println("Owner of second rabbit:" + rabbitCopy.getPerson().getName());
	}
}
