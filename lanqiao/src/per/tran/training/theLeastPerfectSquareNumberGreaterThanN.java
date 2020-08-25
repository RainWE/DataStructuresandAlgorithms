package per.tran.training;


import java.util.Scanner;

/**大等于n的最小完全平方数
 问题描述
 　　输出大等于n的最小的完全平方数。
 　　若一个数能表示成某个自然数的平方的形式，则称这个数为完全平方数
 　　Tips：注意数据范围
 输入格式
 　　一个整数n
 输出格式
 　　大等于n的最小的完全平方数
 样例输入
 71711
 样例输出
 71824
 数据规模和约定
 　　n是32位有符号整数
 */
public class theLeastPerfectSquareNumberGreaterThanN {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        double x=Math.sqrt(n);
        long res=0;
        //蓝桥杯的测试数据有一个负数，深坑！！！
        if(n<=0){
            res=0;
        } else if(((long)x*(long)x)==n)
            res=(long)x;
        //其他不能被开方的，转成整数会丢失精度，加1在乘方
        else res=(long) x+1;
        System.out.println(res*res);
    }
}
