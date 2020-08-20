package per.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**二叉搜索树的第k大节点
 给定一棵二叉搜索树，请找出其中第k大的节点。
 示例 1:
 输入: root = [3,1,4,null,2], k = 1
         3
        / \
       1   4
        \
 ?       2
 输出: 4
 示例 2:
 输入: root = [5,3,6,2,4,null,null,1], k = 3
          5
        / \
       3   6
      / \
     2   4
   /
  1
 输出: 4
 限制：
 1 ≤ k ≤ 二叉搜索树元素个数
 */
public class KthLargest {
    int k, res;
    public int kthLargest(TreeNode root, int k) {
       this.k=k;
       dfs(root);
       return res;
    }
    //本题解法基于此性质：二叉搜索树的中序遍历为 递增序列 。
    //根据以上性质，易得二叉搜索树的 中序遍历倒序 为 递减序列 。所以倒序第k个就是正序第k大的节点
    public void dfs(TreeNode root){
        if (root==null) return;
        dfs(root.right);
        if (k==0) return;
        k--;
        if (k==0) res=root.val;
        dfs(root.left);
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
