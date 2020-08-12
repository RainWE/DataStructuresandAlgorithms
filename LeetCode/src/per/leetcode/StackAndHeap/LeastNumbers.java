package per.leetcode.StackAndHeap;

import java.util.Arrays;

/**最小的k个数
 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，
 则最小的4个数字是1、2、3、4。
 示例 1：
 输入：arr = [3,2,1], k = 2
 输出：[1,2] 或者 [2,1]
 示例 2：
 输入：arr = [0,1,2,1], k = 1
 输出：[0]
 ?
 限制：
 0 <= k <= arr.length <= 10000
 0 <= arr[i]?<= 10000

 */
public class LeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        int []leastarr = new int[k];
        quickSort(arr,0,arr.length-1);
        leastarr=Arrays.copyOf(arr,k);
        return leastarr;
    }
    //快速排序
    public static void quickSort(int[] arr,int left,int right){
        int l=left;
        int r=right;
        int pivot=arr[(left+right)/2];
        int temp=0;
        while (l<r){
            while (arr[l]<pivot){
                l++;
            }
            while (arr[r]>pivot){
                r--;
            }
            if(l>=r){
                break;
            }
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            if(arr[l]==pivot){
                r--;
            }
            if (arr[r]==pivot){
                l++;
            }
        }
        if(l==r){
            l++;
            r--;
        }
        if (left<r){
            quickSort(arr,left,r);
        }
        if(right>l){
            quickSort(arr,l,right);
        }
    }
}
