package per.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**��������
 ����һ���ַ�������дһ�������ж����Ƿ�Ϊĳ�����Ĵ�������֮һ��
 ���Ĵ���ָ������������һ���ĵ��ʻ���������ָ��ĸ���������С�
 ���Ĵ���һ�����ֵ䵱�еĵ��ʡ�
 ʾ��1��
 ���룺"tactcoa"
 �����true��������"tacocat"��"atcocta"���ȵȣ�
 */
public class CanPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char c:chars){
            if (set.contains(c)){
                set.remove(c);
            }else {
                set.add(c);
            }
        }
        return set.size()>1?false:true;
    }
}
