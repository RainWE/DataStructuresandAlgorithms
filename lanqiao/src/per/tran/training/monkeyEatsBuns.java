package per.tran.training;


import java.util.Scanner;

/**���ӳ԰���
 ��������
 ������ǰ����һֻ�԰��Ӻ������ĺ��ӣ������Գ����������ӣ����ǣ����Բ�ͬ�İ����ٶ�Ҳ��ͬ�����ÿ���ӳ�x�����²˰�ÿ���ӳ�y����
 û���ڵİ���ÿ���ӳ�z����������x1�������y1���²˰���z1��û���ڵİ��ӣ��ʣ����ӳ�����Щ����Ҫ��ã��������pλС����
 �����ʽ
 ��������1�У�����7���������ֱ��ʾ�Բ�ͬ���ӵ��ٶȺͲ�ͬ���ӵĸ����ͱ�����λ����
 �����ʽ
 �������һ�У�����1��ʵ������ʾ�������а��ӵ�ʱ�䡣
 ��������
 4 3 2 20 30 15 2
 �������
 22.50
 ���ݹ�ģ��Լ��
 ����0<x<100;0<y<100;0<z<100;0<x1<=1000000;0<y1<=10000000;0<z1<=10000000;0<p<=1000

 */
public class monkeyEatsBuns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        int p = sc.nextInt();
        double result=x1/x+y1/y+z1/z;
        System.out.printf("%."+p+"f",result);
    }
}
