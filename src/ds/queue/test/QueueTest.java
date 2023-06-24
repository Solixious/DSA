package ds.queue.test;

import ds.queue.IQueue;
import ds.queue.impl.QueueListImplementation;

public class QueueTest {
    public static void main(String[] args) {
        IQueue<Integer> integerQueue = new QueueListImplementation<>();
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);
        System.out.println(integerQueue);
        System.out.println(integerQueue.dequeue());
        System.out.println(integerQueue);
    }
}
