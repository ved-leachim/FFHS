import java.util.InputMismatchException;

public class PowerOfNumber {

    public static void main(String[] args) {
        int pow = powerOfNumber(2, 6);
        System.out.println(pow);
    }

    public static int powerOfNumber(int base, int exponent) {
        if (exponent < 0) {
            throw new InputMismatchException("Exponent must not be negative.");
        }
        if (exponent == 0) {
            return 1;
        }
        return powerOfNumber(base, exponent - 1) * base;
    }
}
