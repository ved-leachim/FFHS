import java.util.HashMap;
import java.util.Stack;

public class BalancedBracketsChecker {

    public boolean isBalanced(String input) {
        var stackOfBrackets = new Stack<Character>();

        var brackets = new HashMap<Character, Character>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put('>', '<');

        for (char character : input.toCharArray()) {
            if (brackets.containsValue(character)) {
                stackOfBrackets.push(character);
                continue;
            }
            if (brackets.containsKey(character)) {
                if (stackOfBrackets.peek() == brackets.get(character)) {
                    if (stackOfBrackets.isEmpty())
                        return false;
                    stackOfBrackets.pop();
                    continue;
                }
                return false;
            }
        }
        return stackOfBrackets.isEmpty();
    }
}
