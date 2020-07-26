package per.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 字母大小写全排列
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 * 示例:
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * 输入: S = "3z4"
 * 输出: ["3z4", "3Z4"]
 * 输入: S = "12345"
 * 输出: ["12345"]
 * 注意：S?的长度不超过12。
 * S?仅由数字和字母组成。
 */
public class LetterCasePermutation {
    public static void main(String[] args) {
        String S = "a1b2";
        List<String> list = letterCasePermutation_1(S);
        for (String str : list) {
            System.out.println(str);
        }

    }

    public static List<String> letterCasePermutation(String S) {
        List<StringBuilder> ans = new ArrayList();
        ans.add(new StringBuilder());
        for (char c: S.toCharArray()) {
            int n = ans.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < n; ++i) {
                    ans.add(new StringBuilder(ans.get(i)));
                    ans.get(i).append(Character.toLowerCase(c));
                    ans.get(n+i).append(Character.toUpperCase(c));
                }
            } else {
                for (int i = 0; i < n; ++i)
                    ans.get(i).append(c);
            }
        }
        List<String> finalans = new ArrayList();
        for (StringBuilder sb: ans)
            finalans.add(sb.toString());
        return finalans;
    }
    public static List<String> letterCasePermutation_1(String S){
        List<StringBuilder> list  = new ArrayList<>();
        list.add(new StringBuilder());
        for (char c :S.toCharArray()){
            int n=list.size();
            if(Character.isLetter(c)){
                for (int i=0;i<n;i++){
                    list.add(new StringBuilder(list.get(i)));
                    list.get(i).append(Character.toUpperCase(c));
                    list.get(i+n).append(Character.toLowerCase(c));
                }
            }else {
                for (int i=0;i<list.size();i++){
                    list.get(i).append(c);
                }
            }
        }
        List<String> res = new ArrayList<>();
        for (StringBuilder s:list){
            res.add(s.toString());
        }
        return res;
    }
}
