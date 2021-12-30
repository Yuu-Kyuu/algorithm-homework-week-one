package com.algorithm.homework.weekone.p641;

public class MyCircularDeque {

    private final int capacity;
    private int length;
    //private int[] data;

    private Node head;
    private Node tail;

    public MyCircularDeque(int k) {
        capacity = k;
    }

    public boolean insertFront(int value) {
        if (length == capacity) {
            return false;
        }
        Node current;
        if (length == 0) {
            current = new Node(value);
            head = current;
            tail = current;
        } else {
            current = new Node(value, head, tail);
            head.prev = current;
            tail.next = current;
            head = current;
        }
        length++;
        return true;
    }

    public boolean insertLast(int value) {
        if (length == capacity) {
            return false;
        }
        Node current;
        if (length == 0) {
            current = new Node(value);
            head = current;
            tail = current;
        } else {
            current = new Node(value, head, tail);
            tail.next = current;
            head.prev = current;
            tail = current;
        }
        length++;
        return true;
    }

    public boolean deleteFront() {
        if (length == 0) {
            return false;
        }
        Node newHead = head.next;
        tail.next = newHead;
        newHead.prev = tail;
        head = newHead;
        length--;
        if (length == 1) {
            tail = newHead;
        }
        return true;
    }

    public boolean deleteLast() {
        if (length == 0) {
            return false;
        }
        Node newTail = tail.prev;
        head.prev = newTail;
        newTail.next = head;
        tail = newTail;
        length--;
        if (length == 1) {
            head = newTail;
        }
        return true;
    }

    public int getFront() {
        if (length == 0) {
            return -1;
        }
        return head.val;
    }

    public int getRear() {
        if (length == 0) {
            return -1;
        }
        return tail.val;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == capacity;
    }


    class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
            next = this;
            prev = this;
        }

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */