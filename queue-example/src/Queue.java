import static sun.util.locale.LocaleUtils.isEmpty;

public class Queue {
    int capacity;
    int front;
    int rear;
    int[] queue;

    public Queue(int capacity, int front, int rear) {
        this.capacity = capacity;
        this.front = front;
        this.rear = rear;
        queue = new int[capacity];
    }

    void enQueue(int element) {
        if (isFull()){
            System.out.println("The queue is full !!");
            return;
        }else{
            if (front==-1){
                front = 0;
            }
            rear++;
            queue[rear]=element;
            System.out.println("The element " + element +" is added");
            printQueue();
        }
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        int element = queue[front];
        queue[front]=0;
        if (front==rear){
            front=-1;
            rear=-1;
        }else {
            front++;
        }
        System.out.println("The element " + element + " removed");
        printQueue();
        return element;
    }

     boolean isEmpty() {
        return front == -1;
    }
    private boolean isFull() {
        return rear == (capacity-1);
    }
    void printQueue() {
        System.out.println("-------------" + "Queue content is: " + "-------------");

        for (int j : queue) {
            System.out.println(j+ "\t");
        }
        System.out.println("\n--------------------------------------");
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3,-1,-1);
        queue.dequeue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }

}