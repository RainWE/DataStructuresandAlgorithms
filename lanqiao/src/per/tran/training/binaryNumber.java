package per.tran.training;


import java.util.Scanner;

/**����������
 ��������
 ��������L,R��ͳ��[L,R]�����ڵ��������ڶ������°����ġ�1���ĸ���֮�͡�
 ������5�Ķ�����Ϊ101������2����1����
 �����ʽ
 ������һ�а���2����L,R
 �����ʽ
 ����һ����S����ʾ[L,R]�����ڵ��������ڶ������°����ġ�1���ĸ���֮�͡�
 ��������
 2 3   4   5
 10 11 100 101
 �������
 3
 ���ݹ�ģ��Լ��
 ����L<=R<=100000;
 */
public class binaryNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int count=0,a,b;
        for (int i=L;i<=R;i++){
            a=i;
            while (a!=0){
                b=a%2;
                if (b==1) count++;
                a/=2;
            }
        }
        System.out.println(count);
    }
}
