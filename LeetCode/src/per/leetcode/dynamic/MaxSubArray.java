package per.leetcode.dynamic;


/**
 * ���������������
 * ����һ���������飬������������Ҳ�и����������е�һ������������������һ�������顣������������ĺ͵����ֵ��
 * Ҫ��ʱ�临�Ӷ�ΪO(n)��
 * ʾ��1:
 * ����: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * ���: 6
 * ����:?����������?[4,-1,2,1] �ĺ����Ϊ?6��
 * ��ʾ��
 * 1 <=?arr.length <= 10^5
 * -100 <= arr[i] <= 100
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int arr []={-2,1,-3,4,-1,2,1,-5,4};
//        int arr[] = {-2};
        //-2,-1,-4,0,-1,1,2,-3,1
        //1,-2,2,1,3,4,-1,3
        //-3,1,0,2,3,-2,2
        System.out.println(maxSubArray_2(arr));


    }
    //��ٷ�������ȡ��
    public static int maxSubArray(int[] nums) {
        int maxcount = nums[0];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = i; j < nums.length; j++) {
                count += nums[j];
                if (maxcount < count) {
                    maxcount = count;
                }
            }
        }
        return maxcount;
    }

    /**
     ��̬�滮������
     ״̬���壺 �趯̬�滮�б� dp ��dp[i] ������Ԫ�� nums[i] Ϊ��β���������������͡�
     Ϊ�ζ������� dp[i] �б������Ԫ�� nums[i] ����֤ dp[i] ���Ƶ� dp[i+1]����ȷ�ԣ���������� nums[i] ��
     ����ʱ��������Ŀ�� ���������� Ҫ��
     ת�Ʒ��̣� �� dp[i?1]��0 ��˵�� dp[i - 1] �� dp[i] ���������ף��� dp[i-1] + nums[i] ������ nums[i] �����
     �� dp[i?1]>0 ʱ��ִ�� dp[i] = dp[i-1] + nums[i]��
     �� dp[i?1]��0 ʱ��ִ�� dp[i] = nums[i]��
     ��ʼ״̬�� dp[0] = nums[0]������ nums[0]��β����������������Ϊ nums[0]��
     ����ֵ�� ���� dp�б��е����ֵ������ȫ�����ֵ��
     */
    public static int maxSubArray_1(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;

    }
    //-2,1,-3,4,-1,2,1,-5,4
    public static int maxSubArray_2(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>0){
                nums[i]+=nums[i-1];
            }
            if (res<nums[i]) {
                res = nums[i];
            }
//            nums[i] += Math.max(nums[i - 1], 0);
//            res = Math.max(res, nums[i]);
        }
        return res;

    }

    public static int maxSubArray_3(int[] nums){
        int res=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i-1]>0){
                nums[i]+=nums[i-1];
            }
            if (res<nums[i]){
                res=nums[i];
            }
        }
        return res;
    }
}
