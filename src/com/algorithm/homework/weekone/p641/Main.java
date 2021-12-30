package com.algorithm.homework.weekone.p641;

import com.algorithm.homework.weekone.p21.ListNode;

public class Main {
    public static void main(String[] args) {
        MyCircularDeque obj = new MyCircularDeque(5);
        boolean param_1 = obj.insertFront(3);
        boolean param_2 = obj.insertLast(4);
        boolean param_3 = obj.insertFront(2);
        boolean param_4 = obj.insertLast(5);
        boolean param_5 = obj.insertFront(1);
        System.out.println(obj.getFront() + "//" + obj.getRear());
        System.out.println(obj.isFull());

        boolean param_11 = obj.deleteFront();
        boolean param_12 = obj.deleteFront();
        boolean param_13 = obj.deleteFront();
        boolean param_14 = obj.deleteFront();
        boolean param_15 = obj.deleteFront();
        boolean param_7 = obj.isEmpty();
        System.out.println(obj.getFront() + "//" + obj.getRear());
        System.out.println(obj.isEmpty());


        obj.insertLast(5);
        obj.insertLast(6);

        System.out.println(obj.getFront() + "//" + obj.getRear());
        obj.deleteLast();
        obj.deleteLast();
        System.out.println(obj.isEmpty());


    }
}
