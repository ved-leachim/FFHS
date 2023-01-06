import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stackRear = new Stack<>();
    private Stack<Integer> stackFront = new Stack<>();

    @Override
    public String toString () {
        while (!stackRear.isEmpty())
            stackFront.push(stackRear.pop());

        return Arrays.toString(stackFront.toArray());
    }

    public void enqueue(int element) {
        while (!stackRear.isEmpty())
            stackFront.push(stackRear.pop());

        stackFront.push(element);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        while (!stackFront.isEmpty())
            stackRear.push(stackFront.pop());

        return stackRear.pop();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        while (!stackFront.isEmpty())
            stackRear.push(stackFront.pop());

        return stackRear.peek();
    }

    public boolean isEmpty() {
        return stackRear.isEmpty() && stackFront.isEmpty();
    }
}


