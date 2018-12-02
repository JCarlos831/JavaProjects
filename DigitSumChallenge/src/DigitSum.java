public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(12514567));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10)
            return -1;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }

        return sum;
    }
}
