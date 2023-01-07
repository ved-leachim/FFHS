import java.util.Arrays;

public class PriorityQueue {

    private int[] elements;
    private int count = 0;
    private int front = 0;
    private int rear = 0;

    public PriorityQueue (int capacity) {
        this.elements = new int[capacity];
    }

    @Override
    public String toString () {
        return Arrays.toString(elements);
    }

    public void enqueue(int element) {
        if (isFull())
            throw new IllegalStateException();

        if (isEmpty()) {
            elements[front] = element;
            count++;
            return;
        }

        var comparerIndex = rear;
        do {
            if (element < elements[comparerIndex]) {
                copyValueOnePlaceAfter(comparerIndex);
                if (comparerIndex == front) {
                    elements[comparerIndex] = element;
                    moveRear();
                    return;
                }
                comparerIndex = getComparerIndex(comparerIndex);
                continue;
            }
            elements[(comparerIndex + 1) % elements.length] = element;
            moveRear();
            return;
        } while (comparerIndex != front - 1);
    }

    private int getComparerIndex(int comparerIndex) {
        // This is needed because in Java the % returns the remainder not the modulus
        // But what the program needs is the modulus (5 - 1) = 4
        // https://stackoverflow.com/questions/5385024/mod-in-java-produces-negative-numbers
        return (((comparerIndex - 1) % elements.length) + elements.length) % elements.length;
    }

    private void moveRear() {
        rear = (rear + 1) % elements.length;
        count++;
    }

    private void copyValueOnePlaceAfter(int comparerIndex) {
        if (comparerIndex + 1 != front)
            elements[(comparerIndex + 1) % elements.length] = elements[comparerIndex];
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        var dequeued = elements[front];
        elements[front] = 0;
        // (front + 1) % elements.length --> Circular Array
        front = (front + 1) % elements.length;
        count--;
        return dequeued;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return elements[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == elements.length;
    }
}
