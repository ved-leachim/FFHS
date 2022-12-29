import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var numberLinkeList = new LinkedList(10);
        System.out.println(numberLinkeList.size());
        numberLinkeList.deleteFirst();
        numberLinkeList.addLast(20);
        numberLinkeList.addLast(30);
        numberLinkeList.deleteLast();
        numberLinkeList.addFirst(5);
        System.out.println(numberLinkeList.contains(5));
        System.out.println(numberLinkeList.size());
        var array = numberLinkeList.toArray();
        System.out.println(Arrays.toString(array));
    }
}