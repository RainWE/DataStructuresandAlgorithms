package per.leetcode.sort;

import java.util.Arrays;

/**�ж��ܷ��γɵȲ�����
 ����һ���������� arr ��
 ���һ�������У�������������Ĳ��ܵ���ͬһ����������ô������оͳ�Ϊ �Ȳ����� ��
 ��������������������γɵȲ����У��뷵�� true �����򣬷��� false ��
 ʾ�� 1��
 ���룺arr = [3,5,1]
 �����true
 ���ͣ���������������õ� [1,3,5] ���� [5,3,1] ��������������Ĳ�ֱ�Ϊ 2 �� -2 �������γɵȲ����С�
 ʾ�� 2��
 ���룺arr = [1,2,4]
 �����false
 ���ͣ��޷�ͨ����������õ��Ȳ����С�
 ��ʾ��
 2 <= arr.length <= 1000
 -10^6 <= arr[i] <= 10^6
 */
public class CanMakeArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]-arr[i-1]==diff){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
