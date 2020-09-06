package per.leetcode.sort;


import java.util.Arrays;

/**������������
 �����������飬arr1 ��?arr2��
 arr2?�е�Ԫ�ظ�����ͬ
 arr2 �е�ÿ��Ԫ�ض�������?arr1?��
 �� arr1?�е�Ԫ�ؽ�������ʹ arr1 ��������˳���?arr2?�е����˳����ͬ��δ��?arr2?�г��ֹ���Ԫ����Ҫ�����������?arr1?��ĩβ��
 ʾ����
 ���룺arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 �����[2,2,2,1,4,3,3,9,6,7,19]
 ��ʾ��
 arr1.length, arr2.length <= 1000
 0 <= arr1[i], arr2[i] <= 1000
 arr2?�е�Ԫ��?arr2[i]?������ͬ
 arr2 �е�ÿ��Ԫ��?arr2[i]?��������?arr1?��
 */
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int []count=new int[1001];
        for (int i:arr1){
            count[i]++;
        }
        int index=0;
        for (int i:arr2){
            while (count[i]>0){
                arr1[index++]=i;
                count[i]--;
            }
        }
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                arr1[index++]=i;
                count[i]--;
            }
        }
        return arr1;
    }
}
