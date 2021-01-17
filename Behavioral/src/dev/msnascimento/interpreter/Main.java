package dev.msnascimento.interpreter;

public class Main {

	public static void main(String... args) {

		String context = "_Int";

		context = new FirstLetterNoUnderscore().interpret(context);
		System.out.println(context);
	}
}
