package src.per.ds.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertSort1 {

    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        // ����Ҫ��80000�������������
//        int[] arr = new int[80000];
//        for (int i = 0; i < 80000; i++) {
//            arr[i] = (int) (Math.random() * 8000000); // ����һ��[0, 8000000) ��
//        }

//        System.out.println("��������ǰ");
//        Date data1 = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date1Str = simpleDateFormat.format(data1);
//        System.out.println("����ǰ��ʱ����=" + date1Str);

        insertSort_7(arr); //���ò��������㷨

//        Date data2 = new Date();
//        String date2Str = simpleDateFormat.format(data2);
//        System.out.println("����ǰ��ʱ����=" + date2Str);

        System.out.println(Arrays.toString(arr));


    }

    //{101, 34, 119, 1, -1, 89};
//{34,34, 101, 119, -1, 89};
    //��������
    public static void insertSort(int[] arr) {
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
            //System.out.println("��"+i+"�ֲ���");
            //System.out.println(Arrays.toString(arr));
        }
    }

    public static void insertSort_1(int[] arr) {
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }

    public static void insertSort_2(int[] arr) {
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }

    public static void insertSort_3(int[] arr) {
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }

    public static void insertSort_4(int[] arr) {
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }

    public static void insertSort_5(int[] arr) {
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }
    public static void insertSort_6(int[] arr){
        int insertVal =0;
        int insertIndex=0;
        for (int i=1;i<arr.length;i++){
            insertVal=arr[i];
            insertIndex=i-1;
            while (insertIndex>=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex+1!=i){
                arr[insertIndex+1]=insertVal;
            }
        }
    }
    public static void insertSort_7(int[] arr){
        int insertIndx = 0;
        int insertVal =0;
        for (int i=1;i<arr.length;i++){
            insertIndx=i-1;
            insertVal=arr[i];
            while (insertIndx>=0 && insertVal<arr[insertIndx]){
                arr[insertIndx+1]=arr[insertIndx];
                insertIndx--;
            }
            if (insertIndx+1!=i){
                arr[insertIndx+1]=insertVal;
            }
        }

    }
    public static void insertSort_8(int[] arr){
        int insertIndex=0;
        int insertVal=0;
        for (int i=1;i<arr.length;i++){
            insertIndex=i-1;
            arr[insertIndex]=arr[i];
            while (insertIndex>=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex+1 != i){
                arr[insertIndex+1]=insertVal;
            }
        }
    }
}


