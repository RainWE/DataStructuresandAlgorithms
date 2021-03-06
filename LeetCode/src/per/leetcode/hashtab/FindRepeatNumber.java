package per.leetcode.hashtab;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**数组中重复的数字
 找出数组中重复的数字。
 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 请找出数组中任意一个重复的数字。
 示例 1：
 输入：
 [2, 3, 1, 0, 2, 5, 3]
 输出：2 或 3
 限制：
 2 <= n <= 100000
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i],1);
            }
        }
        return -1;
    }
    public int findRepeatNumber_1(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
    public int findRepeatNumber_2(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }
}
