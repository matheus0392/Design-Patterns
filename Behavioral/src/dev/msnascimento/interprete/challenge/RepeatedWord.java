package dev.msnascimento.interprete.challenge;

import dev.msnascimento.interpreter.Expression;

public class RepeatedWord implements Expression {

	Period period = new Period();

	@Override
	public String interpret(String context) {
		context = HelperMethods.noRepeatedWords(context);
		return period.interpret(context);
	}

}
