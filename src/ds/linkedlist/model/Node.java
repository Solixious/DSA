package ds.linkedlist.model;

public class Node<T> {

    private T data;
    private Node<T> next;

    public Node() {
        this.data = null;
        this.next = null;
    }

    public Node(final T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return this.data;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
