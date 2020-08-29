package per.leetcode.dfs;

import java.util.HashMap;
import java.util.Map;

/**求和路径
 给定一棵二叉树，其中每个节点都含有一个整数数值(该值或正或负)。设计一个算法，打印节点数值总和等于某个给定值的所有路径的数量。注意，路径不一定非得从二叉树的根节点或叶节点开始或结束，但是其方向必须向下(只能从父节点指向子节点方向)。

 示例:
 给定如下二叉树，以及目标和?sum = 22，
            5
          / \
         4   8
        /   / \
       11  13  4
      /  \    / \
     7    2  5   1
 返回:
 3
 解释：和为 22?的路径有：[5,4,11,2], [5,8,4,5], [4,11,7]
 提示：
 节点总数 <= 10000
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
        int dep = depth(root);//树的高度
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
        paths[level]=root.val;//最大的层数不超过树的高度，
        int t=0;
        for (int i=level;i>=0;i--){//从下往上加，每次都是新加法
            t+=paths[i];
            if (sum==t){
                res++;
            }
        }
        pathSum_1(root.left,sum,level+1,paths);//向左子树遍历向下层数+1
        pathSum_1(root.right,sum,level+1,paths);//向右子树遍历向下层数+1
    }
}
