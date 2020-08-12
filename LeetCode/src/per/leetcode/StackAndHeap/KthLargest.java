package per.leetcode.StackAndHeap;


import java.util.PriorityQueue;

/**�������еĵ�K��Ԫ��
 ���һ���ҵ��������е�K��Ԫ�ص��ࣨclass����ע���������ĵ�K��Ԫ�أ����ǵ�K����ͬ��Ԫ�ء�
 ���?KthLargest?����Ҫһ��ͬʱ��������?k ����������nums?�Ĺ��������������������еĳ�ʼԪ�ء�
 ÿ�ε���?KthLargest.add�����ص�ǰ�������е�K���Ԫ�ء�
 ʾ��:
 int k = 3;
 int[] arr = [4,5,8,2];
 KthLargest kthLargest = new KthLargest(3, arr);
 kthLargest.add(3);? ?// returns 4
 kthLargest.add(5);? ?// returns 5
 kthLargest.add(10);? // returns 5
 kthLargest.add(9);? ?// returns 8
 kthLargest.add(4);? ?// returns 8
 ˵��:
 ����Լ���?nums?�ĳ��ȡ�?k-1?��k ��?1��
 */
public class KthLargest {
    private PriorityQueue<Integer> queue;
    private int lim;

    public KthLargest(int k, int[] nums) {
        lim=k;
        queue=new PriorityQueue<>(k);
        for (int num:nums){
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size()<lim){
            queue.add(val);
        }else if (val>queue.peek()){
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */