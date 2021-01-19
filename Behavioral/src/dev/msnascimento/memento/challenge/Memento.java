package dev.msnascimento.memento.challenge;

public class Memento {

	private	int state;
	public Memento(int result) {
		this.state=result;
	}

	public void setResult(int result) {
		this.state=result;
		
	}

	public int getResult() {
		return this.state;
	}

}
