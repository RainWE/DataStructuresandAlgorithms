package per.tran.training;


import java.util.Scanner;

/**���ݽ���
 ��������
 ������дһ���������������������ֱ����ڱ���x��y���У�Ȼ��ʹ���Լ�����ĺ���swap������������������ֵ��
 ���������ʽ������ֻ��һ�У���������������
 ���������ʽ�����ֻ��һ�У�Ҳ�������������������Ժ�Ľ����
 ����Ҫ���������������ݵ������������������ֱ�ӽ���������������ֵ������ͨ�����õ�������ĺ���swap����ɣ���swap����ֻ���𽻻�������ֵ���������������Ľ����
 �����������
 ��������
 4 7
 �������
 7 4
 */
public class Swapnum {
    public static int a,b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        swap();
        System.out.println(a+" "+b);
    }
    public static void swap(){
        int temp =a;
        a=b;
        b=temp;
    }
}
