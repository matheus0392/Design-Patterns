package dev.msnascimento.strategy.challenge;

public interface Payment {

	String makePayment(int amount);

	Payment makeBankAccountPayment = (int amount) -> "Payment of $" + amount + " made from bank account.";

	Payment makePayPalPayment = (int amount) -> "Payment of $" + amount + " made from PayPal.";

}
