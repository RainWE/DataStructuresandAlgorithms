package per.tran.basicTraining;

import java.util.Arrays;
import java.util.Scanner;

/**��������
 ��������
 ��������һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
 �����ʽ
 ������һ��Ϊһ������n��
 �����ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
 �����ʽ
 �������һ�У�����С�����˳��������������С�
 ��������
 5
 8 3 6 4 9
 �������
 3 4 6 8 9
 */
public class arraysort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i:arr){
            System.out.printf(i+" ");
        }
    }
}
