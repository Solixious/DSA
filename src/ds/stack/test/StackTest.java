package ds.stack.test;

import ds.stack.IStack;
import ds.stack.impl.StackArrayListImplementation;

public class StackTest {

    public static void main(String[] args) {
        integerStackTest();
        floatStackTest();
    }

    public static void integerStackTest() {
        IStack<Integer> integerStack = new StackArrayListImplementation<>(3);
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
    }

    public static void floatStackTest() {
        IStack<Float> floatStack = new StackArrayListImplementation<>();
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
