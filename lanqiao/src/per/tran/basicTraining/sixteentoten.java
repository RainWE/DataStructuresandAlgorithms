package per.tran.basicTraining;

import java.util.Scanner;

/**十六进制转十进制
 问题描述
 　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
 　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 样例输入
 FFFF
 样例输出
 65535
 */
public class sixteentoten {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String hex_num = scanner.nextLine();
        long dec_num = Long.parseLong(hex_num, 16);
        System.out.println(dec_num);
    }
}
