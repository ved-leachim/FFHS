import java.util.HashMap;
import java.util.Map;

public class CharFinder {

    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        str = str.toLowerCase();
        var chars = str.toCharArray();

        for (char character : chars) {
            var count = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, ++count);
        }

        for (char character : chars)
             if (map.get(character) == 1)
                 return character;

        return Character.MIN_VALUE;
    }
}
