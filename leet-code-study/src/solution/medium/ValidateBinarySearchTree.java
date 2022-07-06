package solution.medium;

import baseClass.TreeNode;

public class ValidateBinarySearchTree {

    /*
     * 98. Validate Binary Search Tree
     */
    public boolean isValidBST(TreeNode root) {
        boolean rslt = false;

        if (root == null) return true;

        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;

        if (root.val < root.left.val || root.val > root.right.val) return false;

        rslt = isValidBST(root.left);
        if (rslt == true) {
            isValidBST(root.right);
        }

        return rslt;
    }
}
