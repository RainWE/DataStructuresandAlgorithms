package per.tran.training;

import java.util.Scanner;

/**1�ĸ���
 ��������
 ��������������n���жϴ�1��n֮�У�����1һ��Ҫ���ּ��Ρ�����1123������������������1������15����ô��1��15֮�У�һ��������8��1��
 �����ʽ
 ����һ��������n
 �����ʽ
 ����һ����������ʾ1���ֵ�����
 ��������
 15
 �������
 8
 ���ݹ�ģ��Լ��
 ����n������30000
 */
public class onecount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //ʹ����������Ҫ��ʱ�ùرգ���ֹռ�ڴ�
        sc.close();

        //�Ȱ����еñ�����������
        int count = 0,a,b;
        for (int i=0;i<=n;i++){
            a=i;
            while (a!=0){
                b=a%10;
                if (b==1) count++;
                a/=10;
            }
        }
        System.out.println(count);
    }
}
