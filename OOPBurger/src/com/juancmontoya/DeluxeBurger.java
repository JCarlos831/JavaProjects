package com.juancmontoya;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Ground Beef & Bacon", 8.99, "White");
        super.addHamburgerTopping1("Fries", 2.50);
        super.addHamburgerTopping2("Medium Soda", 1.25);
    }

    @Override
    public void addHamburgerTopping1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerTopping2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerTopping3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerTopping4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
