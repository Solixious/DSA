package ds.queue;

public interface IQueue<T> {
    void enqueue(T data);
    T dequeue();
    Boolean isEmpty();
    Integer size();
}
