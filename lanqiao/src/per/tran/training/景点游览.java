package per.tran.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**��������
 ��������
 ����С������һ���������棬��������ʱ�����ޣ�û�취������еľ��㣬������������������ÿ����������֣���ϣ���ܹ�ʹ�����ľ���������ܺ���ߣ�������ϣ�����������N������������
 �����ʽ
 ��������ĵ�һ�а���һ��������N����ʾN�����㡣
 �����ڶ�����N������������ʾÿ�����������ֵ��
 �����ʽ
 �������һ�У�����N������������ʾN����������ִӴ�С������
 ��������
 4
 3 2 4 1
 �������
 4 3 2 1
 ���ݹ�ģ��Լ��
 ����N<=1000,ÿ�����������<=10000��
 */
public class �������� {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Integer arr[]=new Integer[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i:arr){
            System.out.printf("%d ",i);
        }
    }
}
