package ds.queue.impl;

import ds.queue.IQueue;

import java.util.ArrayList;
import java.util.List;

public class QueueListImplementation<T> implements IQueue<T> {
    private final List<T> queue;

    public QueueListImplementation() {
        this.queue = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(this.queue.size() > 0) {
            sb.append(this.queue.get(0));
            for(int i = 1; i < this.queue.size(); i++) {
                sb.append(" ---> ").append(this.queue.get(i));
            }
        }
        return sb.toString();
    }

    @Override
    public void enqueue(T data) {
        this.queue.add(data);
    }

    @Override
    public T dequeue() {
        return this.queue.remove(0);
    }

    @Override
    public Boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public Integer size() {
        return this.queue.size();
    }
}
