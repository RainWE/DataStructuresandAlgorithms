package per.leetcode.StackAndHeap;

import java.util.Arrays;

/**��С��k����
 ������������ arr ���ҳ�������С�� k ���������磬����4��5��1��6��2��7��3��8��8�����֣�
 ����С��4��������1��2��3��4��
 ʾ�� 1��
 ���룺arr = [3,2,1], k = 2
 �����[1,2] ���� [2,1]
 ʾ�� 2��
 ���룺arr = [0,1,2,1], k = 1
 �����[0]
 ?
 ���ƣ�
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
    //��������
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
