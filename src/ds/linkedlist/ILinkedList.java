package ds.linkedlist;

public interface ILinkedList<T> {
    void append(T data);
    void insert(T data, int index);
    T delete(int index);
    T get(int index);
    Integer getSize();
}
