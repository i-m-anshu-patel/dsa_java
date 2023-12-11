public class QueueScratch {
    public static class Queue {
        public static int arr[];
        public static int size;
        public static int rear;

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
            this.rear = -1;
        }

        public boolean isEmpty() {
            return this.rear == -1;
        }

        public boolean isFull() {
            return this.rear == this.size - 1;
        }

        public void add(int data) {
            if (this.isFull()) {
                System.out.println("Overflow");
                return;
            }
            this.arr[++this.rear] = data;
        }

        public int remove() {
            if (this.isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < this.rear; i++) {
                arr[i] = arr[i + 1];
            }
            this.rear--;
            return front;
        }

        public int peek() {
            if (this.isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
