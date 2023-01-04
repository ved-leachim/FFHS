import java.util.Arrays;

public class Stack {
    private int[] intArray = new int[5];
    private int count = 0;

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(intArray, 0, count);
        return Arrays.toString(content);
    }

    public void push(int number) {
        // Max size of the dynamic Stack is 10
        if (count == 10)
            throw new StackOverflowError();
        if (isStackFull())
            growArray();

        intArray[count++] = number;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();

        return intArray[--count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();

        return intArray[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private boolean isStackFull() {
        return count == intArray.length;
    }

    private void growArray() {
        var copiedArray = new int[(count) * 2];

        for (int i = 0; i < count; i++)
            copiedArray[i] = intArray[i];
        intArray = copiedArray;
    }
}
