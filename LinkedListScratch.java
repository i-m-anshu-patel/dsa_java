import javax.print.attribute.standard.NumberUpSupported;

class LinkedListScratch {
    Node head;
    private int size = 0;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node lastNode = this.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void removeFirst() {
        if (this.head == null) {
            System.out.println("THis list is already empty");
            return;
        }
        this.head = this.head.next;
        this.size--;
    }

    public void removeLast() {
        if (this.head == null) {
            System.out.println("THis list is already empty");
            return;
        }
        this.size--;
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        Node previousNode = this.head;
        Node currentNode = this.head.next;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            previousNode = previousNode.next;
        }
        previousNode.next = null;

    }

    public void addAfter(String data, String after) {
        Node currentNode = this.head;
        while (currentNode.next != null) {
            if (currentNode.data == after) {
                Node newNode = new Node(data);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                this.size++;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void removeAValue(String target) {
        Node prevNode = this.head;
        Node currentNode = this.head.next;
         if (this.head == null) {
            System.out.println("THis list is already empty");
            return;
        }
        this.size--;
        if (prevNode.data == target) {
            this.head = prevNode.next;
            return;
        }
        while (currentNode.next != null) {
            if (currentNode.data == target) {
                prevNode.next = currentNode.next;
                currentNode.next = null;
                return;
            }
            prevNode = prevNode.next;
            currentNode = currentNode.next;
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedListScratch list = new LinkedListScratch();
        list.addFirst("Winner");
        list.addFirst("a");
        list.addFirst("am");
        list.addFirst("I");
        list.printList();
        list.addLast("Ling");
        list.printList();
        list.addFirst("yoooo");
        list.addLast("aiyooooo");
        list.printList();
        list.removeFirst();
        list.removeLast();
        list.printList();
        list.addLast("Village");
        list.printList();
        list.addAfter("of", "Ling");
        list.printList();
        list.removeAValue("Ling");
        list.printList();

    }
}