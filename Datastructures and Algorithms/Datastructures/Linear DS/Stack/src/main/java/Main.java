import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /* String Reverser
        String string = "abcd";

        var reverser = new StringReverser();
        var result = reverser.reverse(string);

        System.out.println(result);
        */

        // BalancedBracketsChecker
        String str = "(1(2[a[b{c{d<ee<ff>gg>hh}11}22]33]44)5!)";
        var bracketsChecker = new BalancedBracketsChecker();
        System.out.println(bracketsChecker.isBalanced(str));
    }
}
