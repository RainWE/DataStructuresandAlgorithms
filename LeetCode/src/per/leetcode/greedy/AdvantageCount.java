package per.leetcode.greedy;

import java.util.*;

/**优势洗牌
 给定两个大小相等的数组?A?和?B，A 相对于 B 的优势可以用满足?A[i] > B[i]?的索引 i?的数目来描述。
 返回?A?的任意排列，使其相对于 B?的优势最大化。
 示例 1：
 输入：A = [2,7,11,15], B = [1,10,4,11]
 输出：[2,11,7,15]
 示例 2：A[8 12 24 32]
 输入：A = [12,24,8,32], B = [13,25,32,11]
 输出：[24,32,8,12]
 提示：
 1 <= A.length = B.length <= 10000
 0 <= A[i] <= 10^9
 0 <= B[i] <= 10^9
 */
public class AdvantageCount {
    public static void main(String[] args) {
        int A[]={12,24,8,32};
        int B[]={13,25,32,11};
        advantageCount(A,B);
    }
    public static int[] advantageCount(int[] A, int[] B) {
        int[] sortedA = A.clone();
        Arrays.sort(sortedA);
        int[] sortedB = B.clone();
        Arrays.sort(sortedB);

        // assigned[b] = list of a that are assigned to beat b
        Map<Integer, Deque<Integer>> assigned = new HashMap();
        for (int b: B) assigned.put(b, new LinkedList());

        // remaining = list of a that are not assigned to any b
        Deque<Integer> remaining = new LinkedList();

        // populate (assigned, remaining) appropriately
        // sortedB[j] is always the smallest unassigned element in B
        int j = 0;
        for (int a: sortedA) {
            if (a > sortedB[j]) {
                assigned.get(sortedB[j++]).add(a);
            } else {
                remaining.add(a);
            }
        }

        // Reconstruct the answer from annotations (assigned, remaining)
        int[] ans = new int[B.length];
        for (int i = 0; i < B.length; ++i) {
            // if there is some a assigned to b...
            if (assigned.get(B[i]).size() > 0)
                ans[i] = assigned.get(B[i]).pop();
            else
                ans[i] = remaining.pop();
        }
        return ans;


    }
    public static int[] advantageCount_1(int[] A, int[] B){
        int[] sortedA = A.clone();
        Arrays.sort(sortedA);
        int[] sortedB = B.clone();
        Arrays.sort(sortedB);

        Map<Integer,Deque<Integer>> map = new HashMap<>();
        for (int b:B){
            map.put(b,new LinkedList<>());
        }
        Deque<Integer> remian = new LinkedList<>();

        int j=0;
        for (int a:sortedA){
            if (a>sortedB[j]){
                map.get(sortedB[j++]).add(a);
            }else {
                remian.add(a);
            }
        }
        int res[]= new int[B.length];
        for (int i=0;i<B.length;i++){
            if (map.get(B[i]).size()>0){
                res[i] = map.get(B[i]).pop();
            }else {
                res[i]=remian.pop();
            }
        }

        return res;
    }
}
