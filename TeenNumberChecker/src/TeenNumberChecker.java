//Teen Number Checker
//
//A "teen" is in the range of 13 - 19 (inclusive)
//Write a method isTeen with 3 parameters of type int
//
//The method should return boolean and it needs to return true if one of
//the parameters is in range 13 (inclusive) - 19 (inclusive). Otherwise
//return false.

public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
    }

    public static boolean hasTeen(int x, int y, int z) {
        return ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19));
    }

}
