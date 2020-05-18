package com.company;

public class Pizza {
    private String name;
    private String crustType;
    private double price;
    private String meat;

    private String ingredient1Name;
    private double ingredient1Price;

    private String ingredient2Name;
    private double ingredient2Price;

    private String ingredient3Name;
    private double ingredient3Price;

    private String ingredient4Name;
    private double ingredient4Price;

    public Pizza(String name, String crustType, double price, String meat) {
        this.name = name;
        this.crustType = crustType;
        this.price = price;
        this.meat = meat;
    }

    public void addPizzaIngredient1 (String name, double price) {
        this.ingredient1Name = name;
        this.ingredient1Price = price;
    }
    public void addPizzaIngredient2 (String name, double price) {
        this.ingredient2Name = name;
        this.ingredient2Price = price;
    }
    public void addPizzaIngredient3 (String name, double price) {
        this.ingredient3Name = name;
        this.ingredient3Price = price;
    }
    public void addPizzaIngredient4 (String name, double price) {
        this.ingredient4Name = name;
        this.ingredient4Price = price;
    }
    //basic price for pizza
    public double totalPizza () {
        double totalPizzaPrice = this.price;
        System.out.println(this.name + " pizza on " + this.crustType + " crust, with " + this.meat + " price is " + this.price);
        if (this.ingredient1Name != null) {
            totalPizzaPrice += this.ingredient1Price;
            System.out.println("Added " + this.ingredient1Name + " for an extra " + this.ingredient1Price);
        }
        if (this.ingredient2Name != null) {
            totalPizzaPrice += this.ingredient2Price;
            System.out.println("Added " + this.ingredient2Name + " for an extra " + this.ingredient2Price);
        }
        if (this.ingredient3Name != null) {
            totalPizzaPrice +=this.ingredient3Price;
            System.out.println("Added " + this.ingredient3Name + " for an extra " + this.ingredient3Price);
        }
        if (this.ingredient4Name != null) {
            totalPizzaPrice +=this.ingredient4Price;
            System.out.println("Added " + this.ingredient4Name + " for an extra " + this.ingredient4Price);
        }
        return totalPizzaPrice;
        }

    }


