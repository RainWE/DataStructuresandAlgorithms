package per.leetcode.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * �������ڵ����ֵ
 * ����һ������ nums �ͻ������ڵĴ�С k�����ҳ����л�������������ֵ��
 * ʾ��:
 * ����: nums = [1,3,-1,-3,5,3,6,7], �� k = 3
 * ���: [3,3,5,5,6,7]
 * ����:
 * �������ڵ�λ��                ���ֵ
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 * ��ʾ��
 * ����Լ��� k ������Ч�ģ����������鲻Ϊ�յ�����£�1 �� k ��?��������Ĵ�С��
 * ע�⣺��������վ 239 ����ͬ��https://leetcode-cn.com/problems/sliding-window-maximum/
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
        for (int i = 0; i < k; i++) { // δ�γɴ���
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) { // �γɴ��ں�
            if (deque.peekFirst() == nums[i - k]) {//��������ƶ�һλ���ж�Ҫ�Ƴ���Ԫ���Ƿ��deque�ĵ�һ��Ԫ����ͬ����ͬ˵�������Ѿ�����Ԫ�أ�����ɾ��
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
