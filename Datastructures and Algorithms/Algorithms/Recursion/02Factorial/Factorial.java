import java.util.InputMismatchException;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(-1));
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new InputMismatchException("n cannot be negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
