package ds.stack.impl;

import ds.linkedlist.model.Node;
import ds.stack.IStack;

public class StackLinkedListImplementation<T> implements IStack<T> {

    private Node<T> top;
    private Integer size;

    public StackLinkedListImplementation() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        if(this.top == null) {
            return "";
        }
        Node<T> k = this.top;
        StringBuilder sb = new StringBuilder();
        sb.append(k.getData());
        while(k.getNext() != null) {
            k = k.getNext();
            sb.append(" ---> ").append(k.getData());
        }
        return sb.toString();
    }

    @Override
    public void push(T data) {
        Node<T> node = new Node<>(data);
        if(this.top != null) {
            node.setNext(this.top);
        }
        this.top = node;
        this.size++;
    }

    @Override
    public T pop() {
        Node<T> popped = this.top;
        this.top = this.top.getNext();
        this.size--;
        return popped.getData();
    }

    @Override
    public T peek() {
        return this.top.getData();
    }

    @Override
    public Boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public Boolean isFull() {
        return false;
    }

    @Override
    public Integer size() {
        return this.size;
    }
}
