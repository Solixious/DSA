package model;

public class Node<T> {

    private T data;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(final T data) {
        this.data = data;
    }
}
