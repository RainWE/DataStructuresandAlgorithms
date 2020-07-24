package per.leetcode.sort;

import java.util.Arrays;

/**最小K个数
 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
 示例：
 输入： arr = [1,3,5,7,2,4,6,8], k = 4
 输出： [1,2,3,4]
 提示：
 0 <= len(arr) <= 100000
 0 <= k <= min(100000, len(arr))
 */
public class SmallestK {
    public int[] smallestK(int[] arr, int k) {
        if (arr.length==0 || k==0){
            return new int[0];
        }
        int nums[]=new int [k];
        quicksort(arr,0,arr.length-1);
        nums= Arrays.copyOf(arr,k);
        return nums;
    }
    public static void quicksort(int[] arr,int left,int right){
        int l=left;
        int r=right;
        int pivot =arr[(left+right)/2];
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
            if (arr[l]==pivot){
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
        if(l<right){
            quicksort(arr,l,right);
        }
        if (r>left){
            quicksort(arr,left,r);
        }
    }
}
