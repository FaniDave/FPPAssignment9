package Day9.Assignment;

import java.util.EmptyStackException;

public class LinkedListStack {

    // Node class for LinkedList
    private static class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    // private fields
    private Node top;
    private int size;

    // Constructor
    public LinkedListStack() {
        top = null;
        size = 0;
    }

    // push method
    public void push(Object item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // pop method
    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        Object itemToBeRemoved = top.data;
        top = top.next;
        size--;
        return itemToBeRemoved;
    }

    // peek method
    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == null;
    }

    // size method
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size of stack: " + stack.size()); // Should print 3
        System.out.println("Peek: " + stack.peek()); // Should print 3

        System.out.println("Popped: " + stack.pop()); // Should print 3
        System.out.println("Popped: " + stack.pop()); // Should print 2

        System.out.println("Size of stack after pops: " + stack.size()); // Should print 1
        System.out.println("Peek after pops: " + stack.peek()); // Should print 1
    }
}
