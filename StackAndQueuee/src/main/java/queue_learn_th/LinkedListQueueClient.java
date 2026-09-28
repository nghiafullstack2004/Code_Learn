package queue_learn_th;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLindedListQueue queue=new MyLindedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is: "+queue.dequeue().key);
    }
}
