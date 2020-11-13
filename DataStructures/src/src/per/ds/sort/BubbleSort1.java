package src.per.ds.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class BubbleSort1 {

    public static void main(String[] args) {
//		int arr[] = {3, 9, -1, 10, 20};
//		
//		System.out.println("����ǰ");
//		System.out.println(Arrays.toString(arr));

        //Ϊ��������⣬���ǰ�ð��������ݱ���̣������չʾ

        //����һ��ð��������ٶ�O(n^2), ��80000�����ݣ�����
        //����Ҫ��80000�������������
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); //����һ��[0, 8000000) ��
        }

        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("����ǰ��ʱ����=" + date1Str);

        //����ð������
        bubbleSort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("������ʱ����=" + date2Str);

        //System.out.println("�����");
        //System.out.println(Arrays.toString(arr));
		


		/*
		
		// �ڶ������򣬾��ǽ��ڶ���������ڵ����ڶ�λ
		
		for (int j = 0; j < arr.length - 1 - 1 ; j++) {
			// ���ǰ������Ⱥ���������򽻻�
			if (arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		
		System.out.println("�ڶ�������������");
		System.out.println(Arrays.toString(arr));
		
		
		// ���������򣬾��ǽ�������������ڵ�������λ
		
		for (int j = 0; j < arr.length - 1 - 2; j++) {
			// ���ǰ������Ⱥ���������򽻻�
			if (arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}

		System.out.println("����������������");
		System.out.println(Arrays.toString(arr));
		
		// ���������򣬾��ǽ���4��������ڵ�����4λ

		for (int j = 0; j < arr.length - 1 - 3; j++) {
			// ���ǰ������Ⱥ���������򽻻�
			if (arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}

		System.out.println("����������������");
		System.out.println(Arrays.toString(arr)); */

    }

    // ��ǰ���ð�������㷨����װ��һ������
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
//			System.out.println("��"+(i+1)+"������������");
//			System.out.println(Arrays.toString(arr));
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }

    }

    public static void bubbleSort_1(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag){
                break;
            }else {
                flag=false;
            }
        }
    }
    public static void bubbleSort_2(int[] arr) {
        int temp =0;
        boolean flag = false;
        for(int i = 0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
            if(!flag){
                break;
            }else {
                flag=false;
            }
        }
    }
    public static void bubbleSort_3(int[] arr) {
        int temp =0;
        boolean flag = false;
        for(int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j--){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag){
                break;
            }else {
                flag=false;
            }
        }
    }
    public static void bubbleSort_4(int[] arr) {
        int temp =0;
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                   flag=true;
                   temp= arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
            if(!flag){
                break;
            }else {
                flag=false;
            }
        }
    }
    public static void bubbleSort_5(int[] arr) {
        int temp =0;
        boolean flag = false;
        for(int i=0 ;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag){
                break;
            }else {
                flag=false;
            }
        }
    }
    public static void bubbleSort_6(int[] arr){
        int temp=0;
        boolean flag =false;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (!flag){
                break;
            }else {
                flag=false;
            }
        }
    }

    public static void bubbleSort_7(int[] arr){
        boolean  falg = false;
        int temp=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    falg=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (!falg){
                break;
            }else {
                falg=false;
            }
        }

    }
}
