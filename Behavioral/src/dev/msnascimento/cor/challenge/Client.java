package dev.msnascimento.cor.challenge;

public class Client {

	public static void main(String[] args) {

		AuthenticationHandler chain = new BasicAuthenticationHandler(
				new ClientCertificateAuthenticationHandler(new DigestAuthenticationHandler(null)));

		chain.handleRequest("client");
		chain.handleRequest("basic");
		chain.handleRequest("digest");

	}

}
