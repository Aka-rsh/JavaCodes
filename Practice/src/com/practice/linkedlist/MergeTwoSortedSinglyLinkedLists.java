package com.practice.linkedlist;

public class MergeTwoSortedSinglyLinkedLists {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Solution
    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode preHead = new ListNode(-1);
            ListNode prev = preHead;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    prev.next = list1;
                    list1 = list1.next;
                } else {
                    prev.next = list2;
                    list2 = list2.next;
                }
                prev = prev.next;
            }

            prev.next = (list1 == null) ? list2 : list1;

            return preHead.next;
        }
    }

    // Helper function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // List1: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // List2: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        Solution sol = new Solution();
        ListNode merged = sol.mergeTwoLists(list1, list2);

        System.out.println("Merged Sorted List:");
        printList(merged);
    }

    /*
     * TIME COMPLEXITY:
     * O(n + m) -> each node from both lists is visited once
     *
     * SPACE COMPLEXITY:
     * O(1) -> only pointers used, no extra data structure
     */
}
