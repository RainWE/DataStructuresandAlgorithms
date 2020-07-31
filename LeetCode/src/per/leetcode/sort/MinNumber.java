package per.leetcode.sort;


/**
 * 把数组排成最小的数
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 示例 1:
 * 输入: [10,2]
 * 输出: "102"
 * 示例?2:
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 * 提示:0 < nums.length <= 100
 * 说明:
 * 输出结果可能非常大，所以你需要返回一个字符串而不是整数
 * 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0
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
     * 排序判断规则： 设 nums 任意两数字的字符串格式 x 和 y ，则
     * 若拼接字符串 x + y > y + x ，则 m > n ；
     * 反之，若 x + y < y + x ，则 n < m ；
     * {3,30,34,5,9};
     * 比如 因为 3 30 >30 3，所以30 小于 3 ，这里的“小于”为位置上的比较，即小的在前
     * 5 9 < 9 5 所以 9 大于 5 ，9在5后面
     * 3 34<34 3 所以 34大于3，34在3后面
     */
    public static void fastSort(String[] strs, int left, int right) {
        if (left >= right) return;
        int l = left, r = right;
        String tmp = strs[l];
        while (l < r) {
            //{3,30,34,5,9};
            //strs[left]=3，strs[r]=9
            /**
             3 9 < 9 3 所以 9 大于 3，9的位置在3后面，符合不用交换位置
             */
            //以left为中轴
            while ((strs[r] + strs[left]).compareTo(strs[left] + strs[r]) >= 0 && l < r) {
                r--;
            }
            //{3,30,34,5,9};
            //strs[left]=3，strs[l]=3
            /**
             3 3 = 3 3 不变
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
