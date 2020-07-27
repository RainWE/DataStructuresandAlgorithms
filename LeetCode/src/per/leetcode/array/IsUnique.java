package per.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**判定字符是否唯一
 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 示例 1：
 输入: s = "leetcode"
 输出: false
 示例 2：
 输入: s = "abc"
 输出: true
 限制：0 <= len(s) <= 100
 如果你不使用额外的数据结构，会很加分。
 */
public class IsUnique {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(isUnique(s));
    }
    public static boolean isUnique(String astr) {
        Map<Character,Integer> map = new HashMap<>();
        for (char s:astr.toCharArray()){
            if (!map.containsKey(s)){
                map.put(s,1);
            }else {
                return false;
            }
        }
        return true;
    }
}
