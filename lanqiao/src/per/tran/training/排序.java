package per.tran.training;

import java.util.Arrays;
import java.util.Scanner;

public class ≈≈–Ú {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[3];
        for (int i=0;i<3;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i=2;i>=0;i--){
            System.out.printf(arr[i]+" ");
        }
    }
}
