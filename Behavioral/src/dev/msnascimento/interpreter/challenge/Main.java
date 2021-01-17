package dev.msnascimento.interpreter.challenge;

public class Main {

	public static void main(String[] args) {

		String context = "this is a a sentence";

		context = new FirstCapitalLetter().interpret(context);
		System.out.println(context);

	}

}
