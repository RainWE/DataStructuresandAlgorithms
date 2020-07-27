package per.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**�ж��ַ��Ƿ�Ψһ
 ʵ��һ���㷨��ȷ��һ���ַ��� s �������ַ��Ƿ�ȫ����ͬ��
 ʾ�� 1��
 ����: s = "leetcode"
 ���: false
 ʾ�� 2��
 ����: s = "abc"
 ���: true
 ���ƣ�0 <= len(s) <= 100
 ����㲻ʹ�ö�������ݽṹ����ܼӷ֡�
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
