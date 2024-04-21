package junit;

public class DivideCalculator {
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Invalid Denominator.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int result = divide(1,0);
        System.out.println(result);
    }
}
