package per.leetcode.sort;


/**
 * �������ų���С����
 * ����һ���Ǹ��������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ʾ�� 1:
 * ����: [10,2]
 * ���: "102"
 * ʾ��?2:
 * ����: [3,30,34,5,9]
 * ���: "3033459"
 * ��ʾ:0 < nums.length <= 100
 * ˵��:
 * ���������ܷǳ�����������Ҫ����һ���ַ�������������
 * ƴ�����������ֿ��ܻ���ǰ�� 0�����������Ҫȥ��ǰ�� 0
 */
public class MinNumber {
    public static void main(String[] args) {
//        int[] nums = {3, 30, 34, 5, 9};
//        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        int[] nums = {3,4,3,4,3,4,3,4,3};
//                  20 30 3 34 9
        System.out.println(minNumber(nums));//3033459
        System.out.println(minNumber_1(nums));
    }

    public static String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        fastSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for (String s : strs)
            res.append(s);
        return res.toString();
    }

    /**
     * �����жϹ��� �� nums ���������ֵ��ַ�����ʽ x �� y ����
     * ��ƴ���ַ��� x + y > y + x ���� m > n ��
     * ��֮���� x + y < y + x ���� n < m ��
     * {3,30,34,5,9};
     * ���� ��Ϊ 3 30 >30 3������30 С�� 3 ������ġ�С�ڡ�Ϊλ���ϵıȽϣ���С����ǰ
     * 5 9 < 9 5 ���� 9 ���� 5 ��9��5����
     * 3 34<34 3 ���� 34����3��34��3����
     */
    public static void fastSort(String[] strs, int left, int right) {
        if (left >= right) return;
        int l = left, r = right;
        String tmp = strs[l];
        while (l < r) {
            //{3,30,34,5,9};
            //strs[left]=3��strs[r]=9
            /**
             3 9 < 9 3 ���� 9 ���� 3��9��λ����3���棬���ϲ��ý���λ��
             */
            //��leftΪ����
            while ((strs[r] + strs[left]).compareTo(strs[left] + strs[r]) >= 0 && l < r) {
                r--;
            }
            //{3,30,34,5,9};
            //strs[left]=3��strs[l]=3
            /**
             3 3 = 3 3 ����
             */
            while ((strs[l] + strs[left]).compareTo(strs[left] + strs[l]) <= 0 && l < r) {
                l++;
            }
            tmp = strs[l];
            strs[l] = strs[r];
            strs[r] = tmp;
        }
        strs[l] = strs[left];
        strs[left] = tmp;
        fastSort(strs, left, l - 1);
        fastSort(strs, l + 1, right);
    }
    public static String minNumber_1(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        fastSort_1(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for (String s : strs)
            res.append(s);
        return res.toString();
    }
    public static void fastSort_1(String[] strs, int left, int right) {
        int l = left;
        int r = right;
        String pivot = strs[(left + right) / 2];
        String tmp;
        while (l < r) {
            while ((strs[l] + pivot).compareTo(pivot + strs[l]) <0 ) {
                l++;
            }
            while ((strs[r] + pivot).compareTo(pivot + strs[r]) >0 ) {
                r--;
            }
            if (l >= r){
                break;
            }
            tmp = strs[l];
            strs[l] = strs[r];
            strs[r] = tmp;
            if ((strs[l] + pivot).compareTo(pivot + strs[l])==0){
                r--;
            }
            if ((strs[r] + pivot).compareTo(pivot + strs[r])==0){
                l++;
            }
        }
        if (l==r){
            l++;
            r--;
        }
        if (l<right){
            fastSort_1(strs,l,right);
        }
        if (r>left){
            fastSort_1(strs,left,r);
        }
    }
}
