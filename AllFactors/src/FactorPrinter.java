public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6); // 1, 2, 3, 6
        System.out.println("*****************");
        printFactors(32); // 1, 2, 4, 8, 16, 32
        System.out.println("*****************");
        printFactors(10); // 1, 2, 5, 10
        System.out.println("*****************");
        printFactors(-1); // Invalid Value
        System.out.println("*****************");
    }

    public static void printFactors(int number) {
        if (number < 1)
            System.out.println("Invalid Value");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
