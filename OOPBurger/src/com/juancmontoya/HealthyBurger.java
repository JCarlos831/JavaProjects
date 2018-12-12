package com.juancmontoya;

public class HealthyBurger extends Hamburger {
    private String healthyTopping1Name;
    private double healthyTopping1Price;

    private String healthyTopping2Name;
    private double healthyTopping2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye");
    }

    public void addHealthyTopping1(String name, double price) {
        this.healthyTopping1Name = name;
        this.healthyTopping1Price = price;
    }

    public void addHealthyTopping2(String name, double price) {
        this.healthyTopping2Name = name;
        this.healthyTopping2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (healthyTopping1Name != null) {
            hamburgerPrice += this.healthyTopping1Price;
            System.out.println("Added " + this.healthyTopping1Name + " for an extra " + this.healthyTopping1Price);
        }

        if (healthyTopping2Name != null) {
            hamburgerPrice += this.healthyTopping2Price;
            System.out.println("Added " + this.healthyTopping2Name + " for an extra " + this.healthyTopping2Price);
        }

        return hamburgerPrice;
    }
}
