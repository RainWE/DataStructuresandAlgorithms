package per.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * �����������
 * ����һ�ö������ĸ��ڵ㣬���������ȡ��Ӹ��ڵ㵽Ҷ�ڵ����ξ����Ľڵ㣨������Ҷ�ڵ㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * ���磺
 * ���������� [3,9,20,null,null,15,7]��
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * ��������������?3 ��
 * ��ʾ��
 * �ڵ����� <= 10000
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = 1;
        int right = 1;
        if (root.left != null) {
            left = maxDepth(root.left) + 1;
        }
        if (root.right != null) {
            right = maxDepth(root.right) + 1;
        }
        if (left > right) {
            return left;
        } else {
            return right;
        }
    }
    public int maxDepth_2(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth_2(root.left),maxDepth_2(root.right))+1;
    }
    public int maxDepth_1(TreeNode root) {
        if (root == null) return 0;
        List<TreeNode> queue = new LinkedList<>() {{ add(root); }}, tmp;
        int res = 0;
        while (!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null) tmp.add(node.left);
                if (node.right != null) tmp.add(node.right);
            }
            queue = tmp;
            res++;
        }
        return res;
    }

}

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}