package solution.easy;

import java.util.Arrays;

import baseClass.ListNode;
import baseClass.TreeNode;

public class SolutionsEasyMain {

	public static void main(String[] args) {

		// Input: root = [3,9,20,null,null,15,7]
		// Output: 3
		// TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(10, new
		// TreeNode(15, new TreeNode(13), new TreeNode(20)), new TreeNode(7)));
		// TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new
		// TreeNode(15), new TreeNode(7)));
		TreeNode root = TreeNode.makeTreeFromList(Arrays.asList(3, 9, 20, null, null, 15, 7));
		int rslt = new MaxDepth().maxDepth(root);

		System.out.println("rslt: " + rslt);

		// TreeNode.makeTree(null);
		System.out.println(new MaxDepth().maxDepth(TreeNode.makeTreeFromList(null)));
		
		System.out.println("234. Palindrome Linked List=======");
		// 234. Palindrome Linked List
		ListNode head = ListNode.makeListNodeFromList(Arrays.asList(1,2,2,1));
		System.out.println(new PalindromeLinkedList().isPalindrome(head));
		
		System.out.println("283. Move Zeroes=======");
		// 283. Move Zeroes
		int [] nums = {0,1,0,3,12};
		new MoveZeroes().moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
		
		// 338. Counting Bits
		System.out.println("338. Counting Bits=======");
		System.out.println(Arrays.toString(new CountingBits().countBits(0)));
		System.out.println(Arrays.toString(new CountingBits().countBits(1)));
		System.out.println(Arrays.toString(new CountingBits().countBits(2)));
		System.out.println(Arrays.toString(new CountingBits().countBits(3)));
		System.out.println(Arrays.toString(new CountingBits().countBits(4)));
		System.out.println(Arrays.toString(new CountingBits().countBits(5)));
		
	}

}
