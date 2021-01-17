package dev.msnascimento.command;

public class SaveDocument implements Command {

	private Document document;

	public SaveDocument(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		document.save();
	}

}
