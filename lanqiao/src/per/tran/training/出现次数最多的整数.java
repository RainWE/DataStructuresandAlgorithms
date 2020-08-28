package per.tran.training;

import java.util.Arrays;
import java.util.Scanner;

public class 出现次数最多的整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<1||n>20){
            return;
        }
        int arr []=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int max=1;//出现最多的次数
        int b=arr[0];//出现最多次数的数
        int c=1;//出现次数
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
                c++;
            }else{
                c=1;
            }
            if(c>max){
                max=c;
                b=arr[i];
            }
        }
        System.out.println(b);
    }
}
