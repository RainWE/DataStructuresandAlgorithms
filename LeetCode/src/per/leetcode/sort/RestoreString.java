package per.leetcode.sort;

/**���������ַ���
 ����һ���ַ��� s ��һ�� ������ͬ ���������� indices ��
 �������������ַ��� s �����е� i ���ַ���Ҫ�ƶ��� indices[i] ָʾ��λ�á�
 �����������к���ַ�����
 ʾ�� 1��
 ���룺s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 �����"leetcode"
 ���ͣ���ͼ��ʾ��"codeleet" �������к��Ϊ "leetcode" ��
 ʾ�� 2��
 ���룺s = "abc", indices = [0,1,2]
 �����"abc"
 ���ͣ��������к�ÿ���ַ���������ԭ����λ���ϡ�
 ʾ�� 3��
 ���룺s = "aiohn", indices = [3,1,4,2,0]
 �����"nihao"
 ʾ�� 4��
 ���룺s = "aaiougrt", indices = [4,0,2,6,7,3,1,5]
 �����"arigatou"
 ʾ�� 5��
 ���룺s = "art", indices = [1,0,2]
 �����"rat"
 ��ʾ��
 s.length == indices.length == n
 1 <= n <= 100
 s ������СдӢ����ĸ��
 0 <= indices[i] <?n
 indices �����е�ֵ����Ψһ�ģ�Ҳ����˵��indices ������ 0 �� n - 1 �γɵ�һ�����У���
 */
public class RestoreString {
    public String restoreString(String s, int[] indices) {
        int length = s.length();
        char [] chars = new char[length];
        for (int i=0;i<length;i++){
            chars[indices[i]]=s.charAt(i);
        }
        return new String(chars);
    }
}
