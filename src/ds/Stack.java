package ds;

import exception.StackOverflowException;
import exception.StackUnderflowException;

import java.util.ArrayList;
import java.util.Objects;

public class Stack<T> {

    private static final Integer DEFAULT_STACK_SIZE = 16;
    private final ArrayList<T> stack;
    private final Integer size;
    private Integer top;

    public Stack() {
        this.stack = new ArrayList<>();
        this.size = DEFAULT_STACK_SIZE;
        this.top = 0;
    }

    public Stack(final Integer size) {
        this.stack = new ArrayList<>();
        this.size = size;
        this.top = 0;
    }

    public void push(final T data) {
        validateStackSize();
        this.stack.add(data);
        this.top++;
    }

    public T pop() {
        validateStackElementExists();
        T data = this.stack.get(--this.top);
        this.stack.remove(data);
        return data;
    }

    public T peek() {
        validateStackElementExists();
        return this.stack.get(this.top - 1);
    }

    private void validateStackElementExists() {
        if (this.top == 0) {
            throw new StackUnderflowException();
        }
    }

    private void validateStackSize() {
        if (Objects.equals(this.top, this.size)) {
            throw new StackOverflowException();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
