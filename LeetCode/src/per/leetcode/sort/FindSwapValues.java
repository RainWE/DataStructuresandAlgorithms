package per.leetcode.sort;


import java.util.HashSet;
import java.util.Set;

/**
 * 交换和
 * 给定两个整数数组，请交换一对数值（每个数组中取一个数值），使得两个数组所有元素的和相等。
 * 返回一个数组，第一个元素是第一个数组中要交换的元素，第二个元素是第二个数组中要交换的元素。
 * 若有多个答案，返回任意一个均可。若无满足条件的数值，返回空数组。
 * 示例:
 * 输入: array1 = [4, 1, 2, 1, 1, 2], array2 = [3, 6, 3, 3]
 * 输出: [1, 3]
 * 示例:
 * 输入: array1 = [1, 2, 3], array2 = [4, 5, 6]
 * 输出: []
 * 提示：
 * 1 <= array1.length, array2.length <= 100000
 */
public class FindSwapValues {

    Set<Integer> set = new HashSet<>();

    /**
     * 1.数组array1中元素的和aSum，数组array2中的元素和bSum,需要满足 (aSum + bSum) / 2 == 0 否则没有结果
     * 2.其次需要满足 aSum - a + b = bSum + a - b ,换算成a -  b = (aSum - bSum) / 2; 也就是在判断这样的b是否存在的问题。
     *
     * @param array1
     * @param array2
     * @return //aSum - a + b = bSum + a - b  ===>a -  b = (aSum - bSum) / 2
     */
    public int[] findSwapValues(int[] array1, int[] array2) {
        int aSum = 0, bSum = 0;
        for (int a:array1){
            aSum+=a;
        }
        for (int b:array2){
            bSum+=b;
            set.add(b);
        }
        if ((aSum + bSum) % 2 != 0) {
            return new int[]{};
        }
        int diff = (aSum - bSum) / 2;
        for (int a : array1) {
            if (set.contains(a - diff)) {
                return new int[]{a, a - diff};
            }
        }
        return new int[]{};
    }


}
