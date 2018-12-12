package com.juancmontoya;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Toyota -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}

class Jeep extends Car {
    public Jeep(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Jeep -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Jeep -> accelerate()";
    }

    @Override
    public String brake() {
        return "Jeep -> brake()";
    }
}

class Chevrolet extends Car {
    public Chevrolet(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Chevrolet -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Chevrolet -> accelerate()";
    }

    @Override
    public String brake() {
        return "Chevrolet -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        // We are going back to the car analogy
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic Car class
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and name would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // Show a message for each in the base class.
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // Put all java classes in one file.

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Jeep jeep = new Jeep("Grand Cherokee", 4);
        System.out.println(jeep.startEngine());
        System.out.println(jeep.accelerate());
        System.out.println(jeep.brake());

        Toyota toyota = new Toyota("Corolla", 4);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Chevrolet chevrolet = new Chevrolet("Impala", 4);
        System.out.println(chevrolet.startEngine());
        System.out.println(chevrolet.accelerate());
        System.out.println(chevrolet.brake());
    }
}
