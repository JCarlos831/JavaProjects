package com.juancmontoya;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String healthyTopping1;
    private double topping1Price;

    private String topping2Name;
    private double topping2Price;

    private String topping3Name;
    private double topping3Price;

    private String topping4Name;
    private double topping4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerTopping1(String name, double price) {
        this.healthyTopping1 = name;
        this.topping1Price = price;
    }

    public void addHamburgerTopping2(String name, double price) {
        this.topping2Name = name;
        this.topping2Price = price;
    }

    public void addHamburgerTopping3(String name, double price) {
        this.topping3Name = name;
        this.topping3Price = price;
    }

    public void addHamburgerTopping4(String name, double price) {
        this.topping4Name = name;
        this.topping4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.printf("The price of a %s burger with %s on a %s roll is %s%n", this.name,
                            this.meat, this.breadRollType, this.price);

        if (healthyTopping1 != null) {
            hamburgerPrice += this.topping1Price;
            System.out.println("Added " + this.healthyTopping1 + " for an extra " + this.topping1Price);
        }

        if (topping2Name != null) {
            hamburgerPrice += this.topping2Price;
            System.out.println("Added " + this.topping2Name + " for an extra " + this.topping2Price);
        }

        if (topping3Name != null) {
            hamburgerPrice += this.topping1Price;
            System.out.println("Added " + this.topping3Name + " for an extra " + this.topping3Price);
        }

        if (topping4Name != null) {
            hamburgerPrice += this.topping4Price;
            System.out.println("Added " + this.topping4Name + " for an extra " + this.topping4Price);
        }

        return hamburgerPrice;
    }
}