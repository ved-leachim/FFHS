import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var numberList = new LinkedList(10);
        numberList.addLast(20);
        numberList.addLast(30);
        numberList.addLast(40);
        numberList.deleteFirst();
        var array = numberList.toArray();
        System.out.println(Arrays.toString(array));
        numberList.reverse();
        var reversedArray = numberList.toArray();
        System.out.println(Arrays.toString(reversedArray));
    }
}