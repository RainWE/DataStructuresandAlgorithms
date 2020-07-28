package per.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的深度
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度?3 。
 * 提示：
 * 节点总数 <= 10000
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = 1;
        int right = 1;
        if (root.left != null) {
            left = maxDepth(root.left) + 1;
        }
        if (root.right != null) {
            right = maxDepth(root.right) + 1;
        }
        if (left > right) {
            return left;
        } else {
            return right;
        }
    }
    public int maxDepth_2(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth_2(root.left),maxDepth_2(root.right))+1;
    }
    public int maxDepth_1(TreeNode root) {
        if (root == null) return 0;
        List<TreeNode> queue = new LinkedList<>() {{ add(root); }}, tmp;
        int res = 0;
        while (!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null) tmp.add(node.left);
                if (node.right != null) tmp.add(node.right);
            }
            queue = tmp;
            res++;
        }
        return res;
    }

}

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}