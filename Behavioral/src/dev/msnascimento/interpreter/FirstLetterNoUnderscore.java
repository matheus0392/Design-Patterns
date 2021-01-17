package dev.msnascimento.interpreter;

public class FirstLetterNoUnderscore implements Expression {

	private FirstLetterIsLowerCase firstLetterIsLowerCase = new FirstLetterIsLowerCase();

	@Override
	public String interpret(String context) {
		if (context.startsWith("_")) {
			context = context.substring(1);
		}
		return firstLetterIsLowerCase.interpret(context);
	}

}
