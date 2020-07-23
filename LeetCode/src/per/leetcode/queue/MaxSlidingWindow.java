package per.leetcode.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 滑动窗口的最大值
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 * 示例:
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 * 提示：
 * 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤?输入数组的大小。
 * 注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/
 */
public class MaxSlidingWindow {
    public static void main(String[] args) {
//        int nums[] = {7, 2, 4};
        int nums[] = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));


    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) { // 未形成窗口
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) { // 形成窗口后
            if (deque.peekFirst() == nums[i - k]) {//窗口向后移动一位后判断要移除的元素是否和deque的第一个元素相同，相同说明窗口已经经过元素，所有删除
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;


    }
    public static int[] maxSlidingWindow_1(int[] nums, int k){
        if(nums.length==0 || k==0) {
            return new int[0];
        }
        Deque <Integer>deque = new LinkedList();
        int[] res = new int[nums.length - k + 1];
        for(int i=0;i<k;i++){
            while (!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        for(int i=k;i<nums.length;i++){
            if(deque.peekFirst()==nums[i-k]){
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i-k+1]=deque.peekFirst();
        }
        return res;
    }
    public static int[] maxSlidingWindow_2(int[] nums, int k){
        if(nums.length==0 || k==0){
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int res[]=new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            while (!deque.isEmpty() && deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0]=deque.peekFirst();
        for(int i=k;i<nums.length;i++){
            if(deque.peekFirst()==nums[i-k]){
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i-k+1]=deque.peekFirst();
        }
        return res;
    }
}
