package per.leetcode.dynamic;


/**
 * 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 * 示例1:
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释:?连续子数组?[4,-1,2,1] 的和最大，为?6。
 * 提示：
 * 1 <=?arr.length <= 10^5
 * -100 <= arr[i] <= 100
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int arr []={-2,1,-3,4,-1,2,1,-5,4};
//        int arr[] = {-2};
        //-2,-1,-4,0,-1,1,2,-3,1
        //1,-2,2,1,3,4,-1,3
        //-3,1,0,2,3,-2,2
        System.out.println(maxSubArray_2(arr));


    }
    //穷举法（不可取）
    public static int maxSubArray(int[] nums) {
        int maxcount = nums[0];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = i; j < nums.length; j++) {
                count += nums[j];
                if (maxcount < count) {
                    maxcount = count;
                }
            }
        }
        return maxcount;
    }

    /**
     动态规划解析：
     状态定义： 设动态规划列表 dp ，dp[i] 代表以元素 nums[i] 为结尾的连续子数组最大和。
     为何定义最大和 dp[i] 中必须包含元素 nums[i] ：保证 dp[i] 递推到 dp[i+1]的正确性；如果不包含 nums[i] ，
     递推时则不满足题目的 连续子数组 要求。
     转移方程： 若 dp[i?1]≤0 ，说明 dp[i - 1] 对 dp[i] 产生负贡献，即 dp[i-1] + nums[i] 还不如 nums[i] 本身大。
     当 dp[i?1]>0 时：执行 dp[i] = dp[i-1] + nums[i]；
     当 dp[i?1]≤0 时：执行 dp[i] = nums[i]；
     初始状态： dp[0] = nums[0]，即以 nums[0]结尾的连续子数组最大和为 nums[0]。
     返回值： 返回 dp列表中的最大值，代表全局最大值。
     */
    public static int maxSubArray_1(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;

    }
    //-2,1,-3,4,-1,2,1,-5,4
    public static int maxSubArray_2(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>0){
                nums[i]+=nums[i-1];
            }
            if (res<nums[i]) {
                res = nums[i];
            }
//            nums[i] += Math.max(nums[i - 1], 0);
//            res = Math.max(res, nums[i]);
        }
        return res;

    }

    public static int maxSubArray_3(int[] nums){
        int res=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i-1]>0){
                nums[i]+=nums[i-1];
            }
            if (res<nums[i]){
                res=nums[i];
            }
        }
        return res;
    }
}
