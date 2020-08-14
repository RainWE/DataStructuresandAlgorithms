package per.leetcode.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**II. ���ϵ��´�ӡ������ II
 ���ϵ��°����ӡ��������ͬһ��Ľڵ㰴�����ҵ�˳���ӡ��ÿһ���ӡ��һ�С�
 ����:
 ����������:?[3,9,20,null,null,15,7],
      3
     / \
    9  20
      /  \
     15   7
 �������α��������
 [
    [3],
    [9,20],
    [15,7]
 ]
 ��ʾ��
 �ڵ����� <= 1000
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder_1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i=queue.size();i>0;i--){
                TreeNode tempnode = queue.poll();
                temp.add(tempnode.val);
                if (tempnode.left!=null)
                    queue.add(tempnode.left);
                if (tempnode.right!=null)
                    queue.add(tempnode.right);
            }
            res.add(temp);
        }
        return res;
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