package per.leetcode.dfs;

/**
 * 最小高度树
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 * [-10,-3,-2,0,5,9,10]
 * 0
 * /   \
 * -3      9
 * / \    / \
 * -10  -2  5  10
 */
public class SortedArrayToBST {
    public static void main(String[] args) {
        int arr[] = {-10, -3, 0, 5, 9};
        sortedArrayToBST(arr);

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return nextNode(nums, 0, nums.length-1);
    }

    public static TreeNode nextNode(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // 以mid作为根节点
//        int mid = (high - low) / 2 + low; // 1/2high- 1/2low +low = 1/2high+1/2low
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = nextNode(nums, left, mid - 1);
        root.right = nextNode(nums, mid + 1, right);
        return root;
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