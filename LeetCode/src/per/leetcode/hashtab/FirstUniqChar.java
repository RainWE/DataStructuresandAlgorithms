package per.leetcode.hashtab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**��һ��ֻ����һ�ε��ַ�
 ���ַ��� s ���ҳ���һ��ֻ����һ�ε��ַ������û�У�����һ�����ո� s ֻ����Сд��ĸ��
 ʾ��:
 s = "abaccdeff"
 ���� "b"
 s = ""
 ���� " "
 ���ƣ�
 0 <= s �ĳ��� <= 50000
 */
public class FirstUniqChar {
    //��ϣ��
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
    //�����ϣ��
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
