package per.leetcode.divideAndconquer;

import java.util.Arrays;

/**�����г��ִ�������һ�������
 ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 ����Լ��������Ƿǿյģ����Ҹ������������Ǵ��ڶ���Ԫ�ء�
 ʾ��?1:
 ����: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 ���: 2
 ���ƣ�
 1 <= ���鳤�� <= 50000
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = nums[nums.length/2];
        return num;
    }
}
