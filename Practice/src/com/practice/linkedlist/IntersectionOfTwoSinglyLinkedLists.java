package com.practice.linkedlist;

public class IntersectionOfTwoSinglyLinkedLists {

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
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            if (headA == null || headB == null)
                return null;

            ListNode a = headA;
            ListNode b = headB;

            while (a != b) {
                a = (a == null) ? headB : a.next;
                b = (b == null) ? headA : b.next;
            }

            return a; // or b (both same)
        }
    }

    // Helper to print list from node
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        /*
            Create intersection:

            List A: 1 -> 2 \
                             8 -> 9
            List B:     3  /

        */

        ListNode common = new ListNode(8);
        common.next = new ListNode(9);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = common;

        ListNode headB = new ListNode(3);
        headB.next = common;

        Solution sol = new Solution();
        ListNode intersection = sol.getIntersectionNode(headA, headB);

        System.out.println("Intersection Node:");
        if (intersection != null)
            System.out.println(intersection.val);
        else
            System.out.println("No Intersection");
    }

    /*
     * TIME COMPLEXITY:
     * O(n + m) -> both pointers traverse both lists at most once
     *
     * SPACE COMPLEXITY:
     * O(1) -> no extra space used
     */
}
