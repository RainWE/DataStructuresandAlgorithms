package per.leetcode.dfs;


import java.util.ArrayList;
import java.util.List;

/**Ҷ�����Ƶ���
 �뿼��һ�Ŷ����������е�Ҷ�ӣ���ЩҶ�ӵ�ֵ�������ҵ�˳�������γ�һ�� Ҷֵ���� ��
                3
             /    \
            5      1
          / \     / \
         6   2   9   6
            / \
           7   4
 �ٸ����ӣ�����ͼ��ʾ������һ��Ҷֵ����Ϊ?(6, 7, 4, 9, 8)?������
 ��������Ŷ�������Ҷֵ��������ͬ����ô���Ǿ���Ϊ������?Ҷ����?�ġ�
 �������������ͷ���ֱ�Ϊ?root1 ��?root2?������Ҷ���Ƶģ��򷵻�?true�����򷵻� false ��
 ��ʾ��
 ���������������ܻ���?1?�� 200?����㡣
 �������������ϵ�ֵ���� 0 �� 200 ֮�䡣
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