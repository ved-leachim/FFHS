public class Main {

    public static void main(String[] args) {
        var numberLinkeList = new LinkedList(10);
        numberLinkeList.addLast(20);
        numberLinkeList.addLast(30);
        numberLinkeList.deleteLast();
        System.out.println(numberLinkeList.contains(10));
    }
}