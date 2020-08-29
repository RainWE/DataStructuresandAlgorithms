package per.leetcode.dfs;

import java.util.HashMap;
import java.util.Map;

/**���·��
 ����һ�ö�����������ÿ���ڵ㶼����һ��������ֵ(��ֵ������)�����һ���㷨����ӡ�ڵ���ֵ�ܺ͵���ĳ������ֵ������·����������ע�⣬·����һ���ǵôӶ������ĸ��ڵ��Ҷ�ڵ㿪ʼ������������䷽���������(ֻ�ܴӸ��ڵ�ָ���ӽڵ㷽��)��

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
 3
 ���ͣ���Ϊ 22?��·���У�[5,4,11,2], [5,8,4,5], [4,11,7]
 ��ʾ��
 �ڵ����� <= 10000
 */
public class PathSum_1 {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);

        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.left=new TreeNode(5);
        root.right.right.right=new TreeNode(1);
        System.out.println(pathSum(root,22));

    }
    public static int pathSum(TreeNode root, int sum) {
        int dep = depth(root);//���ĸ߶�
        int[] paths = new int[dep];
        pathSum(root, sum, 0, paths);
        return res;
    }

    static int res = 0;

    public static void pathSum(TreeNode root, int sum, int level, int[] paths) {
        if (root == null) {
            return;
        }
        paths[level] = root.val;
        int t = 0;
        for (int i = level; i >= 0; i--) {
            t += paths[i];
            if (t == sum) {
                res += 1;
            }
        }
        pathSum(root.left, sum, level + 1, paths);
        pathSum(root.right, sum, level + 1, paths);
    }


    public static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
    //
    public static void pathSum_1(TreeNode root, int sum, int level, int[] paths) {
        if (root==null) return;
        paths[level]=root.val;//���Ĳ������������ĸ߶ȣ�
        int t=0;
        for (int i=level;i>=0;i--){//�������ϼӣ�ÿ�ζ����¼ӷ�
            t+=paths[i];
            if (sum==t){
                res++;
            }
        }
        pathSum_1(root.left,sum,level+1,paths);//���������������²���+1
        pathSum_1(root.right,sum,level+1,paths);//���������������²���+1
    }
}
