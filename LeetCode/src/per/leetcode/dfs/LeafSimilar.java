package per.leetcode.dfs;


import java.util.ArrayList;
import java.util.List;

/**叶子相似的树
 请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
                3
             /    \
            5      1
          / \     / \
         6   2   9   6
            / \
           7   4
 举个例子，如上图所示，给定一颗叶值序列为?(6, 7, 4, 9, 8)?的树。
 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是?叶相似?的。
 如果给定的两个头结点分别为?root1 和?root2?的树是叶相似的，则返回?true；否则返回 false 。
 提示：
 给定的两颗树可能会有?1?到 200?个结点。
 给定的两颗树上的值介于 0 到 200 之间。
 */
public class LeafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 =new ArrayList<>();
        List<Integer> l2 =new ArrayList<>();
        dfs(root1,l1);
        dfs(root2,l2);
        return l1.equals(l2);
    }
    public void dfs(TreeNode node, List<Integer> leafValues) {
        if (node!=null){
            if (node.left==null && node.right==null){
                leafValues.add(node.val);
            }
            dfs(node.left,leafValues);
            dfs(node.right,leafValues);
        }
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */