package per.tran.training;


import java.util.Scanner;

/**二进制数数
 问题描述
 　　给定L,R。统计[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
 　　如5的二进制为101，包含2个“1”。
 输入格式
 　　第一行包含2个数L,R
 输出格式
 　　一个数S，表示[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
 样例输入
 2 3   4   5
 10 11 100 101
 样例输出
 3
 数据规模和约定
 　　L<=R<=100000;
 */
public class binaryNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int count=0,a,b;
        for (int i=L;i<=R;i++){
            a=i;
            while (a!=0){
                b=a%2;
                if (b==1) count++;
                a/=2;
            }
        }
        System.out.println(count);
    }
}
