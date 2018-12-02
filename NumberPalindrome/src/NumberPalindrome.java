public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        number = Math.abs(number);
        int ogNumber = number;

        while (number > 0) {
            // Extract last digit of a given number
            int lastDigit = number % 10;
            // Increase the place value of reverse by one
            reverse *= 10;
            reverse += lastDigit;
            // Remove last digit of number
            number = number / 10;
        }

        if (ogNumber == reverse)
            return true;
        else
            return false;
    }
}
