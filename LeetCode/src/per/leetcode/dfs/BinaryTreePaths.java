package per.leetcode.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**二叉树的所有路径
 给定一个二叉树，返回所有从根节点到叶子节点的路径。

 说明:?叶子节点是指没有子节点的节点。
 示例:
 输入:
     1
   /   \
  2     3
   \
    5
 输出: ["1->2->5", "1->3"]
 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> list=new LinkedList<>();
        dfs(root,"",list);
        return list;
    }
    public void dfs(TreeNode node,String path,LinkedList<String> leafValues){
        if (node!=null){
            path+=Integer.toString(node.val);
            if (node.left==null && node.right==null){
                leafValues.add(path);
            }else {
                path+="->";
                dfs(node.left,path,leafValues);
                dfs(node.right,path,leafValues);
            }

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