public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        System.out.println("**********");
        numberToWords(1010);
        System.out.println("**********");
        numberToWords(1000);
        System.out.println("**********");
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");

        int reversed = reverse(number);
        int ogReversed = reversed;

        while (reversed > 0) {

            int digit = reversed % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            reversed /= 10;
        }

        int numOfZeros = getDigitCount(number) - getDigitCount(ogReversed);

        for (int i = 1; i <= numOfZeros; i++)
            System.out.println("Zero");
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;

        if (number < 0)
            return -1;

        if (number < 10)
            return 1;

        while (number > 0) {
            number /= 10;
            digitCount++;
        }

        return digitCount;
    }
}
