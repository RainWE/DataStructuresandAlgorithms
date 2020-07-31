package per.leetcode.search;

/**在排序数组中查找数字 I
 统计一个数字在排序数组中出现的次数。
 示例 1:
 输入: nums = [5,7,7,8,8,10], target = 8
 输出: 2
 示例?2:
 输入: nums = [5,7,7,8,8,10], target = 6
 输出: 0
 限制：
 0 <= 数组长度 <= 50000
 */
public class Search {

    public int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }
    int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;

    }
    public int search_1(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);

    }
    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        int count=0;
        if (left>right){
            return -1;
        }
        int mid = (left+right)/2;
        int midVal = arr[mid];
        if (midVal<findVal){
            return binarySearch(arr,mid+1,right,findVal);
        }else if (midVal>findVal){
            return binarySearch(arr,left,mid-1,findVal);
        }else {
            int temp=mid-1;
            while (true){
                if (temp>0 && arr[temp]!=findVal){
                    break;
                }
                count++;
            }
            temp=mid+1;
            while (true){
                if (temp<arr.length && arr[temp] != findVal){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}
