import java.util.InputMismatchException;

public class GCD {

    public static void main(String[] args) {
        int gcd = gcdOf(0, 12);
        System.out.println(gcd);
    }

    public static int gcdOf(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            throw new InputMismatchException("None of the given numbers must be 0 or negative.");
        }
        if (n1 < n2) {
            int tempSwitch = n1;
            n1 = n2;
            n2 = tempSwitch;
        }
        if (n2 == 0) {
            return n1;
        }
        if (n1 % n2 == 0) {
            return n2;
        }
        return gcdOf(n2, (n1 % n2));
    }
}
