package per.tran.training;


import java.util.Scanner;

/**数据交换
 问题描述
 　　编写一个程序，输入两个整数，分别存放在变量x和y当中，然后使用自己定义的函数swap来交换这两个变量的值。
 　　输入格式：输入只有一行，包括两个整数。
 　　输出格式：输出只有一行，也是两个整数，即交换以后的结果。
 　　要求：主函数负责数据的输入与输出，但不能直接交换这两个变量的值，必须通过调用单独定义的函数swap来完成，而swap函数只负责交换变量的值，不能输出交换后的结果。
 输入输出样例
 样例输入
 4 7
 样例输出
 7 4
 */
public class Swapnum {
    public static int a,b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        swap();
        System.out.println(a+" "+b);
    }
    public static void swap(){
        int temp =a;
        a=b;
        b=temp;
    }
}
