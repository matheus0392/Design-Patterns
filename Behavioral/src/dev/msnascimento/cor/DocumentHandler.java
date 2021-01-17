package dev.msnascimento.cor;

public abstract class DocumentHandler {

	private DocumentHandler next;

	public DocumentHandler(DocumentHandler next) {
		this.next = next;
	}
}
