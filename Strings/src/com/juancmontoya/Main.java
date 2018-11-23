package com.juancmontoya;

public class Main {

    public static void main(String[] args) {
	    // 8 different primitive data types in Java:
        // byte, int, short, long, float, double, boolean, and char
        // string is like the 9th primitive data because it is used
        // so often, but is not. A String is a class

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2018";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString value: " + lastString);
    }
}
