package per.tran.training;

import java.util.Scanner;

public class 二的次幂表示 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp(n);
        System.out.println();

    }
    private static void dp(int n){
        String num=Integer.toBinaryString(n);//将十进制转换为二进制
        int[] a=new int[num.length()+1];
        int b=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1'){
                a[b]=num.length()-i-1;//2的幂
                b++;
            }
        }
        for(int i=0;i<b;i++){
            if(a[i]==0){
                System.out.print("2(0)");//幂为0时
            }else if(a[i]==1){
                System.out.print("2");//幂为1时
            }else if(a[i]==2){
                System.out.print("2(2)");//幂为2时
            }else if(a[i]>2){
                System.out.print("2(");//幂大于2时
                dp(a[i]);
                System.out.print(")");
            }
            if(i!=b-1){
                System.out.print("+");
            }
        }

    }

}
