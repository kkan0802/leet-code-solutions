package solution.medium;

import java.util.Arrays;
import java.util.List;

import baseClass.ListNode;

public class SolutuionsMediumMain {

	public static void main(String[] args) {
		
		System.out.println("2. Add Two Numbers=======");
		// 2. Add Two Numbers
		ListNode l1 = ListNode.makeListNodeFromList(Arrays.asList(2, 4, 3));
		ListNode l2 = ListNode.makeListNodeFromList(Arrays.asList(5, 6, 4));

//        ListNode l1 = null;
//        ListNode l2 = null;

		new AddTwoNumbers().addTwoNumbers(l1, l2);
		
		System.out.println("3. Longest Substring Without Repeating Characters=======");
		// 3. Longest Substring Without Repeating Characters
		System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));
		System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("bbbbb"));
		System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("pwwkew"));
		
		System.out.println("5. Longest Palindromic Substring=======");
		// 5. Longest Palindromic Substring
		System.out.println(new LongestPalindrome().longestPalindrome("babad"));
		System.out.println(new LongestPalindrome().longestPalindrome("cbbd"));
		System.out.println(new LongestPalindrome().longestPalindrome("cbaab"));
		System.out.println(new LongestPalindrome().longestPalindrome("cbacb"));
		System.out.println(new LongestPalindrome().longestPalindrome("acacbbc"));
		
		System.out.println("11. Container With Most Water=======");
		// 11. Container With Most Water
		System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
		System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 1}));
		
		System.out.println("15. 3Sum=======");
		// 15. 3Sum
		System.out.println(new ThreeSum().threeSum(new int[] {-1,0,1,2,-1,-4}));
		System.out.println(new ThreeSum().threeSum(null));
		System.out.println(new ThreeSum().threeSum(new int[] {0}));

		System.out.println("17. Letter Combinations of a Phone Number=======");
		// 17. Letter Combinations of a Phone Number
		System.out.println(new LetterCombinationsOfaPhoneNumber().letterCombinations("23"));
		System.out.println(new LetterCombinationsOfaPhoneNumber().letterCombinations(""));
		System.out.println(new LetterCombinationsOfaPhoneNumber().letterCombinations("2"));

		System.out.println("19. Remove Nth Node From End of List=======");
		// 19. Remove Nth Node From End of List
		ListNode rslt1 = new RemoveNthFromEnd().removeNthFromEnd(ListNode.makeListNodeFromList(List.of(1, 2, 3, 4, 5)), 2);
		ListNode rslt2 = new RemoveNthFromEnd().removeNthFromEnd(ListNode.makeListNodeFromList(List.of(1, 2, 3, 4, 5)), 1);
		ListNode rslt3 = new RemoveNthFromEnd().removeNthFromEnd(ListNode.makeListNodeFromList(List.of(1, 2, 3, 4, 5)), 0);
		ListNode rslt4 = new RemoveNthFromEnd().removeNthFromEnd(ListNode.makeListNodeFromList(List.of(1)), 1);
		ListNode rslt5 = new RemoveNthFromEnd().removeNthFromEnd(ListNode.makeListNodeFromList(List.of(1,2)), 1);
		ListNode rslt6 = new RemoveNthFromEnd().removeNthFromEnd(ListNode.makeListNodeFromList(List.of(1,2)), 2);
		ListNode rslt7 = new RemoveNthFromEnd().removeNthFromEnd(ListNode.makeListNodeFromList(List.of(1,2)), 3);

		List<ListNode> rsltListNodeList = List.of(rslt1, rslt2, rslt3, rslt5, rslt6, rslt7);
		rsltListNodeList.forEach(ListNode::confirm);

		System.out.println("22. Generate Parentheses=======");
		// 22. Generate Parentheses
		System.out.println(new GenerateParenthesis().generateParenthesis(3));
		System.out.println(new GenerateParenthesis().generateParenthesis(1));
		
		System.out.println("24. Swap Nodes in Pairs=======");
		// 24. Swap Nodes in Pairs
		ListNode rslt = new SwapNodesInPairs().swapPairs(ListNode.makeListNodeFromList(Arrays.asList(1, 2, 3, 4, 5, 6)));
		ListNode.confirm(rslt);
		
		System.out.println("31. Next Permutation=======");
		// 31. Next Permutation
		NextPermutation nextPermutation = new NextPermutation();
		int[] inArr = new int[] { 3, 4, 2, 1 };
		
		int[] cpArr = Arrays.copyOf(inArr, inArr.length);
		
		while (true) {
			System.out.println(Arrays.toString(inArr));
			nextPermutation.nextPermutation(inArr);
			if (nextPermutation.conFirmEquals(inArr, cpArr)) break;
		}
		
		System.out.println("33. Search in Rotated Sorted Array=======");
		// 33. Search in Rotated Sorted Array
		int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
		System.out.println(new SearchInRotatedSortedArray().search(arr, 5));
		
		

		
		
	}

}
