package dev.msnascimento.interprete.challenge;

import dev.msnascimento.interpreter.Expression;

public class FirstCapitalLetter implements Expression {

	RepeatedWord repeatedWord = new RepeatedWord();

	@Override
	public String interpret(String context) {

		context = HelperMethods.firstLetterLowerCase(context);
		return repeatedWord.interpret(context);
	}

}
