import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        var queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue( 20);
        queue.enqueue(30);
        var start = queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.dequeue();
        queue.enqueue(80);
        System.out.println(start);
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
