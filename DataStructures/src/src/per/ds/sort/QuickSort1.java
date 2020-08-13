package src.per.ds.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickSort1 {

    public static void main(String[] args) {
        int[] arr = {-9, 78, 0, 23, -567, 70, -1, 900, 4561, 0};

        //测试快排的执行速度
        // 创建要给80000个的随机的数组
//		int[] arr = new int[8000000];
//		for (int i = 0; i < 8000000; i++) {
//			arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
//		}
//
//		System.out.println("排序前");
//		Date data1 = new Date();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String date1Str = simpleDateFormat.format(data1);
//		System.out.println("排序前的时间是=" + date1Str);

        quickSort_5(arr, 0, arr.length - 1);

//		Date data2 = new Date();
//		String date2Str = simpleDateFormat.format(data2);
//		System.out.println("排序前的时间是=" + date2Str);
        System.out.println("arr=" + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) {
                r--;
            }
            if (arr[r] == pivot) {
                l++;
            }
        }
        if (l == r) {
            l++;
            r--;
        }
        if (left < r) {
            quickSort(arr, left, r);
        }
        if (right > l) {
            quickSort(arr, l, right);
        }

    }

    public static void quickSort_1(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (arr[l] < pivot) l++;
            while (arr[r] > pivot) r--;
            if (l >= r) {
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) {
                r--;
            }
            if (arr[r] == pivot) {
                l++;
            }
        }
        if (l == r) {
            l++;
            r--;
        }
        if (left < r) {
            quickSort_1(arr, left, r);
        }
        if (l < right) {
            quickSort_1(arr, l, right);
        }

    }

    public static void quickSort_2(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (arr[l] < pivot) l++;
            while (arr[r] > pivot) r--;
            if (l >= r) {
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) r--;
            if (arr[r] == pivot) l--;
        }
        if (l == r) {
            l++;
            r--;
        }
        if (left < r) quickSort_2(arr, left, r);
        if (right > l) quickSort_2(arr, l, right);
    }

    public static void quickSort_3(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(right + left) / 2];
        int temp = 0;
        while (l < r) {
            while (arr[l] < pivot) l++;
            while (arr[r] > pivot) r--;
            if (l >= r) {
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) r--;
            if (arr[r] == pivot) l--;
        }
        if (l == r) {
            l++;
            r--;
        }
        if (left < r) quickSort_3(arr, left, r);
        if (l < right) quickSort_3(arr, l, right);
    }

    public static void quickSort_4(int[] arr, int left, int right) {
        int r = right;
        int l = left;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (arr[l] < pivot) l++;
            while (arr[r] > pivot) r--;
            if (l >= r) break;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) r--;
            if (arr[r] == pivot) l++;
        }
        if (l == r) {
            l++;
            r--;
        }
        if (left < r) quickSort_4(arr, left, r);
        if (l < right) quickSort_4(arr, l, right);
    }

    public static void quickSort_5(int[] arr, int left, int right) {
        int r = right;
        int l = left;
        int pivot = arr[(right + left) / 2];
        int temp = 0;
        while (l < r) {
            while (arr[l] < pivot) l++;
            while (arr[r] > pivot) r--;
            if (l >= r) break;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) r--;
            if (arr[r] == pivot) l++;
        }
        if (l == r) {
            l++;
            r--;
        }
        if (left < r) quickSort_5(arr, left, r);
        if (l < right) quickSort_5(arr, l, right);

    }

    public static void quickSort_6(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l]==pivot){
                r--;
            }
            if (arr[r]==pivot){
                l++;
            }
        }
        if (l==r){
            l++;
            r--;
        }
        if (l<right){
            quickSort_6(arr,l,right);
        }
        if (r>left){
            quickSort_6(arr,left,r);
        }


    }


}
