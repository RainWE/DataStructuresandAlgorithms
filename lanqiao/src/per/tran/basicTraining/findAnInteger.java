package per.tran.basicTraining;

import java.util.Arrays;
import java.util.Scanner;

/**��������
 ��������
 ����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����
 �����ʽ
 ��һ�а���һ������n��
 �ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��
 �����а���һ������a��Ϊ�����ҵ�����
 �����ʽ
 ���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1��
 ��������
 6
 1 9 4 8 3 9
 9
 �������
 2
 ���ݹ�ģ��Լ��
 1 <= n <= 1000��
 */
public class findAnInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int serachnum=scanner.nextInt();
        boolean flag=false;
        int index=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=serachnum){
                flag=false;
            }else {
                index=i+1;
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println(index);
        }else{
            System.out.println("-1");
        }
    }
}
