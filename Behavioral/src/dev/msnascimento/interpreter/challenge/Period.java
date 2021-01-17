package dev.msnascimento.interpreter.challenge;

import dev.msnascimento.interpreter.Expression;

public class Period implements Expression {

	@Override
	public String interpret(String context) {

		return HelperMethods.endsWithPeriod(context);
	}

}
