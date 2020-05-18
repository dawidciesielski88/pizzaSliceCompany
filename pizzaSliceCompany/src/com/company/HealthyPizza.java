package com.company;

public class HealthyPizza extends Pizza {
    private String healthyExtra1name;
    private double healthyExtra1Price;

    private String healthyExtra2name;
    private double healthyExtra2Price;

    public HealthyPizza(String meat, double price) {
        super("Healthy", "whole wheat", price, meat);

    }

    public void addHealthyAdd1(String name, double price) {
        this.healthyExtra1name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAdd2(String name, double price) {
        this.healthyExtra2name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double totalPizza() {
        double pizzaPrice = super.totalPizza();
        if (this.healthyExtra1name != null) {
            pizzaPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2name != null) {
            pizzaPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2name + " for an extra " + this.healthyExtra2Price);
        }
        return pizzaPrice;
    }
}
