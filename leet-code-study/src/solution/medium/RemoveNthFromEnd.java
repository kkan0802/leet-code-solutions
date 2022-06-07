package solution.medium;

import java.util.List;

import baseClass.ListNode;

public class RemoveNthFromEnd {

	/*
	 * 19. Remove Nth Node From End of List
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {

		int length = 0;
		ListNode curr = head;

		while (curr != null) {
			length++;
			curr = curr.next;
		}

		if (length == n) {
			head = head.next;
		} else {
			curr = head;

			while (curr != null) {
				length--;
				if (length == n && curr.next != null) {
					curr.next = curr.next.next;
					break;
				}
				curr = curr.next;
			}
		}

		return head;
	}

}
