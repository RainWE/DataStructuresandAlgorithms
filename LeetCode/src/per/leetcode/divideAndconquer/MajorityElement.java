package per.leetcode.divideAndconquer;

import java.util.Arrays;

/**
 * �����г��ִ�������һ�������
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ����Լ��������Ƿǿյģ����Ҹ������������Ǵ��ڶ���Ԫ�ء�
 * ʾ��?1:
 * ����: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * ���: 2
 * ���ƣ�
 * 1 <= ���鳤�� <= 50000
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }
    public int majorityElement_2(int[] nums) {
        int x = 0, votes = 0, count = 0;
        for (int num : nums) {
            if (votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        // ��֤ x �Ƿ�Ϊ����
        for (int num : nums)
            if (num == x) count++;
        return count > nums.length / 2 ? x : 0; // ��������ʱ���� 0
    }

    public int majorityElement_1(int[] nums) {
        Arrays.sort(nums);
        int num = nums[nums.length / 2];
        return num;
    }
}
