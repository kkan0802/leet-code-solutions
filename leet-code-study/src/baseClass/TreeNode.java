package baseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static TreeNode makeTreeFromList(List<Integer> list) {
		System.out.println("InputLIst: " + list);

		TreeNode rootNode = new TreeNode();

		Stack<TreeNode> stackNode = new Stack<>();

		if (!Optional.ofNullable(list).orElseGet(ArrayList::new).isEmpty()) {
			rootNode.val = list.get(0);
			stackNode.push(rootNode);

			for (int i = 1; i < list.size(); i = i + 2) {

				TreeNode tempNode = stackNode.peek();

				if (i + 1 < list.size() && list.get(i + 1) != null) {
					tempNode.right = new TreeNode(list.get(i + 1));
					stackNode.push(tempNode.right);
				}
				if (list.get(i) != null) {
					tempNode.left = new TreeNode(list.get(i));
					stackNode.push(tempNode.left);
				}

			}
		}

		if (!stackNode.isEmpty()) {
			rootNode = stackNode.get(0);
			stackNode.clear();
		}

		return rootNode;
	}
}
