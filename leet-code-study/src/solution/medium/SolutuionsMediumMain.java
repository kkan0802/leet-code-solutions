package solution.medium;

import java.util.Arrays;

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
		
		
		
	}

}
