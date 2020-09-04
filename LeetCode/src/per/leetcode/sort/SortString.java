package per.leetcode.sort;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * �����½��ַ���
 * ����һ���ַ���s���������������㷨���¹����ַ�����
 * �� s ��ѡ�� ��С���ַ������� ���ڽ���ַ����ĺ��档
 * �� sʣ���ַ���ѡ����С���ַ����Ҹ��ַ�����һ����ӵ��ַ��󣬽��� ���ڽ���ַ������档
 * �ظ����� 2 ��ֱ����û���� s��ѡ���ַ���
 * �� s��ѡ�� �����ַ������� ���ڽ���ַ����ĺ��档
 * �� sʣ���ַ���ѡ�������ַ����Ҹ��ַ�����һ����ӵ��ַ�С���������ڽ���ַ������档
 * �ظ����� 5��ֱ����û���� s��ѡ���ַ���
 * �ظ����� 1 �� 6 ��ֱ�� s�������ַ����Ѿ���ѡ����
 * ���κ�һ���У������С��������ַ���ֹһ���������ѡ����������һ������������ӵ�����ַ�����
 * ���㷵�ؽ�s���ַ����������� ����ַ��� ��
 * ʾ�� 1��
 * ���룺s = "aaaabbbbcccc"
 * �����"abccbaabccba"
 * ���ͣ���һ�ֵĲ��� 1��2��3 �󣬽���ַ���Ϊ result = "abc"
 * ��һ�ֵĲ��� 4��5��6 �󣬽���ַ���Ϊ result = "abccba"
 * ��һ�ֽ��������� s = "aabbcc" �������ٴλص����� 1
 * �ڶ��ֵĲ��� 1��2��3 �󣬽���ַ���Ϊ result = "abccbaabc"
 * �ڶ��ֵĲ��� 4��5��6 �󣬽���ַ���Ϊ result = "abccbaabccba"
 * ʾ�� 2��
 * ���룺s = "rat"
 * �����"art"
 * ���ͣ����� "rat" �������㷨�������Ժ��� "art"
 * ʾ�� 3��
 * ���룺s = "leetcode"
 * �����"cdelotee"
 * ʾ�� 4��
 * ���룺s = "ggggggg"
 * �����"ggggggg"
 * ʾ�� 5��
 * ���룺s = "spo"
 * �����"ops"
 * ��ʾ��
 * 1 <= s.length <= 500
 * s?ֻ����СдӢ����ĸ��
 */
public class SortString {
    public String sortString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray())
            count[c - 'a'] += 1;
        StringBuilder res = new StringBuilder();
        while (res.length() != s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i] == 0)
                    continue;
                res.append((char) (i + 'a'));
                count[i] -= 1;
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] == 0)
                    continue;
                res.append((char) (i + 'a'));
                count[i] -= 1;
            }
        }
        return res.toString();
    }

    public String sortString_1(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a'] += 1;
        }
        StringBuilder res = new StringBuilder();
        while (res.length() != s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i] == 0)
                    continue;
                res.append((char)(i + 'a'));
                count[i]--;
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] == 0)
                    continue;
                res.append((char)(i + 'a'));
                count[i]--;
            }
        }
        return res.toString();
    }
}
