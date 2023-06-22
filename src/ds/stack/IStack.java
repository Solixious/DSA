package ds.stack;

public interface IStack<T> {
    void push(T data);

    T pop();

    T peek();

    Boolean isEmpty();

    Boolean isFull();

    Integer size();
}
