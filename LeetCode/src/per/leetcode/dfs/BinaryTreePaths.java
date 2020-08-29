package per.leetcode.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**������������·��
 ����һ�����������������дӸ��ڵ㵽Ҷ�ӽڵ��·����

 ˵��:?Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
 ʾ��:
 ����:
     1
   /   \
  2     3
   \
    5
 ���: ["1->2->5", "1->3"]
 ����: ���и��ڵ㵽Ҷ�ӽڵ��·��Ϊ: 1->2->5, 1->3
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