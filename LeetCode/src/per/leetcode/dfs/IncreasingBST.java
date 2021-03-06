package per.leetcode.dfs;


import java.util.ArrayList;
import java.util.List;

/**递增顺序查找树
 给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 示例 ：
 输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]
                    5
                   / \
                 3    6
                / \    \
               2   4    8
             ?/        / \
             1        7   9
 输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
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
 提示：
 给定树中的结点数介于 1 和?100 之间。
 每个结点都有一个从 0 到 1000 范围内的唯一整数值。
 */
public class IncreasingBST {
    //方法一：中序遍历 + 构造新的树
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
    //方法二：中序遍历 + 更改树的连接方式
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
