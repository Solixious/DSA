package ds;

import exception.StackUnderflowException;

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
        validateStackElementExists();
        T data = stack.get(--top);
        stack.remove(data);
        return data;
    }

    public T peek() {
        validateStackElementExists();
        return stack.get(top - 1);
    }

    private void validateStackElementExists() {
        if(top == 0) {
            throw new StackUnderflowException();
        }
    }
}
