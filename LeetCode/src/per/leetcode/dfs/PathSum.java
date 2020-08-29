package per.leetcode.dfs;

import java.util.LinkedList;
import java.util.List;

/**�������к�Ϊĳһֵ��·��
 ����һ�ö�������һ����������ӡ���������нڵ�ֵ�ĺ�Ϊ��������������·���������ĸ��ڵ㿪ʼ����һֱ��Ҷ�ڵ��������Ľڵ��γ�һ��·����
 ʾ��:
 �������¶��������Լ�Ŀ���?sum = 22��
                  5
                 / \
                4   8
               /   / \
              11  13  4
             /  \    / \
            7    2  5   1
 ����:
 [
 [5,4,11,2],
 [5,8,4,5]
 ]
 ��ʾ��
 �ڵ����� <= 10000
 */
public class PathSum {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root,sum);
        return res;
    }
    //���ݷ�
    void recur(TreeNode root, int tar) {
        if (root==null){
            return;
        }
        path.add(root.val);
        tar-=root.val;
        if (tar==0 && root.left==null && root.right==null){
            res.add(new LinkedList<>(path));
        }
        recur(root.left,tar);
        recur(root.right,tar);
        path.removeLast();
    }
}
