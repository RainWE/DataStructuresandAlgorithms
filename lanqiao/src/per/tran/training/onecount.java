package per.tran.training;

import java.util.Scanner;

/**1的个数
 问题描述
 　　输入正整数n，判断从1到n之中，数字1一共要出现几次。例如1123这个数，则出现了两次1。例如15，那么从1到15之中，一共出现了8个1。
 输入格式
 　　一个正整数n
 输出格式
 　　一个整数，表示1出现的资料
 样例输入
 15
 样例输出
 8
 数据规模和约定
 　　n不超过30000
 */
public class onecount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //使用完输入流要及时得关闭，防止占内存
        sc.close();

        //先把所有得变量都声明了
        int count = 0,a,b;
        for (int i=0;i<=n;i++){
            a=i;
            while (a!=0){
                b=a%10;
                if (b==1) count++;
                a/=10;
            }
        }
        System.out.println(count);
    }
}
