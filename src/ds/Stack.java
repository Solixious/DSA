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

    @Override
    public String toString() {
        if (this.top == 0) {
            return "";
        }
        int k = this.top;
        StringBuilder sb = new StringBuilder();
        sb.append(stack.get(--k));
        while (k > 0) {
            sb.append(" ---> ").append(stack.get(--k));
        }
        return sb.toString();
    }

    public void push(final T data) {
        validateStackSize();
        this.stack.add(this.top, data);
        this.top++;
    }

    public T pop() {
        validateStackElementExists();
        return this.stack.get(--this.top);
    }

    public T peek() {
        validateStackElementExists();
        return this.stack.get(this.top - 1);
    }

    public Boolean isEmpty() {
        return this.top == 0;
    }

    public Boolean isFull() {
        return Objects.equals(this.top, this.size);
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
        Stack<Integer> integerStack = new Stack<>(3);
        System.out.println(integerStack.isEmpty());
        integerStack.push(1);
        integerStack.push(2);
        System.out.println(integerStack.isFull());
        integerStack.push(3);
        System.out.println(integerStack.isFull());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack.peek());
        System.out.println(integerStack);
        integerStack.push(2);
        System.out.println(integerStack);

        Stack<Float> floatStack = new Stack<>();
        floatStack.push(1.0f);
        floatStack.push(1.3f);
        floatStack.push(1.0f);
        floatStack.push(1.3f);
        System.out.println(floatStack);
        floatStack.pop();
        System.out.println(floatStack);
        floatStack.push(2.0f);
        System.out.println(floatStack);
    }
}
