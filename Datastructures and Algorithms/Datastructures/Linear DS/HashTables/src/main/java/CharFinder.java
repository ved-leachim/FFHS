import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public char findFirstRepeatingChar(String str) {
        Set<Character> set = new HashSet<>();

        for (var character : str.toCharArray()) {
            if (set.contains(character))
                return character;

            set.add(character);
        }
        return Character.MIN_VALUE;
    }
}
