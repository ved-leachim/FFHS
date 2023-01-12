import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var ht = new HashTable();
        ht.put(0, "Value 1");
        ht.put(1, "Value 2");
        ht.put(2, "Value 3");
        ht.put(3, "Value 4");
        ht.put(4, "Value 5");
        ht.put(5, "Value 6");
        String val1 = ht.get(0);
        System.out.println(val1);
        ht.put(0, "Value 11");
        val1 = ht.get(0);
        String val2 = ht.get(1);
        String val5 = ht.get(5);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val5);
        ht.remove(0);
        val1 = ht.get(0);
        System.out.println(val1);
    }
}
