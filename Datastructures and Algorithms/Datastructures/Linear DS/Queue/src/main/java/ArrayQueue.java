import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ArrayQueue {

    private int[] array;
    private int start = 0;
    private int end = 0;
    private int count = 0;

    public ArrayQueue() {}

    public ArrayQueue(int capacity) {
        array = new int[capacity];
    }

    public ArrayQueue(int @NotNull ... numbers) {
        if (numbers.length > 5)
            throw new IllegalArgumentException("Array Queue cannot have more than 5 numbers");
        array = numbers;
        this.count = numbers.length;
        this.end = numbers.length - 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public void enqueue(int number) {
        if (isFull())
            throw new IllegalStateException();

        array[end] = number;
        end = (end + 1) % array.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        var element = array[start];
        array[start] = 0;
        start = (start + 1) % array.length;
        count--;
        return element;
    }

    public int peek() {
        return array[start];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == array.length;
    }

}
