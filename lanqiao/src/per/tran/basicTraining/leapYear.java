package per.tran.basicTraining;

import java.util.Scanner;

/**�����ж�
 ��������
 ����һ����ݣ��ж���һ���ǲ������ꡣ
 ���������֮һ����ʱ����һ�������꣺
 1. �����4�ı���������100�ı�����
 2. �����400�ı�����
 ��������ݶ��������ꡣ
 �����ʽ
 �������һ������y����ʾ��ǰ����ݡ�
 �����ʽ
 ���һ�У������������������꣬�����yes���������no��
 ˵����������ָ�������һ���ַ�����Ϊ��������籾���yes����no������Ҫ�ϸ��������и����Ĵ�Сд��д���Сд�����÷֡�
 ��������
 2013
 �������
 no
 ��������
 2016
 �������
 yes
 ���ݹ�ģ��Լ��
 1990 <= y <= 2050��
 */
public class leapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year =scanner.nextInt();
        if ((year%4==0 && year%100 !=0 )|| year%400==0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
