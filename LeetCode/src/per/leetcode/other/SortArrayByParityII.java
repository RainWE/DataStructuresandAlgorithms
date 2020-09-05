package per.leetcode.other;

/**����ż�������� II
 ����һ���Ǹ���������?A�� A ��һ��������������һ��������ż����
 ��������������Ա㵱?A[i] Ϊ����ʱ��i?Ҳ����������?A[i]?Ϊż��ʱ�� i Ҳ��ż����
 ����Է����κ���������������������Ϊ�𰸡�
 ʾ����
 ���룺[4,2,5,7]
 �����[4,5,2,7]
 ���ͣ�[4,7,2,5]��[2,5,4,7]��[2,7,4,5] Ҳ�ᱻ���ܡ�
 ��ʾ��
 2 <= A.length <= 20000
 A.length % 2 == 0
 0 <= A[i] <= 1000
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int arr []=new int[A.length];
        int even=0;//ÿ�μӶ�
        int oddNumber=1;//ÿ�μӶ�
        for (int i:A){
            if (i%2==1){
                arr[oddNumber]=i;
                oddNumber+=2;
            }else {
                arr[even]=i;
                even+=2;
            }
        }
        return arr;
    }
    //����һ�� ���α���
    public int[] sortArrayByParityII_1(int[] A) {
        int N = A.length;
        int[] ans = new int[N];

        int t = 0;
        for (int x: A) if (x % 2 == 0) {
            ans[t] = x;
            t += 2;
        }

        t = 1;
        for (int x: A) if (x % 2 == 1) {
            ans[t] = x;
            t += 2;
        }

        return ans;
    }
    //�������� ˫ָ��
    public int[] sortArrayByParityII_3(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2)
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1)
                    j += 2;
                // Swap A[i] and A[j]
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

        return A;
    }
}
