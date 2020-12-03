package per.leetcode.sort;

import java.util.Arrays;

/**�������ֶ������� 1 ����Ŀ����
 ����һ����������?arr?�����㽫�����е�Ԫ�ذ���������Ʊ�ʾ������ 1 ����Ŀ��������
 ������ڶ�����ֶ�������?1?����Ŀ��ͬ������뽫���ǰ�����ֵ��С�������С�
 ���㷵�����������顣
 ʾ�� 1��
 ���룺arr = [0,1,2,3,4,5,6,7,8]
 �����[0,1,2,4,8,3,5,6,7]
 ���ͣ�[0] ��Ψһһ���� 0 �� 1 ������
 [1,2,4,8] ���� 1 �� 1 ��
 [3,5,6] �� 2 �� 1 ��
 [7] �� 3 �� 1 ��
 ���� 1 �ĸ�������õ��Ľ������Ϊ [0,1,2,4,8,3,5,6,7]
 ʾ�� 2��
 ���룺arr = [1024,512,256,128,64,32,16,8,4,2,1]
 �����[1,2,4,8,16,32,64,128,256,512,1024]
 ���ͣ����������������������¶�ֻ�� 1 �� 1 ����������Ҫ������ֵ��С����������
 ʾ�� 3��
 ���룺arr = [10000,10000]
 �����[10000,10000]
 ʾ�� 4��
 ���룺arr = [2,3,5,7,11,13,17,19]
 �����[2,3,5,17,7,11,13,19]
 ʾ�� 5��
 ���룺arr = [10,100,1000,10000]
 �����[10,100,10000,1000]
 ��ʾ��
 1 <= arr.length <= 500
 0 <= arr[i] <= 10^4
 */
public class SortByBits {
    public static void main(String[] args) {
        //���룺arr = [0,1,2,3,4,5,6,7,8]
        // �����[0,1,2,4,8,3,5,6,7]
        //���ͣ�[0] ��Ψһһ���� 0 �� 1 ������
        // [1,2,4,8] ���� 1 �� 1 ��
        // [3,5,6] �� 2 �� 1 ��
        // [7] �� 3 �� 1 ��
//        int []arr={0,1,2,3,4,5,6,7,8};


        //���룺arr = [1024,512,256,128,64,32,16,8,4,2,1]
        // �����[1,2,4,8,16,32,64,128,256,512,1024]
        int []arr={1024,512,256,128,64,32,16,8,4,2,1};
        int[] ints = sortByBits(arr);
        for (int i:ints){
            System.out.printf(" "+i);
        }
    }
    public static int[] sortByBits(int[] arr) {
        int list[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            list[i]=Integer.bitCount(arr[i])*10000000+arr[i];
        }
        Arrays.sort(list);
        for (int i=0;i<arr.length;i++){
            list[i]=list[i]%10000000;
        }
        return list;
    }
    public static int[] sortByBits_1(int[] arr){
        int list[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            list[i]=Integer.bitCount(arr[i])*10000000+arr[i];
        }
        Arrays.sort(list);
        for (int i=0;i<arr.length;i++){
            list[i]=list[i]%10000000;
        }
        return list;
    }
}