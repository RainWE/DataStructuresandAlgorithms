package per.tran.basicTraining;

/** 01字串
 问题描述
 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 00000
 00001
 00010
 00011
 00100
 请按从小到大的顺序输出这32种01串。
 输入格式
 本试题没有输入。
 输出格式
 输出32行，按从小到大的顺序每行一个长度为5的01串。
 样例输出
 00000
 00001
 00010
 00011
 <以下部分省略>
 */
public class str01 {
    public static void main(String[] args) {
        int i,j,k,l,m;
        for(i=0;i<2;i++)                       //5层循环控制从小到大输出
            for(j=0;j<2;j++)
                for(k=0;k<2;k++)
                    for(l=0;l<2;l++)
                        for(m=0;m<2;m++)
                            System.out.printf("%d%d%d%d%d\n",i,j,k,l,m);
    }
    public void aa(){
        String[] n = new String[5];
        for (int i = 0; i < 32; i++) {
            int ii = i;
            for (int j = 0; j < 5; j++) {
                n[j]=ii%2+"";
                ii = ii / 2;
            }
            System.out.println(n[4]+n[3]+n[2]+n[1]+n[0]);
        }
    }
}
