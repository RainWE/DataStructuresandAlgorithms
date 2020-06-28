package src.per.ds.search;

import java.util.Arrays;

public class FibonacciSearch_1 {

    public static int maxSize = 20;

    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 89, 1000, 1234};

        System.out.println("index=" + fibSearch_1(arr, 1234));// 0

    }

    //��Ϊ��������mid=low+F(k-1)-1����Ҫʹ�õ�쳲��������У����������Ҫ�Ȼ�ȡ��һ��쳲���������
    //�ǵݹ鷽���õ�һ��쳲���������
    public static int[] fib() {
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }

    //��д쳲����������㷨
    //ʹ�÷ǵݹ�ķ�ʽ��д�㷨

    /**
     * @param a   ����
     * @param key ������Ҫ���ҵĹؼ���(ֵ)
     * @return ���ض�Ӧ���±꣬���û��-1
     */
    public static int fibSearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int k = 0;
        int mid = 0;
        int f[] = fib();
        while (high > f[k] - 1) {
            k++;
        }
        int temp[] = Arrays.copyOf(a, f[k]);
        for (int i = high + 1; i < temp.length; i++) {
            temp[i] = a[high];
        }
        while (low <= high) {
            mid = low + f[k - 1] - 1;
            if (key < temp[mid]) {
                high = mid - 1;
                k--;
            } else if (key > temp[mid]) {
                low = mid + 1;
                k -= 2;
            } else {
                if (mid < high) {
                    return mid;
                } else {
                    return high;
                }
            }
        }
        return -1;
    }
	public static int fibSearch_1(int[] a, int key){
		int low=0;
		int high=a.length-1;
		int mid=0;
		int k=0;
		int f[]=fib();
		while (high>f[k]-1){
			k++;
		}
		int temp[]=Arrays.copyOf(a,f[k]);
		for(int i=high+1;i<temp.length;i++){
			temp[i]=a[high];
		}
		while (low<=high){
			mid=low+f[k-1]-1;
			if(key<temp[mid]){
				high=mid-1;
				k--;
			}else if(key>temp[mid]){
				low=mid+1;
				k-=2;
			}else {
				if(mid<high){
					return mid;
				}else {
					return high;
				}
			}
		}
		return -1;
	}
}
