package per.leetcode.greedy;

/**�ж�������
 �����ַ��� s �� t ���ж� s �Ƿ�Ϊ t �������С�
 �������Ϊ s �� t �н�����Ӣ��Сд��ĸ���ַ��� t ���ܻ�ܳ������� ~= 500,000����
 �� s �Ǹ����ַ��������� <=100����
 �ַ�����һ����������ԭʼ�ַ���ɾ��һЩ��Ҳ���Բ�ɾ�����ַ������ı�ʣ���ַ����λ���γɵ����ַ�����
 �����磬"ace"��"abcde"��һ�������У���"aec"���ǣ���
 ʾ��?1:
 s = "abc", t = "ahbgdc"
 ����?true.
 ʾ��?2:
 s = "axc", t = "ahbgdc"
 ����?false.
 ������ս :
 ����д�������� S������S1, S2, ... , Sk ���� k >= 10�ڣ�
 ����Ҫ���μ�������Ƿ�Ϊ T �������С�����������£���������ı���룿
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            int count = t.indexOf(chars[i]);
            if (count==-1){
                return false;
            }
            t=t.substring(count+1);
        }
        return true;
    }

    //˫ָ��
    public boolean isSubsequence_1(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
