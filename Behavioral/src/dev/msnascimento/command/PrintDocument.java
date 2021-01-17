package dev.msnascimento.command;

public class PrintDocument implements Command {

	private Document document;

	public PrintDocument(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		document.print();
	}

}
