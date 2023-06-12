package ds;

import exception.StackOverflowException;
import exception.StackUnderflowException;

import java.util.ArrayList;
import java.util.Objects;

public class Stack<T> {

    private final ArrayList<T> stack;
    private final Integer size;
    private Integer top;

    public Stack(final Integer size) {
        this.stack = new ArrayList<>();
        this.size = size;
        this.top = 0;
    }

    public void push(final T data) {
        validateStackSize();
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

    private void validateStackSize() {
        if(Objects.equals(top, size)) {
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
