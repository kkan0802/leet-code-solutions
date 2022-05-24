package solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import baseClass.ListNode;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int rslt = makeNodeToReverseNumber(l1) + makeNodeToReverseNumber(l2);
		System.out.println("SUM: " + rslt);

		ListNode rsltNode = makeNumberToReverseNode(rslt);

		ListNode.confirm(rsltNode);

		return rsltNode;
	}

	private int makeNodeToReverseNumber(ListNode l) {
		List<Integer> numList = new ArrayList<>();

		while (l != null) {
			numList.add(l.val);
			l = l.next;
		}

		System.out.println("IN: " + numList);
		Collections.reverse(numList);
		// System.out.println(numList.stream().collect(Collectors.toCollection(ArrayDeque::new)).descendingIterator());
		System.out.println("OUT: " + numList);

		return numList.isEmpty() ? 0
				: Integer.parseInt(numList.stream().map(Object::toString).collect(Collectors.joining()));
	}

	private ListNode makeNumberToReverseNode(int number) {
		String numStr = String.valueOf(number);
		ListNode rsltNode = null;

		for (int i = 0; i < numStr.length(); i++) {
			rsltNode = new ListNode(Character.getNumericValue(numStr.charAt(i)), rsltNode);
		}

		return rsltNode;
	}
}
