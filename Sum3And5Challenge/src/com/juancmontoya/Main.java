package com.juancmontoya;

public class Main {

    public static void main(String[] args) {
        // Create a for statement using a range of numbers from 1 to 1000 inclusive
        // Sum all the numbers that can be divided with both 3 and also with 5
        // For those numbers that met the above conditions, print out the number
        // break out of the loop once you find 5 numbers that met the above condition
        // After breaking out of the loop, print the sum of the numbers that met the the above
        // conditions
        // Note: Type all code in the main method.

        int sumOfNumbers = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " can be divided by both 3 and 5.");
                count++;
                sumOfNumbers += i;
                if (count == 5)
                    break;
            }
        }
        System.out.println("The sum of the numbers that are divisible by 3 and 5 is " + sumOfNumbers);
    }
}
