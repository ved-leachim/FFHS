import java.util.NoSuchElementException;

/**
 * Exercise: Code a singly Linked List from scratch with the following methods
 *  - addFirst
 *  - addLast
 *  - deleteFirst
 *  - deleteLast
 *  - contains
 *  - indexOf
 */

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList(int value) {
        Node initialNode = new Node(value);
        this.first = initialNode;
        this.last = initialNode;
    }

    public void addFirst(int value) {
        var newFirst = new Node(value, first);
    }

    public void addLast(int value) {
        var newLast = new Node(value);
        if (isEmpty())
            first = last = newLast;
        else {
            last.next = newLast;
            last = newLast;
        }
    }

    public void deleteFirst() {
        if (isEmpty())
           throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        // The next Reference of the first Node needs to be set to null as well,
        // when a non referenced Object has a reference to another Object,
        // it cannot be removed by the garbage collector
        first.next = null;
        first = second;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        // When LL contains only one node
        if (first == last) {
            first = last = null;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;
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
