package src.per.ds.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class RadixSort1 {

    public static void main(String[] args) {
        int arr[] = {53, 3, 542, 748, 14, 214};

        // 80000000 * 11 * 4 / 1024 / 1024 / 1024 =3.3G
//		int[] arr = new int[8000000];
//		for (int i = 0; i < 8000000; i++) {
//			arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
//		}
//        System.out.println("排序前");
//        Date data1 = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date1Str = simpleDateFormat.format(data1);
//        System.out.println("排序前的时间是=" + date1Str);

        radixSort_5(arr);

//        Date data2 = new Date();
//        String date2Str = simpleDateFormat.format(data2);
//        System.out.println("排序前的时间是=" + date2Str);

        System.out.println("基数排序后 " + Arrays.toString(arr));

    }

    //基数排序方法
    public static void radixSort(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxLength = (max + "").length();

        int bucket[][] = new int[10][arr.length];
        int bucketElementCounts[] = new int[10];
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitOfElement = arr[j] / n % 10;
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }
            int index = 0;
            for (int k = 0; k < bucketElementCounts.length; k++) {
                if (bucketElementCounts[k] != 0) {
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index] = bucket[k][l];
                        index++;
                    }
                }
                bucketElementCounts[k] = 0;
            }
            System.out.println("第" + (i + 1) + "轮，对个位的排序处理 arr =" + Arrays.toString(arr));

        }
    }

    public static void radixSort_1(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxlength = (max + "").length();

        int buckets[][] = new int[10][arr.length];
        int bucketElementsCount[] = new int[10];

        for (int k = 0, n = 1; k < maxlength; k++, n *= 10) {
            for (int i = 0; i < arr.length; i++) {
                int digitOfElement = arr[i] / n % 10;
                buckets[digitOfElement][bucketElementsCount[digitOfElement]] = arr[i];
                bucketElementsCount[digitOfElement]++;
            }
            int index = 0;
            for (int j = 0; j < bucketElementsCount.length; j++) {
                if (bucketElementsCount[j] != 0) {
                    for (int i = 0; i < bucketElementsCount[j]; i++) {
                        arr[index] = buckets[j][i];
                        index++;
                    }
                }
                bucketElementsCount[j] = 0;
            }
            System.out.println("第" + (k + 1) + "轮，对个位的排序处理 arr =" + Arrays.toString(arr));

        }


    }

    public static void radixSort_2(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxLength = (max + "").length();
        int buckets[][] = new int[10][arr.length];
        int bucketsElementsCount[] = new int[10];

        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitNum = arr[j] / n % 10;
                buckets[digitNum][bucketsElementsCount[digitNum]] = arr[j];
                bucketsElementsCount[digitNum]++;
            }
            int index = 0;
            for (int k = 0; k < bucketsElementsCount.length; k++) {
                if (bucketsElementsCount[k] != 0) {
                    for (int l = 0; l < bucketsElementsCount[k]; l++) {
                        arr[index] = buckets[k][l];
                        index++;
                    }
                }
                bucketsElementsCount[k] = 0;
            }
            System.out.println("第" + (i + 1) + "轮，对个位的排序处理 arr =" + Arrays.toString(arr));
        }

    }

    public static void radixSort_3(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxlength = (max + "").length();

        int buckets[][] = new int[10][arr.length];
        int bucketsElementsCount[] = new int[10];

        for (int i = 0, n = 1; i < maxlength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitNum = arr[j] / n % 10;
                buckets[digitNum][bucketsElementsCount[digitNum]] = arr[j];
                bucketsElementsCount[digitNum]++;
            }
            int index = 0;
            for (int j = 0; j < bucketsElementsCount.length; j++) {
                if (bucketsElementsCount[j] != 0) {
                    for (int l = 0; l < bucketsElementsCount[j]; l++) {
                        arr[index] = buckets[j][l];
                        index++;
                    }
                }
                bucketsElementsCount[j] = 0;
            }
            System.out.println("第" + (i + 1) + "轮，对个位的排序处理 arr =" + Arrays.toString(arr));
        }

    }

    public static void radixSort_4(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxlength = (max + "").length();

        int buckets[][] = new int[10][arr.length];
        int bucketsElementsCount[] = new int[10];   //10个桶

        for (int i = 0, n = 1; i < maxlength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitnum = arr[j] / n % 10;
                buckets[digitnum][bucketsElementsCount[digitnum]] = arr[j];
                bucketsElementsCount[digitnum]++;
            }
            int index = 0;
            for (int k = 0; k < bucketsElementsCount.length; k++) {
                if (bucketsElementsCount[k] != 0) {
                    for (int l = 0; l < bucketsElementsCount[k]; l++) {
                        arr[index] = buckets[k][l];
                        index++;
                    }
                }
                bucketsElementsCount[k] = 0;
            }
            System.out.println("第" + (i + 1) + "轮，对个位的排序处理 arr =" + Arrays.toString(arr));
        }


    }

    public static void radixSort_5(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxlength = (max + "").length();
        int buckets[][] = new int[10][arr.length];
        int bucketsElementsCount[] = new int[10];
        for (int i = 0, n = 1; i < maxlength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitnum = arr[j] / n % 10;
                buckets[digitnum][bucketsElementsCount[digitnum]] = arr[j];
                bucketsElementsCount[digitnum]++;
            }
            int index = 0;
            for (int k = 0; k < 10; k++) {
                if (bucketsElementsCount[k] != 0) {
                    for (int l = 0; l < bucketsElementsCount[k]; l++) {
                        arr[index] = buckets[k][l];
                        index++;
                    }
                }
                bucketsElementsCount[k] = 0;
            }
            System.out.println("第" + (i + 1) + "轮，对个位的排序处理 arr =" + Arrays.toString(arr));

        }

    }

}
