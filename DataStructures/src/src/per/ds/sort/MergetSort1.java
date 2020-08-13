package src.per.ds.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MergetSort1 {

	public static void main(String[] args) {
		int arr[] = { 8, 4, 5, 7, 1, 3, 6, 2 }; //
		
		//测试快排的执行速度
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
//
		int temp[] = new int[arr.length]; //归并排序需要一个额外空间
 		mergeSort(arr, 0, arr.length - 1, temp);
 		
// 		Date data2 = new Date();
//		String date2Str = simpleDateFormat.format(data2);
//		System.out.println("排序前的时间是=" + date2Str);
 		
 		System.out.println("归并排序后=" + Arrays.toString(arr));
	}
	
	
	//分+合方法
	public static void mergeSort(int[] arr, int left, int right, int[] temp) {
		if(left<right){
			int mid = (left+right)/2;
			mergeSort(arr,left,mid,temp);
			mergeSort(arr,mid+1,right,temp);
			merge_2(arr,left,mid,right,temp);
		}
	}
	
	//合并的方法
	/**
	 * 
	 * @param arr 排序的原始数组
	 * @param left 左边有序序列的初始索引
	 * @param mid 中间索引
	 * @param right 右边索引
	 * @param temp 做中转的数组
	 */
	public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
		int l = left;
		int r = mid+1;
		int t=0;
		while (l<=mid&&r<=right){
			if(arr[l]<=arr[r]){
				temp[t]=arr[l];
				t++;
				l++;
			}else {
				temp[t] =arr[r];
				t++;
				r++;
			}
		}
		while (l<=mid){
			temp[t]=arr[l];
			t++;
			l++;
		}
		while (r<=right){
			temp[t] =arr[r];
			t++;
			r++;
		}
		t=0;
		int lef=left;
		while (lef<=right){
			arr[lef]=temp[t];
			lef++;
			t++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void mergeSort_1(int[] arr, int left, int right, int[] temp) {
		if(left<right){
			int mid = (left+right)/2;
			mergeSort_1(arr,left,mid,temp);
			mergeSort_1(arr,mid+1,right,temp);
			merge_1(arr,left,mid,right,temp);
		}
	}
	public static void merge_1(int[] arr, int left, int mid, int right, int[] temp) {
		int l = left;
		int r =mid+1;
		int t=0;
		while (l<=mid &&r<=right){
			if(arr[l]<=arr[r])	temp[t++]=arr[l++];
			else temp[t++]=arr[r++];
		}
		while (l<=mid) temp[t++]=arr[l++];
		while (r<=right) temp[t++]=arr[r++];
		t=0;
		int lef =left;
		while (lef<=right) arr[lef++] =temp[t++];
	}

	public static void merge_2(int[] arr, int left, int mid, int right, int[] temp){
		int i = left;
		int j = mid+1;
		int t=0;
		while (i<=mid&&j<=right){
			if(arr[i]<arr[j]){
				temp[t]=arr[i];
				i++;
				t++;
			}else {
				temp[t]=arr[j];
				j++;
				t++;
			}
		}
		while (i<=mid){
			temp[t]=arr[i];
			t++;
			i++;
		}
		while (j<=right){
			temp[t]=arr[j];
			t++;
			j++;
		}
		t=0;
		int index=left;
		while (index<=right){
			arr[index]=temp[t];
			index++;
			t++;
		}

	}
	public static void merge_3(int[] arr, int left, int mid, int right, int[] temp){
		int i=left;
		int j=mid+1;
		int t=0;
		while (i<=mid && j<=right){
			if (arr[i] < arr[j]){
				temp[t]=arr[i];
				t++;
				i++;
			}else {
				temp[t]=arr[j];
				t++;
				j++;
			}
		}
		while (i<=mid){
			temp[t]=arr[i];
			t++;
			i++;
		}
		while (j<=right){
			temp[t]=arr[j];
			t++;
			j++;
		}
		t=0;
		int index=left;
		while (index<=right){
			arr[index]=arr[t];
			t++;
			index++;
		}
	}


}
