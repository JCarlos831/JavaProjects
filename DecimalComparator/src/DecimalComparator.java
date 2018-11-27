public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
    }

//    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
//        String num1AsString = "";
//        String num2AsString = "";
//        if (num1 < 0) {
//            DecimalFormat df = new DecimalFormat("#.000");
//            df.setRoundingMode(RoundingMode.CEILING);
//            num1AsString = df.format(num1);
//        }
//        else {
//            DecimalFormat df = new DecimalFormat("#.000");
//            df.setRoundingMode(RoundingMode.FLOOR);
//            num1AsString = df.format(num1);
//        }
//
//        if (num2 < 0) {
//            DecimalFormat df = new DecimalFormat("#.000");
//            df.setRoundingMode(RoundingMode.CEILING);
//            num2AsString = df.format(num2);
//        }
//        else {
//            DecimalFormat df = new DecimalFormat("#.000");
//            df.setRoundingMode(RoundingMode.FLOOR);
//            num2AsString = df.format(num2);
//        }
//
//        System.out.println(num1AsString);
//        System.out.println(num2AsString);
//
//        if (num1AsString.equals(num2AsString)) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return ((int) (num1 * 1000) == (int) (num2 * 1000));
    }

}

