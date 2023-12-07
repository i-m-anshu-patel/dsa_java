import java.util.Stack;

public class StackScratchLinkedList {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        Node top = this.head;
        this.head = this.head.next;
        return top.data;
    }

    public int peek() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.head.data;
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    public static void main(String args[]) {
        StackScratchLinkedList stack = new StackScratchLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }

}
