package per.tran.basicTraining;

/**特殊的数字
 问题描述
 　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 输出格式
 　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */
public class specialNumber {
    public static void main(String[] args) {
        int a,b,c;
        int sum;
        for (int i=100;i<1000;i++){
             a=i%10;
             b=i/10%10;
             c=i/100;
             sum=a*a*a+b*b*b+c*c*c;
             if (i==sum){
                 System.out.println(i);
             }
        }
    }
}
