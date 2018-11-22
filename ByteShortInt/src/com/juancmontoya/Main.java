package com.juancmontoya;

public class Main {

    public static void main(String[] args) {
        // 1. Create a byte variable and set it to any valid byte number.

        byte myByte = 30;

        // 2. Create a short variable and set it to any valid short number.

        short myShort = 100;

        // 3. Create an int variable and set it to any valid int number.

        int myInt = 2;
        // 4. Create a variable of type long, and make to equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        long longTotal = 50000L + (10L * (myByte + myShort + myInt));
        short shortTotal = (short) (1000 + (10 * (myByte + myShort + myInt)));

        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
