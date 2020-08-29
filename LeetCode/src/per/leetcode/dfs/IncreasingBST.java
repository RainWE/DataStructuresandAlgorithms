package per.leetcode.dfs;


import java.util.ArrayList;
import java.util.List;

/**����˳�������
 ����һ���������� ��������� ������������ʹ��������ߵĽ�����������ĸ�������ÿ�����û�����ӽ�㣬ֻ��һ�����ӽ�㡣
 ʾ�� ��
 ���룺[5,3,6,2,4,null,8,1,null,null,null,7,9]
                    5
                   / \
                 3    6
                / \    \
               2   4    8
             ?/        / \
             1        7   9
 �����[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
   1
 ? \
 ?  2
 ?   \
 ?    3
 ?     \
 ?      4
 ?       \
 ?        5
 ?         \
 ?          6
 ?           \
 ?            7
 ?             \
 ?              8
 ?               \
                  9
 ��ʾ��
 �������еĽ�������� 1 ��?100 ֮�䡣
 ÿ����㶼��һ���� 0 �� 1000 ��Χ�ڵ�Ψһ����ֵ��
 */
public class IncreasingBST {
    //����һ��������� + �����µ���
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inorder(root,list);
        TreeNode ans =new TreeNode(0),cur =ans;
        for (int v:list){
            cur.right=new TreeNode(v);
            cur=cur.right;
        }
        return ans.right;
    }
    public void inorder(TreeNode node, List<Integer> vals) {
        if (node==null)
            return;
        inorder(node.left,vals);
        vals.add(node.val);
        inorder(node.right,vals);
    }
    //��������������� + �����������ӷ�ʽ
    TreeNode cur;
    public TreeNode increasingBST_1(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        node.left = null;
        cur.right = node;
        cur = node;
        inorder(node.right);
    }

}
