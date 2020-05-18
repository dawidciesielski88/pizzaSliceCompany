package com.company;

public class DeluxePizza extends Pizza{
    public DeluxePizza() {
        super("Deluxe", "Stuffed-Crust style", 15, "pork and beef");
        super.addPizzaIngredient1("Drink", 2.5);
        super.addPizzaIngredient2("Dips", 1.75);
    }

    @Override
    public void addPizzaIngredient1(String name, double price) {
        System.out.println("Cannot add extra items to deluxe pizza");
    }

    @Override
    public void addPizzaIngredient2(String name, double price) {
        System.out.println("Cannot add extra items to deluxe pizza");
    }

    @Override
    public void addPizzaIngredient3(String name, double price) {
        System.out.println("Cannot add extra items to deluxe pizza");
    }

    @Override
    public void addPizzaIngredient4(String name, double price) {
        System.out.println("Cannot add extra items to deluxe pizza");
    }
}
