package per.tran.training;

import java.util.Scanner;

/**
 　　从键盘输入一个大写字母，要求改用小写字母输出。
 输入
 　　A
 输出
 　　a
 */
public class P0103 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String c=scanner.next();
        String s = c.toLowerCase();
        System.out.println(s);

    }
}
