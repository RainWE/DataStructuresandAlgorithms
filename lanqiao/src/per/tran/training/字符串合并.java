package per.tran.training;


import java.util.Scanner;

/**�ַ����ϲ�
 ��������
 �������������ַ���������ϲ�Ϊһ���ַ����������
 �����ʽ
 �������������ַ���
 �����ʽ
 ��������ϲ�����ַ���
 ��������
 һ��������ĿҪ������뷶����
 Hello
 World
 �������
 HelloWorld
 ���ݹ�ģ��Լ��
 ����������ַ�������0<n<100
 */
public class �ַ����ϲ� {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str1 = new StringBuilder(scanner.next());
        StringBuilder str2 = new StringBuilder(scanner.next());
        str1.append(str2);
        System.out.println(str1);
    }
}
