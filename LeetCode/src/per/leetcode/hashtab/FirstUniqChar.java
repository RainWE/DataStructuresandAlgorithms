package per.leetcode.hashtab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**第一个只出现一次的字符
 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 示例:
 s = "abaccdeff"
 返回 "b"
 s = ""
 返回 " "
 限制：
 0 <= s 的长度 <= 50000
 */
public class FirstUniqChar {
    //哈希表
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map= new HashMap<>();
        char []cs=s.toCharArray();
        for (char c:cs){
            map.put(c,!map.containsKey(c));
        }
        for (char c:cs){
            if (map.get(c)) return c;
        }
        return ' ';
    }
    //有序哈希表
    public char firstUniqChar2(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(Map.Entry<Character, Boolean> d : dic.entrySet()){
            if(d.getValue()) return d.getKey();
        }
        return ' ';
    }

}
