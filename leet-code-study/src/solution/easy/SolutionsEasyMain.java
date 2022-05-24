package solution.easy;

import java.util.Arrays;

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
	}

}
