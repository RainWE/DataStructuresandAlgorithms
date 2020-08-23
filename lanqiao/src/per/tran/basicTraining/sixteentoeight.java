package per.tran.basicTraining;

import java.util.Scanner;

/**
 * 十六进制转八进制
 * 问题描述
 * 　　给定n个十六进制正整数，输出它们对应的八进制数。
 * 输入格式
 * 　　输入的第一行为一个正整数n （1<=n<=10）。
 * 　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
 * 输出格式
 * 　　输出n行，每行为输入对应的八进制正整数。
 * 　　【注意】
 * 　　输入的十六进制数不会有前导0，比如012A。
 * 　　输出的八进制数也不能有前导0。
 * 样例输入
 * 　　2
 * 　　39
 * 　　123ABC
 * 样例输出
 * 　　71
 * 　　4435274
 * 　　【提示】
 * 　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
 */
public class sixteentoeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] result = new String[11];//保存最后输出的结果
        /*十六进制转化为二进制*/
        for (int i = 0; i < n; i++) {
            String h = in.next();
            StringBuilder tempB = new StringBuilder();
            for (int m = 0; m < h.length(); m++) {
                char numH = h.charAt(m);
                String b = Integer.toBinaryString(Integer.valueOf(String.valueOf(numH), 16));

                for (int k = b.length(); k < 4; k++) {
                    b = '0' + b;
                }

                tempB.append(b);
            }
            /*二进制转化为八进制*/
            StringBuilder tempO = new StringBuilder();//长度变为3的倍数，需要补的前导0的个数
            int addZero = 3 - tempB.length() % 3;
            for (int p = 0; p < addZero; p++) {
                tempB = new StringBuilder("0").append(tempB);
            }
            for (int m = 0; m < tempB.length(); m += 3) {
                //把字符串长度转换为三的倍数添加前导0
                String numB = tempB.substring(m, m + 3);
                String o = Integer.toOctalString(Integer.valueOf(String.valueOf(numB), 2));
                tempO.append(o);
            }
            result[i] = tempO.toString().replaceAll("^(0+)", "");//用正则表达式去掉前导零
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
