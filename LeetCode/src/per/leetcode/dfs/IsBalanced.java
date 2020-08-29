package per.leetcode.dfs;

/**
 * ƽ�������
  ����һ�ö������ĸ��ڵ㣬�жϸ����ǲ���ƽ���������
  ���ĳ������������ڵ���������������������1����ô������һ��ƽ���������
  ʾ�� 1:
  ���������� [3,9,20,null,null,15,7]
           3
         /  \
       9   20
    /  \
  15   7
  ���� true ��
  ʾ�� 2:
  ���������� [1,2,2,3,3,null,null,4,4]
          1
         / \
       2   2
     / \
    3   3
  / \
 4   4
  ����?false ��
  ���ƣ�
  1 <= ���Ľ����� <= 10000
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return helper(root)!=-1;
    }
    //����һ��������� + ��֦ ���ӵ�������
    public int helper(TreeNode root) {
        if (root == null) return 0;
        int left = helper(root.left);
        if (left == -1) return -1;
        int right = helper(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
    //��������������� + �ж���� ���Ӷ����ף�
 /*   public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    //�ж����
    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

  */
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */