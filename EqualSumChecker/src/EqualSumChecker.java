//Equal Sum Checker
//
//Write a method hasEqualSum with 3 parameters of type int
//The method should return boolean and it needs to be true if sum of first
//and second parameter is equal to third parameter. Otherwise return false.


public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,0);
    }

    public static boolean hasEqualSum(int x, int y, int z) {
        return ((x + y) == z);
    }
}