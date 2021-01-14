package dev.msnascimento.decorator;

public class Main {

  public static void main(String[] args) {
    order(new ExtraCheese(new PizzaMargherita()));
    order(new ExtraCheese(new PizzaHawaiian()));
    order(new ExtraCheese(new PizzaPepperoni()));
  }

  public static void order(Pizza pizza) {
    System.out.println("You have ordered a " + pizza.getName() +
        " pizza. The toppings are " + pizza.getToppings() + ".");
  }

}
