package Lesson5;

public class RecExponentiation {

    public static double recExponentiation(double x, int y) {
        if (y == 1) {
            return x;
        }
        return recExponentiation(x, y - 1) * x;
    }
}
