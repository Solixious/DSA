package ds;

import java.util.ArrayList;
import java.util.Objects;

public class Queue<T> {

    private static final Integer DEFAULT_QUEUE_SIZE = 16;
    private final ArrayList<T> queue;
    private final Integer size;
    private Integer front;
    private Integer rear;

    public Queue() {
        this.queue = new ArrayList<>();
        this.size = DEFAULT_QUEUE_SIZE;
        this.front = 0;
        this.rear = 0;
    }

    public Queue(final Integer size) {
        this.queue = new ArrayList<>();
        this.size = size;
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(final T data) {

    }

    public T dequeue() {
        return null;
    }

    public T peek() {
        return null;
    }

    public Boolean isEmpty() {
        return Objects.equals(this.front, this.rear);
    }

    public Boolean isFull() {
        return (this.front == 0 && this.rear == this.size - 1) || (this.front == this.rear + 1);
    }
}
