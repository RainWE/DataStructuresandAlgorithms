package per.leetcode.array;


import java.util.Arrays;

/**�ж��Ƿ�Ϊ�ַ�����
 ���������ַ��� s1 �� s2�����дһ������ȷ������һ���ַ������ַ��������к��ܷ�����һ���ַ�����
 ʾ�� 1��
 ����: s1 = "abc", s2 = "bca"
 ���: true
 ʾ�� 2��
 ����: s1 = "abc", s2 = "bad"
 ���: false
 ˵����
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
