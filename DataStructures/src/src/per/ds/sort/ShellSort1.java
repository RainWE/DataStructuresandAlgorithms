package src.per.ds.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ShellSort1 {

    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};

        // 创建要给80000个的随机的数组
//		int[] arr = new int[8000000];
//		for (int i = 0; i < 8000000; i++) {
//			arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
//		}

//		System.out.println("排序前");
//		Date data1 = new Date();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String date1Str = simpleDateFormat.format(data1);
//		System.out.println("排序前的时间是=" + date1Str);
//      shellSort(arr); //交换式
        shellSort2(arr);//移位方式
//
//		Date data2 = new Date();
//		String date2Str = simpleDateFormat.format(data2);
//		System.out.println("排序前的时间是=" + date2Str);
        System.out.println(Arrays.toString(arr));
    }

    // 使用逐步推导的方式来编写希尔排序
    // 希尔排序时， 对有序序列在插入时采用交换法,
    // 思路(算法) ===> 代码
    public static void shellSort(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }
    }

    public static void shellSort_1(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }
    }

    public static void shellSort_2(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }

    }

    public static void shellSort_3(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }

    }

    public static void shellSort_4(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));

        }
    }

    public static void shellSort_5(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }
    }

    public static void shellSort_6(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }

    }

    public static void shellSort_7(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }
    }

    public static void shellSort_8(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }
    }

    public static void shellSort_9(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }

    }

    public static void shellSort_10(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }

    }


    //对交换式的希尔排序进行优化->移位法
    public static void shellSort2(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }

    }

    public static void shellSort2_1(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_2(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_3(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_4(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_5(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_6(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_7(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_8(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_9(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    public static void shellSort2_10(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

}
