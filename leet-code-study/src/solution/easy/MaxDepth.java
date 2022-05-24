package solution.easy;

import baseClass.TreeNode;

public class MaxDepth {

	public int maxDepth(TreeNode root) {
		return moveNodeAndCalcDepoth(root, 0);
	}

	private int moveNodeAndCalcDepoth(TreeNode node, int curDepth) {

		if (node == null) {
			return curDepth;
		} else {
			curDepth++;
		}
		// System.out.println("nodeval: "+ node.val);

		int tempDepth = 0;
		if (node.left != null) {
			tempDepth = moveNodeAndCalcDepoth(node.left, curDepth);
		}
		if (node.right != null) {
			int tempDepth2 = moveNodeAndCalcDepoth(node.right, curDepth);
			tempDepth = tempDepth < tempDepth2 ? tempDepth2 : tempDepth;
		}
		curDepth = curDepth < tempDepth ? tempDepth : curDepth;
		return curDepth;
	}
}
