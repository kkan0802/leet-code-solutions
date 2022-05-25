package solution.easy;

import java.util.Stack;

import baseClass.ListNode;

public class PalindromeLinkedList {

    /*
     * 234. Palindrome Linked List
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        Stack<Integer> stack = new Stack<Integer>();

        ListNode startNode = head;
        while (startNode != null) {
            stack.push(startNode.val);
            startNode = startNode.next;
        }

        while (head != null) {
            if (stack.pop() != head.val) return false;
            head = head.next;
        }

        if (!stack.isEmpty()) return false;

        return true;
    }

}
