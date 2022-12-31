import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String string = "abcd";

        var reverser = new StringReverser();
        var result = reverser.reverse(string);

        System.out.println(result);
    }
}
