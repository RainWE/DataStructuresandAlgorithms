package per.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**�����������ĵ�k��ڵ�
 ����һ�ö��������������ҳ����е�k��Ľڵ㡣
 ʾ�� 1:
 ����: root = [3,1,4,null,2], k = 1
         3
        / \
       1   4
        \
 ?       2
 ���: 4
 ʾ�� 2:
 ����: root = [5,3,6,2,4,null,null,1], k = 3
          5
        / \
       3   6
      / \
     2   4
   /
  1
 ���: 4
 ���ƣ�
 1 �� k �� ����������Ԫ�ظ���
 */
public class KthLargest {
    int k, res;
    public int kthLargest(TreeNode root, int k) {
       this.k=k;
       dfs(root);
       return res;
    }
    //����ⷨ���ڴ����ʣ��������������������Ϊ �������� ��
    //�����������ʣ��׵ö����������� ����������� Ϊ �ݼ����� �����Ե����k�����������k��Ľڵ�
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
