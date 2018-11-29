package com.juancmontoya;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
	    getDurationString(80, 67);
	    getDurationString(65, 45);
	    getDurationString(3660);
	    getDurationString(3945);
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value");
            return INVALID_VALUE_MESSAGE;
        }

        int secondsToMinutes = (int) Math.floor(seconds / 60);

        minutes += secondsToMinutes;
        int remainingSeconds = seconds % 60;

        String secondsString = remainingSeconds + "s";
        if (remainingSeconds < 10)
            secondsString = "0" + secondsString;

        int hours = (int) Math.floor(minutes / 60);
        int remainingMinutes = minutes % 60;

        String minutesString = remainingMinutes + "m ";
        if (remainingMinutes < 10)
            minutesString = "0" + minutesString;

        String hoursString = hours + "h ";
        if (hours < 10)
            hoursString = "0" + hoursString;

        System.out.println(hoursString + minutesString + secondsString);
        return (hoursString + minutesString + secondsString);
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = (int) Math.floor(seconds / 60);
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
