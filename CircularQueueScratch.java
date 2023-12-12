public class CircularQueueScratch {
    public static class Queue {
        public int arr[];
        public int size;
        public int front = -1;
        public int rear = -1;

        Queue(int size){
            this.size = size;
            this.arr = new int[size];
        }

        public boolean isEmpty() {
            return this.rear == -1 && this.front == -1;
        }

        public boolean isFull(){
            return (this.rear+1)%this.size == this.front;
        }

        public void add(int data) {
            if(this.isFull()){
                System.out.println("Overflow");
                return;
            }
            if (this.front == -1) {
                this.front = 0;
            }
            this.rear = (this.rear+1)%size;
            this.arr[this.rear] = data;
        }

        public int remove(){
            if(this.isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int removedItem = this.arr[front];

            if (this.front == this.rear) {
              this.front = this.rear = -1;  
            }
            else{
                this.front = (this.front+1)%size;
            }

            return removedItem;
        }

        public int peek(){
            if(this.isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return this.arr[this.front];
        }
        
    }
    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
 
 
        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
 
}
