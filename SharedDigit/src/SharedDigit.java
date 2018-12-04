// each number should be within the range 0f 10 (inclusive) - 99 (inclusive). If one of the methods is not within
// range, the method should return false.

// The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise
// the method should return false.

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true

    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99))
            return false;
        int xFirstDigit = x / 10;
        int xSecondDigit = x % 10;
        int yFirstDigit = y / 10;
        int ySecondDigit = y % 10;

        if (xFirstDigit == yFirstDigit || xFirstDigit == ySecondDigit || xSecondDigit == yFirstDigit || xSecondDigit == ySecondDigit)
            return true;
        else
            return false;
    }
}
