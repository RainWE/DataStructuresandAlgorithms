package per.tran.basicTraining;

import java.util.Scanner;

/**���������
 ��������
 ����123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
 ��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��
 �����ʽ
 ��������һ�У�����һ��������n��
 �����ʽ
 ��������С�����˳���������������������ÿ������ռһ�С�
 ��������
 52
 �������
 899998
 989989
 998899
 ���ݹ�ģ��Լ��
 ����1<=n<=54��
 */
public class numberOfSpecialPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=10000;i<1000000;i++){
            char chars[] = (i+"").toCharArray();
            int sum=0;
            for (char s:chars){
                sum+=Integer.parseInt(s+"");
            }
            if (n==sum){
                if (chars.length==5){
                    if (chars[0]==chars[4]){
                        if (chars[1]==chars[3]){
                            System.out.println(i);
                        }
                    }
                }else {
                    if (chars[0]==chars[5]){
                        if (chars[1]==chars[4]){
                            if (chars[2]==chars[3]){
                                System.out.println(i);
                            }
                        }
                    }
                }
            }

        }
    }
}
