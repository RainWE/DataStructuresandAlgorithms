package per.tran.basicTraining;


import java.util.Scanner;

/**
 * 问题描述
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 * 输入格式
 * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 * 输出格式
 * 输出n行，每个m个字符，为你的图形。
 * 样例输入
 * 5 7
 * 样例输出
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 数据规模与约定
 * 1 <= n, m <= 26。
 */
public class letterGraphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char str;
        //char[][] pattern=new char[n][m];      //会出现运行错误
        char[][] pattern = new char[26][26];
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            str = 'A';
            for (j = i; j < m; j++)        //此处两个循环用来控制存储字符的
            {
                pattern[i][j] = str++;
            }
            str = 'A';
            for (j = i - 1; j >= 0; j--) {
                str++;
                pattern[i][j] = str;
            }
        }

        for (i = 0; i < n; i++)    //此处用来输出字符数组元素
        {
            for (j = 0; j < m; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println("");
        }
    }
}
