package per.tran.training;

import java.util.Arrays;
import java.util.Scanner;

public class ���ִ����������� {
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
        int max=1;//�������Ĵ���
        int b=arr[0];//��������������
        int c=1;//���ִ���
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
