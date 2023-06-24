package ds.stack.impl;

import ds.stack.IStack;
import ds.stack.exception.StackOverflowException;
import ds.stack.exception.StackUnderflowException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StackListImplementation<T> implements IStack<T> {

    private static final Integer DEFAULT_STACK_SIZE = 16;
    private final List<T> stack;
    private final Integer size;
    private Integer top;

    public StackListImplementation() {
        this.stack = new ArrayList<>(DEFAULT_STACK_SIZE);
        this.size = DEFAULT_STACK_SIZE;
        this.top = 0;
    }

    public StackListImplementation(final Integer size) {
        this.stack = new ArrayList<>(size);
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

    @Override
    public void push(final T data) {
        validateStackSize();
        this.stack.add(this.top, data);
        this.top++;
    }

    @Override
    public T pop() {
        validateStackElementExists();
        return this.stack.get(--this.top);
    }

    @Override
    public T peek() {
        validateStackElementExists();
        return this.stack.get(this.top - 1);
    }

    @Override
    public Boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public Boolean isFull() {
        return Objects.equals(this.top, this.size);
    }

    @Override
    public Integer size() {
        return this.stack.size();
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
}
