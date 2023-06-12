package ds;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack;
    private Integer top;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(T data) {
        stack.add(data);
        top++;
    }

    public T pop() {
        T data = stack.get(top - 1);
        stack.remove(--top);
        return data;
    }

    public T peek() {
        return stack.get(top - 1);
    }
}
