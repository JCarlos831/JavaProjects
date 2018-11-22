package com.juancmontoya;

public class Main {

    public static void main(String[] args) {
        // Data types for whole numbers

        // int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte) (myMinByteValue/ 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShortValue = (short) (myMinShortValue/2);

        // long has a width of 64
        long myLongValue = 100L;
    }
}
