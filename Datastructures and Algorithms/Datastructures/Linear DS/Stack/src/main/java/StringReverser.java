import java.util.Stack;

public class StringReverser {

    public String reverse(String input) {
        // Return the reversed input String
        if (input == null)
            throw new IllegalArgumentException();

        var stack = new Stack<Character>();
        for (char character : input.toCharArray())
            stack.push(character);

        var reversed = new StringBuffer();
        while (!stack.empty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
