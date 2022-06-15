package solution.medium;

import java.util.LinkedList;
import java.util.Queue;

import baseClass.ListNode;

public class SwapNodesInPairs {

    /*
     * 24. Swap Nodes in Pairs
     */
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode currNode = head;
        ListNode rootNode = null;

        Queue<ListNode> nodeQueue = new LinkedList<>();

        int length = 0;

        while (currNode != null) {
            if (currNode.next != null) {
                nodeQueue.add(new ListNode(currNode.next.val));
                nodeQueue.add(new ListNode(currNode.val));
                currNode = currNode.next.next;
                length += 2;
            } else {
                nodeQueue.add(new ListNode(currNode.val));
                currNode = currNode.next;
                length += 1;
                break;
            }
        }

        while (!nodeQueue.isEmpty()) {
            if (length == nodeQueue.size()) {
                currNode = nodeQueue.poll();
                rootNode = currNode;
            }
            currNode.next = nodeQueue.poll();
            currNode = currNode.next;
        }

        return rootNode;
    }
}
