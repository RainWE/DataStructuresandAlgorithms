package per.leetcode.dfs;

/**
 * ��С�߶���
 * ����һ�������������飬Ԫ�ظ�����ͬ�Ұ��������У���дһ���㷨������һ�ø߶���С�Ķ�����������
 * ʾ��:
 * ������������: [-10,-3,0,5,9],
 * һ�����ܵĴ��ǣ�[0,-3,9,-10,null,5]�������Ա�ʾ��������߶�ƽ�������������
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
        // ��mid��Ϊ���ڵ�
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