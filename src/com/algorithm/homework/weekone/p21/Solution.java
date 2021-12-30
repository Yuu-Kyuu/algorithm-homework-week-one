package com.algorithm.homework.weekone.p21;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-101);
        ListNode start = result;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                start.next = list1;
                list1 = list1.next;
            } else {
                start.next = list2;
                list2 = list2.next;
            }
            start = start.next;
        }
        start.next = list1 == null ? list2 : list1;
        return result.next;
    }
}