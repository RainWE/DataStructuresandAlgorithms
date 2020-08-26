package per.tran.training;

import java.util.Scanner;
import java.util.Stack;

public class expressionCalculation {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> nums = new Stack<Integer>(); // ��������
        Stack<Character> opes = new Stack<Character>(); // ���������
        String string = scanner.nextLine();
        int n = 0; // ����ÿһ������
        char[] cs = string.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char temp = cs[i];
            if (Character.isDigit(cs[i])) {
                n = 10 * n + Integer.parseInt(String.valueOf(cs[i])); // ����10�����ֱ���
            } else {
                if (n != 0) {
                    nums.push(n);
                    n = 0;
                }
                if (temp == '(') {
                    opes.push(temp);
                } else if (temp == ')') {
                    while (opes.peek() != '(') { // ��������������
                        int t = cal(nums.pop(), nums.pop(), opes.pop());
                        nums.push(t);
                    }
                    opes.pop();
                } else if (isType(temp) > 0) {
                    if (opes.isEmpty()) { // ջΪ��ֱ����ջ
                        opes.push(temp);
                    } else {
                        // ��ջ��Ԫ�����ȼ����ڻ����Ҫ��ջ��Ԫ��,��ջ��Ԫ�ص���������,Ȼ����ջ
                        if (isType(opes.peek()) >= isType(temp)) {
                            int t = cal(nums.pop(), nums.pop(), opes.pop());
                            nums.push(t);
                        }
                        opes.push(temp);
                    }
                }
            }
        }
        // ���һ���ַ���������,δ��ջ
        if (n != 0) {
            nums.push(n);
        }
        while (!opes.isEmpty()) {
            int t = cal(nums.pop(), nums.pop(), opes.pop());
            nums.push(t);
        }
        System.out.println(nums.pop());
    }

    // ���ص�������������ȼ�,���ֺ�()����Ҫ����
    public static int isType(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    // ��������Ƿ���,����ջ��ջ�����й�
    public static int cal(int m, int n, char c) {
        int sum = -987654321;
        if (c == '+') {
            sum = n + m;
        } else if (c == '-') {
            sum = n - m;
        } else if (c == '*') {
            sum = n * m;
        } else if (c == '/') {
            sum = n / m;
        }
        return sum;
    }
}