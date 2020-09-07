package per.leetcode.sort;


import java.util.Arrays;

/**��Ч����ĸ��λ��
 ���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ����ĸ��λ�ʡ�
 ʾ��?1:
 ����: s = "anagram", t = "nagaram"
 ���: true
 ʾ�� 2:
 ����: s = "rat", t = "car"
 ���: false
 ˵��:
 ����Լ����ַ���ֻ����Сд��ĸ��
 ����:
 ��������ַ������� unicode �ַ���ô�죿���ܷ������Ľⷨ��Ӧ�����������
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);
        String s1 = new String(sc);
        String t1 = new String(st);
        return s1.equals(t1);
    }
}
