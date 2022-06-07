package baseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	};

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static ListNode makeListNodeFromList(List<Integer> list) {
		ListNode startNode = new ListNode();
		if (!Optional.ofNullable(list).orElseGet(ArrayList::new).isEmpty()) {
			startNode.val = list.get(0);

			ListNode curNode = startNode;
			for (int i = 1; i < list.size(); i++) {
				curNode.next = new ListNode(list.get(i));
				curNode = curNode.next;
			}
		}
		return startNode;
	}

	public static void confirm(ListNode l) {
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
		System.out.println(": lsit confirm>>>>>>>");
	}
}
