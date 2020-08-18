package per.leetcode.array;


import java.util.Arrays;

/**判定是否互为字符重排
 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 示例 1：
 输入: s1 = "abc", s2 = "bca"
 输出: true
 示例 2：
 输入: s1 = "abc", s2 = "bad"
 输出: false
 说明：
 0 <= len(s1) <= 100
 0 <= len(s2) <= 100
 */
public class CheckPermutation {
    public boolean checkPermutation(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i=0;i<chars1.length;i++){
            if (chars1[i]==chars2[i]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
