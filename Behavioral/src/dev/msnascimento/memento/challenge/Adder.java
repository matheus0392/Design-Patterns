package dev.msnascimento.memento.challenge;

public class Adder {

	private int result;
	private Memento memento = new Memento(result);

	public void add(int newNumber) {
		result += newNumber;
	}

	public int getResult() {
		return result;
	}

	public void save() {
		memento.setResult(result);

	}

	public void undo() {
		result = memento.getResult();
	}

}
