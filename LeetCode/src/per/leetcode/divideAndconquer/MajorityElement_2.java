package per.leetcode.divideAndconquer;

/**��ҪԪ��
 ������ռ�ȳ���һ���Ԫ�س�֮Ϊ��ҪԪ�ء�����һ���������飬�ҵ�������ҪԪ�ء���û�У�����-1��
 ʾ�� 1��
 ���룺[1,2,5,9,5,9,5,5,5]
 �����5
 ʾ�� 2��
 ���룺[3,2]
 �����-1
 ʾ�� 3��
 ���룺[2,2,1,1,1,2,2]
 �����2
 ˵����
 ���а취��ʱ�临�Ӷ�Ϊ O(N)���ռ临�Ӷ�Ϊ O(1) �������
 */
public class MajorityElement_2 {
    //ͶƱ�㷨
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
