package dev.msnascimento.cor.challenge;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

	AuthenticationHandler next;

	public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
		super();
		this.next = next;
	}

	public void handleRequest(String requestType) {

		if (requestType.equals("client")) {
			System.out.println("ClientCertificate Authentication");
		} else {
			if (this.next != null) {
				this.next.handleRequest(requestType);
			}
		}
	}
}
