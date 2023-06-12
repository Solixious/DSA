package model;

public class Node<T> {

    private T data;

    public Node() {
        this.data = null;
    }

    public Node(final T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(final T data) {
        this.data = data;
    }
}
