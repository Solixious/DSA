package ds.linkedlist.test;

import ds.linkedlist.ILinkedList;
import ds.linkedlist.impl.SinglyLinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        ILinkedList<Integer> integerLinkedList = new SinglyLinkedList<>();
        System.out.println(integerLinkedList.getSize());
        integerLinkedList.insert(10, 0);
        integerLinkedList.append(20);
        integerLinkedList.append(30);
        integerLinkedList.insert(15, 1);
        integerLinkedList.insert(35, 4);
        integerLinkedList.insert(5, 0);
        System.out.println(integerLinkedList);
        integerLinkedList.delete(5);
        System.out.println(integerLinkedList);
        integerLinkedList.delete(0);
        System.out.println(integerLinkedList);
        integerLinkedList.delete(1);
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.get(1));
        System.out.println(integerLinkedList.getSize());
    }
}
