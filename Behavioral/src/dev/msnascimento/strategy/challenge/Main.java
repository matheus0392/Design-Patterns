package dev.msnascimento.strategy.challenge;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.makePayment(Payment.makeBankAccountPayment,100);
  }

}
