package per.leetcode.dfs;

/**�����
 ���һ���㷨���ҳ�������������ָ���ڵ�ġ���һ�����ڵ㣨Ҳ�������̣���
 ���ָ���ڵ�û�ж�Ӧ�ġ���һ�����ڵ㣬�򷵻�null��
 ʾ�� 1:
 ����: root = [2,1,3], p = 1
      2
     / \
    1   3
 ���: 2
 ʾ�� 2:
 ����: root = [5,3,6,2,4,null,null,1], p = 6
          5
        / \
       3   6
     / \
    2   4
   /
 1
 ���: null
 */
public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode res=root;
        TreeNode temp=root;
        while (temp!=null){
            if (temp.val<=p.val){
                temp=temp.right;
            }else {
                res=temp;
                temp=temp.left;
            }
        }
        return res.val<=p.val?null:res;
    }

}
