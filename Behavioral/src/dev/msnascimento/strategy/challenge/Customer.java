package dev.msnascimento.strategy.challenge;

public class Customer {

	public void makePayment(Payment payment, int amount) {
		System.out.println(payment.makePayment(amount));
	}

}
