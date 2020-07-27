package per.leetcode.string;

/**
 * ����ת�ַ���
 * �ַ���������ת�����ǰ��ַ���ǰ������ɸ��ַ�ת�Ƶ��ַ�����β�����붨��һ������ʵ���ַ�������ת�����Ĺ��ܡ�
 * ���磬�����ַ���"abcdefg"������2���ú�������������ת��λ�õ��Ľ��"cdefgab"��
 * ʾ�� 1��
 * ����: s = "abcdefg", k = 2
 * ���:?"cdefgab"
 * ʾ�� 2��
 * ����: s = "lrloseumgh", k = 6
 * ���:?"umghlrlose"
 * ���ƣ�1 <= k < s.length <= 10000
 */
public class ReverseLeftWords {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseLeftWords(s, k));
    }

    public static String reverseLeftWords(String s, int n) {
        StringBuilder prestr = new StringBuilder(s.substring(0, n));
        StringBuilder laststr = new StringBuilder(s.substring(n, s.length()));
        laststr.append(prestr);
        return laststr.toString();
    }
}
