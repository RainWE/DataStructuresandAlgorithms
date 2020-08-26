package per.tran.training;

import java.util.Scanner;

public class 最小公倍数 {
    //最小公倍数等于它们所有的质因数的乘积（如果有几个质因数相同，则比较两数中哪个数有该质因数的个数较多，乘较多的次数）
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a * b;
        if (a < b) {
            int r = 0;
            r = a;
            a = b;
            b = r;
        }
        while (true) {
            int r = a % b;
            if (r == 0) {
                System.out.println(c / b);
                break;
            } else {
                a = b;
                b = r;
            }
        }
    }
}
