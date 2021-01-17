package dev.msnascimento.cor;

public class Client {

	public static void main(String... args) {
		DocumentHandler chain = new SpreadsheetHandler(new SlideshowHandler(new TextDocumentHandler(null)));
	}
}
