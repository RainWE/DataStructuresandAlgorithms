package per.leetcode.stack;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**第 k 个数
 有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。
 注意，不是必须有这些素因子，而是必须不包含其他的素因子。
 例如，前几个数按顺序应该是 1，3，5，7，9，15，21。
 示例 1:
 输入: k = 5
 输出: 9
 */
public class GetKthMagicNumber {
    public static void main(String[] args) {
        System.out.println(getKthMagicNumber_2(5));
    }
    public static int getKthMagicNumber(int k) {
        int p3=0,p5=0,p7=0;
        int[] dp=new int[k];
        dp[0]=1;
        for(int i=1;i<k;i++){
            //1，3，5，7，9，15，21,25,27
            dp[i]=Math.min(dp[p3]*3,Math.min(dp[p5]*5,dp[p7]*7));
            if(dp[i]==dp[p3]*3) p3++;
            if(dp[i]==dp[p5]*5) p5++;
            if(dp[i]==dp[p7]*7) p7++;
        }
        return dp[k-1];
    }
    public static int getKthMagicNumber_1(int k){
        int dp3=0,dp5=0,dp7=0;
        int []dp = new int[k];
        dp[0]=1;
        for (int i=1;i<k;i++){
            dp[i]=Math.min(dp[dp3]*3,Math.min(dp[dp5]*5,dp[dp7]*7));
            if (dp[i]==dp[dp3]*3) dp3++;
            if (dp[i]==dp[dp5]*5) dp5++;
            if (dp[i]==dp[dp7]*7) dp7++;
        }
        return dp[k-1];
    }

    public static int getKthMagicNumber_2(int k){
        int dp3=0,dp5=0,dp7=0;
        int []arr =new int[k];
        arr[0]=1;
        for (int i=1;i<k;i++){
            arr[i]=Math.min(arr[dp3]*3,Math.min(arr[dp5]*5,arr[dp7]*7));
            if (arr[i]==arr[dp3]*3) dp3++;
            if (arr[i]==arr[dp5]*5) dp5++;
            if (arr[i]==arr[dp7]*7) dp7++;
        }
        return arr[k-1];
    }
}
