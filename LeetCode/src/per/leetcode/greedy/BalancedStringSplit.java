package per.leetcode.greedy;

/** �ָ�ƽ���ַ���
 ��һ����ƽ���ַ������У�'L' �� 'R' �ַ�����������ͬ�ġ�
 ����һ��ƽ���ַ���?s�����㽫���ָ�ɾ����ܶ��ƽ���ַ�����
 ���ؿ���ͨ���ָ�õ���ƽ���ַ��������������
 ʾ�� 1��
    ���룺s = "RLRRLLRLRL"
    �����4
    ���ͣ�s ���Էָ�Ϊ "RL", "RRLL", "RL", "RL", ÿ�����ַ����ж�������ͬ������ 'L' �� 'R'��
 ʾ�� 2��
    ���룺s = "RLLLLRRRLR"
    �����3
    ���ͣ�s ���Էָ�Ϊ "RL", "LLLRRR", "LR", ÿ�����ַ����ж�������ͬ������ 'L' �� 'R'��
 ʾ�� 3��
    ���룺s = "LLLLRRRR"
    �����1
    ���ͣ�s ֻ�ܱ���ԭ�� "LLLLRRRR".
 ��ʾ��
    1 <= s.length <= 1000
    s[i] = 'L' �� 'R'
    �ָ�õ���ÿ���ַ�����������ƽ���ַ�����
 */
public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int num=0;
        int res=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='L'){
                num++;
            }else {
                num--;
            }
            if (num==0){
                res++;
            }
        }
        return res;
    }
}