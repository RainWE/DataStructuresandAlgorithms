package per.leetcode.stack;

import java.util.Arrays;

/**���һ��ʯͷ������
 ��һ��ʯͷ��ÿ��ʯͷ������������������
 ÿһ�غϣ�����ѡ������ ���ص� ʯͷ��Ȼ������һ����顣����ʯͷ�������ֱ�Ϊ?x ��?y��
 ��?x <= y����ô����Ŀ��ܽ�����£�
 ���?x == y����ô����ʯͷ���ᱻ��ȫ���飻
 ���?x != y����ô����Ϊ?x?��ʯͷ������ȫ���飬������Ϊ?y?��ʯͷ������Ϊ?y-x��
 ������ֻ��ʣ��һ��ʯͷ�����ش�ʯͷ�����������û��ʯͷʣ�£��ͷ��� 0��
 ʾ����
 ���룺[2,7,4,1,8,1]
 �����1
 ���ͣ�
 ��ѡ�� 7 �� 8���õ� 1����������ת��Ϊ [2,4,1,1,1]��
 ��ѡ�� 2 �� 4���õ� 2����������ת��Ϊ [2,1,1,1]��
 ������ 2 �� 1���õ� 1����������ת��Ϊ [1,1,1]��
 ���ѡ�� 1 �� 1���õ� 0����������ת��Ϊ [1]����������ʣ���ǿ�ʯͷ��������
 ��ʾ��
 1 <= stones.length <= 30
 1 <= stones[i] <= 1000
 */
public class LastStoneWeight {
    public static void main(String[] args) {
        int arr[]={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
    }
    public static int lastStoneWeight(int[] stones) {
        int index=stones.length-1;
        for (int i=0;i<stones.length-1;i++){
            Arrays.sort(stones);
            stones[index]=stones[index]-stones[index-1];
            stones[index-1]=0;
        }
        return stones[stones.length-1];

    }
    public static int lastStoneWeight_1(int[] stones){
        int index=stones.length-1;
        for (int i=0;i<stones.length-1;i++){
            Arrays.sort(stones);
            stones[index]-=stones[index-1];
            stones[index-1]=0;
        }
        return stones[stones.length-1];
    }

}
