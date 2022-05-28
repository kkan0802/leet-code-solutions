package solution.easy;

import baseClass.TreeNode;

public class DiameterOfBinaryTree {

    /*
     * 543. Diameter of Binary Tree
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        
        int rslt = 0;
        
        if (root.left != null) rslt += maxDepth(root.left, 0);
        if (root.right != null) rslt += maxDepth(root.right, 0);
        
        
        return rslt;
    }
    
    private int maxDepth(TreeNode node, int currDepth) {
        
        if (node == null) {
            return currDepth;
        } else {
            currDepth++;
        }
        
        int tempDepth = 0;
        if (node.left != null) {
            tempDepth = maxDepth(node.left, currDepth);
        } 
        if (node.right != null) {
            int tempDepth2 = maxDepth(node.right, currDepth);
            tempDepth = tempDepth < tempDepth2? tempDepth2: tempDepth;
        }
        currDepth = currDepth < tempDepth? tempDepth: currDepth;
        return currDepth;
    }
}
