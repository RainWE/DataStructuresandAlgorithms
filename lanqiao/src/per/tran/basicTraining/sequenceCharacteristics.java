package per.tran.basicTraining;

import java.util.Arrays;
import java.util.Scanner;

/**��������
 ��������
 ����n�������ҳ���n���������ֵ����Сֵ���͡�
 �����ʽ
 ��һ��Ϊ����n����ʾ���ĸ�����
 �ڶ�����n������Ϊ������n������ÿ�����ľ���ֵ��С��10000��
 �����ʽ
 ������У�ÿ��һ����������һ�б�ʾ��Щ���е����ֵ���ڶ��б�ʾ��Щ���е���Сֵ�������б�ʾ��Щ���ĺ͡�
 ��������
 5
 1 3 -2 4 5
 �������
 5
 -2
 11
 ���ݹ�ģ��Լ��
 1 <= n <= 10000��
 */
public class sequenceCharacteristics {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int []arr =new int[num];
        for (int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int max=arr[num-1];
        int min=arr[0];
        int sum=0;
        for (int i=0;i<num;i++){
            sum+=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
