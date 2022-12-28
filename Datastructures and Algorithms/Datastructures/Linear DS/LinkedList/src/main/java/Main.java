public class Main {

    public static void main(String[] args) {
        var numberLinkeList = new LinkedList(10);
        numberLinkeList.addLast(20);
        numberLinkeList.addLast(30);
        numberLinkeList.deleteLast();
        numberLinkeList.addFirst(5);
        System.out.println(numberLinkeList.contains(5));
        System.out.println(numberLinkeList.size());
    }
}