package com.juancmontoya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("The sum of the 10 numbers entered is " + sum);
        scanner.close();
    }
}
