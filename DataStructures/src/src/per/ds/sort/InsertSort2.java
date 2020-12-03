package src.per.ds.sort;

import java.util.Arrays;

public class InsertSort2 {

    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        System.out.println(Arrays.toString(arr));
        insertSort_2(arr); //调用插入排序算法
        System.out.println(Arrays.toString(arr));


    }
    public static void insertSort_1(int[] arr) {
        for (int i=1;i<arr.length;i++){
            int tmp = arr[i];
            int j=i;
            while (j>0 && tmp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            if(i!=j){
                arr[j]=tmp;
            }
        }
    }
    public static void insertSort_2(int[] arr){
        for (int i=1;i<arr.length;i++){
            int tmp =arr[i];
            int j=i;
            while (j>0 && tmp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            if (i!=j){
                arr[j]=tmp;
            }
        }
    }
}
