import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        var queue = new StackQueue();
        queue.enqueue(10);
        queue.enqueue( 20);
        queue.enqueue(30);
        var start = queue.dequeue();
        queue.dequeue();
        System.out.println(start);
        queue.enqueue(40);
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        // [10, 20, 30]
        // [30, 20, 10]
        // Only Methods allowed are: add(), remove() and isEmpty()

        var stack = new Stack<Integer>();

        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());

        System.out.println(queue);
    }
}
