package per.tran.training;


import java.util.Scanner;

/**�����n����С��ȫƽ����
 ��������
 ������������n����С����ȫƽ������
 ������һ�����ܱ�ʾ��ĳ����Ȼ����ƽ������ʽ����������Ϊ��ȫƽ����
 ����Tips��ע�����ݷ�Χ
 �����ʽ
 ����һ������n
 �����ʽ
 ���������n����С����ȫƽ����
 ��������
 71711
 �������
 71824
 ���ݹ�ģ��Լ��
 ����n��32λ�з�������
 */
public class theLeastPerfectSquareNumberGreaterThanN {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        double x=Math.sqrt(n);
        long res=0;
        //���ű��Ĳ���������һ����������ӣ�����
        if(n<=0){
            res=0;
        } else if(((long)x*(long)x)==n)
            res=(long)x;
        //�������ܱ������ģ�ת�������ᶪʧ���ȣ���1�ڳ˷�
        else res=(long) x+1;
        System.out.println(res*res);
    }
}
