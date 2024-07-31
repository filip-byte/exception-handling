package exercises;

public class Exercise1 {

    public static double divide (int int1, int int2) {

        if (int2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        double resultOfDivision = (double) int1/ int2;

        return resultOfDivision;
    }

}
