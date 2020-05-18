package com.company;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("Overblow", "Neapolitan", 10.50, "chicken");
        double price = pizza.totalPizza();
        pizza.addPizzaIngredient1("extra cheese", 0.5);
        pizza.addPizzaIngredient2("spinach", 0.45);
        pizza.addPizzaIngredient3("mushrooms", 0.25);
        System.out.println("Customized pizza price is " + pizza.totalPizza());

        HealthyPizza healthyPizza = new HealthyPizza("pork", 10);
        healthyPizza.addHealthyAdd1("Cale", 0.7);
        healthyPizza.addHealthyAdd2("Non-fat cheese", 1);
        System.out.println("Total healthy pizza price " + healthyPizza.totalPizza());

        DeluxePizza deluxePizza = new DeluxePizza();
        deluxePizza.totalPizza();
    }



}
