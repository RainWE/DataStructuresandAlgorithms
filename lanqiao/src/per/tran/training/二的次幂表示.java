package per.tran.training;

import java.util.Scanner;

public class ���Ĵ��ݱ�ʾ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp(n);
        System.out.println();

    }
    private static void dp(int n){
        String num=Integer.toBinaryString(n);//��ʮ����ת��Ϊ������
        int[] a=new int[num.length()+1];
        int b=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1'){
                a[b]=num.length()-i-1;//2����
                b++;
            }
        }
        for(int i=0;i<b;i++){
            if(a[i]==0){
                System.out.print("2(0)");//��Ϊ0ʱ
            }else if(a[i]==1){
                System.out.print("2");//��Ϊ1ʱ
            }else if(a[i]==2){
                System.out.print("2(2)");//��Ϊ2ʱ
            }else if(a[i]>2){
                System.out.print("2(");//�ݴ���2ʱ
                dp(a[i]);
                System.out.print(")");
            }
            if(i!=b-1){
                System.out.print("+");
            }
        }

    }

}
