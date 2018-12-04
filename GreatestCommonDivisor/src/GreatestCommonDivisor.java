public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15)); // 5
        System.out.println(getGreatestCommonDivisor(12, 30)); // 6
        System.out.println(getGreatestCommonDivisor(9, 18)); // -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // 9
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int largestCommonDivisor = 0;

        for (int i = 1; i <= first; i++) {
            if ((first % i == 0) && (second % i == 0))
                largestCommonDivisor = i;
        }

        return largestCommonDivisor;
    }
}
