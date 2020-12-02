package src.per.ds.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort2 {
    public static void main(String[] args) {
		int arr[] = {3, 9, -1, 20, 10};
		System.out.println("排序前");
		System.out.println(Arrays.toString(arr));
        bubbleSort_1(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort_1(int[] arr){
        int temp = 0;
        boolean flag =false;
        for(int i=0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("----------");
            System.out.println("第"+i+"次排序");
            System.out.println(Arrays.toString(arr));
            if (!flag){
                break;
            }else {
                flag=false;
            }
        }
    }
}
