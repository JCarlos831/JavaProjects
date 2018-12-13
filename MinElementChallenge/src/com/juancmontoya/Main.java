package com.juancmontoya;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();6

        int[] values = readIntegers(count);
        findMin(values);
    }

    private static int[] readIntegers(int count) {
        System.out.println("Please enter " + count + " positive integers \r");
        int[] myArray = new int[count];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum value of the array is " + min);
        return min;
    }
}
