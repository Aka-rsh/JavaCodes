package com.practice.linkedlist;

public class DetectCycleInLinkedList {

    // Definition for singly linked list
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Solution {

        // Function to detect cycle
        public boolean hasCycle(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;           // move 1 step
                fast = fast.next.next;      // move 2 steps

                // cycle detected
                if (slow == fast) {
                    return true;
                }
            }

            // no cycle
            return false;
        }
    }

    // Helper function to print linked list safely
    public static void printList(ListNode head, int limit) {

        int count = 0;

        while (head != null && count < limit) {
            System.out.print(head.data + " -> ");
            head = head.next;
            count++;
        }

        System.out.println("...");
    }

    public static void main(String[] args) {

        /*
             Creating linked list:

             1 -> 2 -> 3 -> 4 -> 5
                       ^         |
                       |_________|

             Cycle starts at node 3
        */

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create cycle
        fifth.next = third;

        Solution sol = new Solution();

        boolean result = sol.hasCycle(head);

        System.out.println("Does linked list contain cycle? " + result);
    }
}
