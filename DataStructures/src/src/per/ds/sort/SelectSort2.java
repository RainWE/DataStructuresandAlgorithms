package src.per.ds.sort;

import java.util.Arrays;

public class SelectSort2 {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 90, 123};
        System.out.println("≈≈–Ú«∞");
        System.out.println(Arrays.toString(arr));
        selectSort_4(arr);
        System.out.println("≈≈–Ú∫Û");
        System.out.println(Arrays.toString(arr));
    }


    public static void selectSort_1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
    public static void selectSort_2(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min = arr[i];
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
        }
    }
    public static void selectSort_3(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minIndex= i;
            for (int j=i+1;j<arr.length;j++){
                if (min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
        }
    }
    public static void selectSort_4(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if (minIndex != i) {
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
        }
    }
}
