import java.util.*;

public class StackScratchArrayList {
    ArrayList <Integer> list;
    StackScratchArrayList(){
        ArrayList <Integer> list = new ArrayList<Integer>();
    }

    public void push(int data) {
        this.list.add(data);
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
       int top = this.list.get(this.list.size()-1);
       this.list.remove(top);
       return top;
    }

    public int peek() {
        return this.list.get(this.list.size()-1);
    }

    public boolean isEmpty() {
        return (this.list.size() == 0);
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
