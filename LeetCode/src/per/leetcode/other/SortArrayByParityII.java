package per.leetcode.other;

/**按奇偶排序数组 II
 给定一个非负整数数组?A， A 中一半整数是奇数，一半整数是偶数。
 对数组进行排序，以便当?A[i] 为奇数时，i?也是奇数；当?A[i]?为偶数时， i 也是偶数。
 你可以返回任何满足上述条件的数组作为答案。
 示例：
 输入：[4,2,5,7]
 输出：[4,5,2,7]
 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 提示：
 2 <= A.length <= 20000
 A.length % 2 == 0
 0 <= A[i] <= 1000
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int arr []=new int[A.length];
        int even=0;//每次加二
        int oddNumber=1;//每次加二
        for (int i:A){
            if (i%2==1){
                arr[oddNumber]=i;
                oddNumber+=2;
            }else {
                arr[even]=i;
                even+=2;
            }
        }
        return arr;
    }
    //方法一： 两次遍历
    public int[] sortArrayByParityII_1(int[] A) {
        int N = A.length;
        int[] ans = new int[N];

        int t = 0;
        for (int x: A) if (x % 2 == 0) {
            ans[t] = x;
            t += 2;
        }

        t = 1;
        for (int x: A) if (x % 2 == 1) {
            ans[t] = x;
            t += 2;
        }

        return ans;
    }
    //方法二： 双指针
    public int[] sortArrayByParityII_3(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2)
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1)
                    j += 2;
                // Swap A[i] and A[j]
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

        return A;
    }
}
