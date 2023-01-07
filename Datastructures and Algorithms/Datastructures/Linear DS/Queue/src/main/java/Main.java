import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        var queue = new PriorityQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        System.out.println(queue.peek());
        queue.enqueue(50);
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(45);
        queue.enqueue(30);
        System.out.println(queue.peek());
        queue.dequeue();
        queue.enqueue(46);
        System.out.println(queue.peek());
        System.out.println(queue.toString());


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
