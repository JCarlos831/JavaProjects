// Flour Pack Problem
// Write a method named canPack with three parameters of type int name bigCount, smallCount, and goal.

// The parameter bigCount represents the count og big flour bags (5 kilo each).
// The parameter smallCount represents the count of small flour bags (1 kilo each).
// The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

// Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method
// should return true if it is possible to make a package with goal kilos of flour.

// If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9,
// bigCount = 2, and smallCount = 0, the method should return false because each bigCount bag is 5 kilos and cannot be
// divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because 1 full bigCount
// bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.

// If any of the parameters are negative return false.

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 12)); // true
        System.out.println(canPack(-3, 2, 12)); // false
        System.out.println(canPack(2, 1, 5)); // true
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0) || ((bigCount * 5) + smallCount) < goal
        || (goal < 5 && smallCount == 0) || (goal % 5 > smallCount)) {
            return false;
        } else {
            return true;
        }

    }
}
