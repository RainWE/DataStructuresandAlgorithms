package per.leetcode.dfs;

/**合法二叉搜索树
 实现一个函数，检查一棵二叉树是否为二叉搜索树。
 示例?1:
 输入:
            2
           / \
          1   3
 输出: true
 示例?2:
 输入:
            5
           / \
          1   4
 ?           / \
 ?          3   6
 输出: false
 解释: 输入为: [5,1,4,null,null,3,6]。
 ?    根节点的值为 5 ，但是其右子节点值为 4 。
 */
public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        TreeNode maxLeft = root.left, minRight = root.right;
        // 找寻左子树中的最右（数值最大）节点
        while (maxLeft != null && maxLeft.right != null)
            maxLeft = maxLeft.right;
        // 找寻右子树中的最左（数值最小）节点
        while (minRight != null && minRight.left != null)
            minRight = minRight.left;
        // 当前层是否合法
        boolean ret = (maxLeft == null || maxLeft.val < root.val) && (minRight == null || root.val < minRight.val);
        // 进入左子树和右子树并判断是否合法
        return  ret && isValidBST(root.left) && isValidBST(root.right);
    }
    public boolean isValidBST_1(TreeNode root){
        if (root==null) return true;
        TreeNode maxLeft=root.left,minRight=root.right;
        while (maxLeft!=null && maxLeft.right!=null)
            maxLeft=maxLeft.right;
        while (minRight!=null && minRight.left!=null)
            minRight=minRight.left;
        boolean res =((maxLeft==null || maxLeft.val<root.val) && (minRight==null || minRight.val>root.val));
        return res&&isValidBST_1(root.left)&&isValidBST_1(root.right);
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