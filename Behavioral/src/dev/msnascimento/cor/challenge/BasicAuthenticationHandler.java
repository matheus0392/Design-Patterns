package dev.msnascimento.cor.challenge;

public class BasicAuthenticationHandler extends AuthenticationHandler {

	AuthenticationHandler next;

	public BasicAuthenticationHandler(AuthenticationHandler next) {
		super();
		this.next = next;
	}

	public void handleRequest(String requestType) {

		if (requestType.equals("basic")) {
			System.out.println("Basic Authentication");
		} else {
			if (this.next != null) {
				this.next.handleRequest(requestType);
			}
		}
	}

}
