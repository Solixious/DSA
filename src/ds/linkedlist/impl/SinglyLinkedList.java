package ds.linkedlist.impl;

import ds.linkedlist.ILinkedList;
import ds.linkedlist.ILinkedListIterator;
import ds.linkedlist.exception.LinkedListIndexOutOfBounds;
import ds.linkedlist.model.Node;

public class SinglyLinkedList<T> implements ILinkedList<T> {

    private final Node<T> head;
    private Integer size;

    public SinglyLinkedList() {
        this.head = new Node<>();
        this.size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HEAD");
        Node<T> itr = this.head;
        while (itr.getNext() != null) {
            itr = itr.getNext();
            sb.append(" ---> ").append(itr.getData());
        }
        return sb.toString();
    }

    @Override
    public void append(T data) {
        final Node<T> node = new Node<>(data);
        Node<T> itr = this.head;
        while (itr.getNext() != null) {
            itr = itr.getNext();
        }
        itr.setNext(node);
        this.size++;
    }

    @Override
    public void insert(T data, int index) {
        if (index > this.size || index < 0) {
            throw new LinkedListIndexOutOfBounds();
        }
        final Node<T> node = new Node<>(data);
        Node<T> itr = this.head;
        for (int i = 0; i < index; i++) {
            itr = itr.getNext();
        }
        node.setNext(itr.getNext());
        itr.setNext(node);
        this.size++;
    }

    @Override
    public T delete(int index) {
        if (index > this.size || index < 0) {
            throw new LinkedListIndexOutOfBounds();
        }
        Node<T> itr = this.head;
        Node<T> prev = this.head;
        for (int i = 0; i <= index; i++) {
            prev = itr;
            itr = itr.getNext();
        }
        prev.setNext(itr.getNext());
        this.size--;
        return itr.getData();
    }

    @Override
    public T get(int index) {
        if (index > this.size || index < 0) {
            throw new LinkedListIndexOutOfBounds();
        }
        Node<T> itr = this.head;
        for (int i = 0; i <= index; i++) {
            itr = itr.getNext();
        }
        return itr.getData();
    }

    @Override
    public Integer getSize() {
        return this.size;
    }

    @Override
    public ILinkedListIterator<T> iterator() {
        return new SinglyLinkedListIterator<>(this.head);
    }

    private static class SinglyLinkedListIterator<T> implements ILinkedListIterator<T> {

        private Node<T> current;

        public SinglyLinkedListIterator(Node<T> head) {
            this.current = head;
        }

        @Override
        public T next() {
            if (current == null) {
                throw new LinkedListIndexOutOfBounds();
            }
            this.current = this.current.getNext();
            return this.current.getData();
        }

        @Override
        public Boolean hasNext() {
            return current.getNext() != null;
        }
    }
}
