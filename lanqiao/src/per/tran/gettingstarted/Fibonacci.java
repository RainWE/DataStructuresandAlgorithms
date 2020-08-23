package per.tran.gettingstarted;

import java.util.Scanner;

/**
 * ��������
 * Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��
 * ��n�Ƚϴ�ʱ��FnҲ�ǳ�������������֪����Fn����10007�������Ƕ��١�
 * �����ʽ
 * �������һ������n��
 * �����ʽ
 * ���һ�У�����һ����������ʾFn����10007��������
 * ˵�����ڱ����У�����Ҫ��Fn����10007���������������ֻҪ���������������ɣ�������Ҫ�ȼ����Fn��׼ȷֵ���ٽ�����Ľ������10007ȡ������ֱ�Ӽ������������������ԭ����ȡ��򵥡�
 * ��������
 * 10
 * �������
 * 55
 * ��������
 * 22
 * �������
 * 7704
 * ���ݹ�ģ��Լ��
 * 1 <= n <= 1,000,000��
 */
public class Fibonacci {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            long f1 = 1, f2 = 1;
            long result = 0, sum = 0;
            if (n == 1 || n == 2) {
                result = 1;
            } else {
                for (int i = 3; i <= n; i++) {
                    sum = f1 + f2;
                    f2 = f1;
                    f1 = sum % 10007;
                }
                result = sum % 10007;
            }
            System.out.print(result);
        }
}
