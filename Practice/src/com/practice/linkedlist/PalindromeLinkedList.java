package com.practice.linkedlist;

public class PalindromeLinkedList {

    // Definition for singly linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Solution {

        /*
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        public boolean isPalindrome(ListNode head) {

            // Empty list or single node is always palindrome
            if (head == null || head.next == null) {
                return true;
            }

            // Step 1: Find middle of linked list
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse second half
            ListNode prev = null;

            while (slow != null) {

                ListNode nextNode = slow.next;
                slow.next = prev;
                prev = slow;
                slow = nextNode;
            }

            // Step 3: Compare both halves
            ListNode first = head;
            ListNode second = prev;

            while (second != null) {

                if (first.val != second.val) {
                    return false;
                }

                first = first.next;
                second = second.next;
            }

            return true;
        }
    }

    // Helper method to print list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Linked List:");
        printList(head);

        Solution sol = new Solution();

        boolean result = sol.isPalindrome(head);

        System.out.println("Is Palindrome? " + result);
    }
}
