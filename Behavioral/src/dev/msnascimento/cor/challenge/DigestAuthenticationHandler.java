package dev.msnascimento.cor.challenge;

public class DigestAuthenticationHandler extends AuthenticationHandler {

	AuthenticationHandler next;

	public DigestAuthenticationHandler(AuthenticationHandler next) {
		super();
		this.next = next;
	}

	public void handleRequest(String requestType) {

		if (requestType.equals("digest")) {
			System.out.println("Digest Authentication");
		} else {
			if (this.next != null) {
				this.next.handleRequest(requestType);
			}
		}
	}
}
