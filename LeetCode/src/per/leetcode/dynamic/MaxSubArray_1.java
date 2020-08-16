package per.leetcode.dynamic;

/**��������
 ����һ���������飬�ҳ��ܺ������������У��������ܺ͡�
 ʾ����
 ���룺 [-2,1,-3,4,-1,2,1,-5,4]
 ����� 6
 ���ͣ� ���������� [4,-1,2,1] �ĺ����Ϊ 6��
 ���ף�
 ������Ѿ�ʵ�ָ��Ӷ�Ϊ O(n) �Ľⷨ������ʹ�ø�Ϊ����ķ��η���⡣
 */
public class MaxSubArray_1 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i=1;i<nums.length;i++){
            nums[i]+=Math.max(nums[i-1],0);
            res =Math.max(nums[i],res);
        }
        return res;
    }
}
