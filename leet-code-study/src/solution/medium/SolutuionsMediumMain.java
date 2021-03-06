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

		System.out.println("34. Find First and Last Position of Element in Sorted Array=======");
		// 34. Find First and Last Position of Element in Sorted Array
		System.out.println(Arrays.toString(
				new FindFirstAndLastPositionOfElementInSortedArray()
					.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8)));

		System.out.println("39. Combination Sum=======");
		// 39. Combination Sum
		System.out.println(new CombinationSum().combinationSum(new int[] { 2, 3, 6, 7 }, 7));
		System.out.println(new CombinationSum().combinationSum(new int[] { 2, 3, 5 }, 8));
		System.out.println(new CombinationSum().combinationSum(new int[] { 2 }, 1));

		System.out.println("45. Jump Game II=======");
		// 45. Jump Game II
		System.out.println(new JumpGameII().jump(new int[] { 2, 3, 1, 1, 4 }));
		System.out.println(new JumpGameII().jump(new int[] { 2, 1, 3, 2, 4 }));
		System.out.println(new JumpGameII().jump(new int[] { 2, 3, 0, 1, 4 }));

		System.out.println("48. Rotate Image=======");
		// 48. Rotate Image
		int[][] matrix = new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		new RotateImage().rotate(matrix);
		for(int[] tmpArr: matrix) {
			System.out.println(Arrays.toString(tmpArr));
		}

		System.out.println("49. Group Anagrams=======");
		// 49. Group Anagrams
		GroupAnagrams anagrams = new GroupAnagrams();
		System.out.println(anagrams.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
		System.out.println(anagrams.groupAnagrams(new String[] {""}));
		System.out.println(anagrams.groupAnagrams(new String[] {"a"}));

		System.out.println("55. Jump Game=======");
		// 55. Jump Game
		System.out.println(new JumpGame().canJump(new int[] {2,3,1,1,4}));
		System.out.println(new JumpGame().canJump(new int[] {3,2,1,0,4}));
		System.out.println(new JumpGame().canJump(new int[] {3,2,1,3,4}));

		System.out.println("56. Merge Intervals=======");
		// 56. Merge Intervals
		MergeIntervals mergeIntervals = new MergeIntervals();
		int[][] mergeIntervalsRslt = mergeIntervals.merge(new int[][] {{1,3},{2,3}, {5,6}, {8,8}, {8,10}, {15,18}});

		for(int[] i: mergeIntervalsRslt) {
			System.out.println(Arrays.toString(i));
		}

		System.out.println("62. Unique Paths=======");
		// 62. Unique Paths
		System.out.println(new UniquePaths().uniquePaths(3, 7));
		System.out.println(new UniquePaths().uniquePaths(3, 2));

		System.out.println("64. Minimum Path Sum=======");
		// 64. Minimum Path Sum
		System.out.println(new MinimumPathSum().minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
		System.out.println(new MinimumPathSum().minPathSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }));

		System.out.println("73. Set Matrix Zeroes=======");
		// 73. Set Matrix Zeroes
		//int[][] matrixSetZeros = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int[][] matrixSetZeros = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		new SetMatrixZeroes().setZeroes(matrixSetZeros);
		for (int[] is : matrixSetZeros) {
			System.out.println(Arrays.toString(is));
		}

		System.out.println("74. Search a 2D Matrix=======");
		// 74. Search a 2D Matrix
		System.out.println(new SearchA2DMatrix().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));

		System.out.println("75. Sort Colors=======");
		// 75. Sort Colors
		int[] colorArray = new int[]{2, 0, 2, 1, 1, 0};
		new SortColors().sortColors(colorArray);
		System.out.println(Arrays.toString(colorArray));

		System.out.println("78. Subsets=======");
		// 78. Subsets
		System.out.println(new Subsets().subsets(new int[]{1, 2, 3}));

		System.out.println("79. Word Search=======");
		// 79. Word Search
		char[][] wordMatrix = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		System.out.println(new WordSearch().exist(wordMatrix, "ABCCED"));
		System.out.println(new WordSearch().exist(wordMatrix, "SEE"));
		System.out.println(new WordSearch().exist(wordMatrix, "ABCB"));

		System.out.println("96. Unique Binary Search Trees=======");
		// 96. Unique Binary Search Trees
		System.out.println(new UniqueBinarySearchTrees().numTrees(3));
		System.out.println(new UniqueBinarySearchTrees().numTrees(4));

		System.out.println("98. Validate Binary Search Tree=======");
		// 98. Validate Binary Search Tree
		System.out.println(new ValidateBinarySearchTree().isValidBST(TreeNode.makeTreeFromList(Arrays.asList(2, 1, 3))));
		System.out.println(new ValidateBinarySearchTree().isValidBST(TreeNode.makeTreeFromList(Arrays.asList(5,1,4,null,null,3,6))));

		System.out.println("102. Binary Tree Level Order=======");
		// 102. Binary Tree Level Order
		System.out.println(new BinaryTreeLevelOrder().levelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
		System.out.println(new BinaryTreeLevelOrder().levelOrder(new TreeNode(3, new TreeNode(9, new TreeNode(1), new TreeNode(2)), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
		
		
		
	}

}
