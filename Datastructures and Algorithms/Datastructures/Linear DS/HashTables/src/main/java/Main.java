import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "Programming is awesome";
        var charFinder = new CharFinder();
        var character = charFinder.findFirstRepeatingChar(str);
        System.out.println(character);
    }
}
