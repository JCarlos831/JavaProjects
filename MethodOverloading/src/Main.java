public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Juan", 500);
//        System.out.println("The new score is " + newScore);
//        calculateScore(75);
//        calculateScore();

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters
        // feet is the first parameter, inches is the second parameter

        // You should validate that the first parameter feet is >= 0
        // You should validate that the second parameter inches is >=0 and <=12
        // Return -1 from the method if either of the above is not true

        // If the parameters are valid, then calculate how many centimeters
        // comprise the feet and inches passed to this method and return that
        // value.

        // Create a second method of the same name but with only one parameter.
        // inches is the parameter
        // Validate that it is >= 0
        // return -1 if it is not true
        // But if it is valid, then calculate how many feet are in the inches
        // and then here is the tricky part,
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Using double for your number Datatypes is probably a good idea
        // 1 inch = 2.54cm and one foot = 12 inches
        // Use the link provided to confirm you code is calculating correctly.
        // Calling another overloaded method just requires you to use the right
        // number of parameters.

        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(-5, 6);
        calcFeetAndInchesToCentimeters(66);
        calcFeetAndInchesToCentimeters(-66);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || inches < 0 || inches > 12 ) {
            System.out.println("Invalid feet or inches");
            return -1;
        }
        double centimeters = ((feet * 12d) * 2.54d) + (inches * 2.54d);
        System.out.println(centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches");
            return -1;
        }

        double inchesToFeet = Math.floor(inches / 12);
        double remainderInches = inches % 12;

        double centimeters = calcFeetAndInchesToCentimeters(inchesToFeet, remainderInches);

        System.out.println(centimeters + "cm");
        return centimeters;
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name. No player score");
//        return 0;
//    }
}
