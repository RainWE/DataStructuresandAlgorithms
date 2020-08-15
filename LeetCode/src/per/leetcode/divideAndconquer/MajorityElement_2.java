package per.leetcode.divideAndconquer;

/**主要元素
 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 示例 1：
 输入：[1,2,5,9,5,9,5,5,5]
 输出：5
 示例 2：
 输入：[3,2]
 输出：-1
 示例 3：
 输入：[2,2,1,1,1,2,2]
 输出：2
 说明：
 你有办法在时间复杂度为 O(N)，空间复杂度为 O(1) 内完成吗？
 */
public class MajorityElement_2 {
    //投票算法
    public int majorityElement(int[] nums) {
        int x=0,vote=0,count=0;
        for (int num:nums){
            if (vote==0){
                x=num;
            }
            if (num==x){
                vote++;
            }else {
                vote--;
            }
        }
        for (int num:nums){
            if (x==num) count++;
        }
        return count>nums.length/2?x:-1;
    }
}
