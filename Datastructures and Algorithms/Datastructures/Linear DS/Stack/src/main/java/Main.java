public class Main {
    public static void main(String[] args) {
        // String Reverser
        String string = "abcd";

        var reverser = new StringReverser();
        var result = reverser.reverse(string);

        System.out.println(result);

        // BalancedBracketsChecker
        String str = "(1(2[a[b{c{d<ee<ff>gg>hh}11}22]33]44)5!)";
        var bracketsChecker = new BalancedBracketsChecker();
        System.out.println(bracketsChecker.isBalanced(str));

        // Custom Stack Class
        var numberStack = new Stack();
        numberStack.push(10);
        numberStack.push(20);
        System.out.println(numberStack);
        System.out.println("Peek: " + numberStack.peek());
        System.out.println("IsEmpty: " + numberStack.isEmpty());
        System.out.println("Pop: " + numberStack.pop());
        System.out.println("Peek: " + numberStack.peek());
        System.out.println("Pop: " + numberStack.pop());
        System.out.println("IsEmpty: " + numberStack.isEmpty());
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);
        numberStack.push(40);
        numberStack.push(50);
        numberStack.push(60);
        numberStack.push(70);
        numberStack.push(80);
        numberStack.push(90);
        numberStack.push(100);
        System.out.println(numberStack);
        System.out.println("Peek: " + numberStack.peek());
    }
}
