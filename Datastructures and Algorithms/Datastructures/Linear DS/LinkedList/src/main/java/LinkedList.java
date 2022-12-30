import java.util.NoSuchElementException;

/**
 * Exercise: Code a singly Linked List from scratch with the following methods
 *  - addFirst
 *  - addLast
 *  - deleteFirst
 *  - deleteLast
 *  - contains
 *  - indexOf
 *  - size
 */

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList(int value) {
        Node initialNode = new Node(value);
        this.first = initialNode;
        this.last = initialNode;
        size++;
    }

    public void addFirst(int value) {
        var newFirst = new Node(value, first);
        first = newFirst;
        size++;
    }

    public void addLast(int value) {
        var newLast = new Node(value);
        if (isEmpty())
            first = last = newLast;
        else {
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    public void deleteFirst() {
        if (isEmpty())
           throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }
        else {
            var second = first.next;
            // The next Reference of the first Node needs to be set to null as well,
            // when a non referenced Object has a reference to another Object,
            // it cannot be removed by the garbage collector
            first.next = null;
            first = second;
        }
        size--;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        // When LL contains only one node
        if (first == last) {
            first = last = null;
        }
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int indexOf (int value) {
        int index = 0;
        var currentNode = first;
        do {
            if (currentNode.value == value)
                return index;
            else {
                index++;
                currentNode = currentNode.next;
            }
        } while (currentNode != null);
        return -1;
    }

    public int size() {
        // Changed from O(n) to O(1)
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var currentNode = first;
        var index = 0;
        while (currentNode != null) {
            array[index++] = currentNode.value;
            currentNode = currentNode.next;
        }
        return array;
    }

    public void reverse() {
        // [10 -> 20 -> 30]
        // [10 <- 20 <- 30]
        var currentNode = first;
        Node previousNode = null;
        Node nextNode = null;
        while (currentNode != null) {
            if (previousNode == null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                // Set next reference of new last node to null
                previousNode.next = null;
                continue;
            }
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        var tempFirst = first;
        first = last;
        last = tempFirst;
    }

    public int getKthFromTheEnd(int k) {
        // [10, 20, 30, 40, 50]
        //           *       *
        if (isEmpty())
            throw new IllegalStateException();

        var kthNode = first;
        var lastNode = first;
        for (int i = 0; i < k - 1; i++) {
            lastNode = lastNode.next;
            if (lastNode == null)
                throw new IllegalArgumentException();
        }
        while (lastNode != last) {
            lastNode = lastNode.next;
            kthNode = kthNode.next;
        }
        return kthNode.value;
    }

    private boolean isEmpty() {
        if (first == null)
            return true;
        else
            return false;
    }

    private Node getPrevious(Node node) {
        var currentNode = first;
        while (currentNode != null) {
            if (currentNode.next == node)
                return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }
    private class Node {
        private int value;
        private Node next;

        public Node() {}

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node nextNode) {
            this.value = value;
            this.next = nextNode;
        }
    }
}
