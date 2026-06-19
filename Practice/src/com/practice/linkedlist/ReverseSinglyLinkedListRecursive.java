package com.practice.linkedlist;

public class ReverseSinglyLinkedListRecursive {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Recursive Solution
    static class Solution {
        public ListNode reverseList(ListNode head) {

            // base case: empty list or single node
            if (head == null || head.next == null)
                return head;

            // reverse rest of the list
            ListNode newHead = reverseList(head.next);

            // reverse current connection
            head.next.next = head;
            head.next = null;

            return newHead;
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

        // Create linked list: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        ListNode reversed = sol.reverseList(head);

        System.out.println("Reversed List:");
        printList(reversed);
    }

    /*
     * TIME COMPLEXITY:
     * O(n) -> each node is visited exactly once
     *
     * SPACE COMPLEXITY:
     * O(n) -> recursion stack space (due to n function calls)
     */
}
