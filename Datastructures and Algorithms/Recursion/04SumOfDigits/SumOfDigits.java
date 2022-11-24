import java.util.InputMismatchException;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = sumOfDigits(3243);
        System.out.println(sum);
    }

    public static int sumOfDigits(int n) {
        if (n < 0) {
            throw new InputMismatchException("Input must not be negative.");
        }
        if (n == 0) {
            return 0;
        }
        return sumOfDigits(n / 10) + (n % 10);
    }
}