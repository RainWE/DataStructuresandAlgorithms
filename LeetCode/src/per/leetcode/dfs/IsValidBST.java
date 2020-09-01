package per.leetcode.dfs;

/**�Ϸ�����������
 ʵ��һ�����������һ�ö������Ƿ�Ϊ������������
 ʾ��?1:
 ����:
            2
           / \
          1   3
 ���: true
 ʾ��?2:
 ����:
            5
           / \
          1   4
 ?           / \
 ?          3   6
 ���: false
 ����: ����Ϊ: [5,1,4,null,null,3,6]��
 ?    ���ڵ��ֵΪ 5 �����������ӽڵ�ֵΪ 4 ��
 */
public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        TreeNode maxLeft = root.left, minRight = root.right;
        // ��Ѱ�������е����ң���ֵ��󣩽ڵ�
        while (maxLeft != null && maxLeft.right != null)
            maxLeft = maxLeft.right;
        // ��Ѱ�������е�������ֵ��С���ڵ�
        while (minRight != null && minRight.left != null)
            minRight = minRight.left;
        // ��ǰ���Ƿ�Ϸ�
        boolean ret = (maxLeft == null || maxLeft.val < root.val) && (minRight == null || root.val < minRight.val);
        // ���������������������ж��Ƿ�Ϸ�
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