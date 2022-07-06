package solution.medium;

import baseClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrder {

    /*
     * 102. Binary Tree Level Order
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> rsltList = new ArrayList<>();

        collectValueByLevel(root, rsltList, 0);

        return rsltList;
    }

    private void collectValueByLevel(TreeNode node, List<List<Integer>> rsltList, int level) {
        if (node == null) return;

        if (rsltList.size() == level) rsltList.add(new ArrayList<>());

        rsltList.get(level).add(node.val);

        collectValueByLevel(node.left, rsltList, level +1);
        collectValueByLevel(node.right, rsltList, level +1);

    }
}
