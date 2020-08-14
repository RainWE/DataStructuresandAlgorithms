package per.leetcode.sort;


import java.util.HashSet;
import java.util.Set;

/**
 * ������
 * ���������������飬�뽻��һ����ֵ��ÿ��������ȡһ����ֵ����ʹ��������������Ԫ�صĺ���ȡ�
 * ����һ�����飬��һ��Ԫ���ǵ�һ��������Ҫ������Ԫ�أ��ڶ���Ԫ���ǵڶ���������Ҫ������Ԫ�ء�
 * ���ж���𰸣���������һ�����ɡ�����������������ֵ�����ؿ����顣
 * ʾ��:
 * ����: array1 = [4, 1, 2, 1, 1, 2], array2 = [3, 6, 3, 3]
 * ���: [1, 3]
 * ʾ��:
 * ����: array1 = [1, 2, 3], array2 = [4, 5, 6]
 * ���: []
 * ��ʾ��
 * 1 <= array1.length, array2.length <= 100000
 */
public class FindSwapValues {

    Set<Integer> set = new HashSet<>();

    /**
     * 1.����array1��Ԫ�صĺ�aSum������array2�е�Ԫ�غ�bSum,��Ҫ���� (aSum + bSum) / 2 == 0 ����û�н��
     * 2.�����Ҫ���� aSum - a + b = bSum + a - b ,�����a -  b = (aSum - bSum) / 2; Ҳ�������ж�������b�Ƿ���ڵ����⡣
     *
     * @param array1
     * @param array2
     * @return //aSum - a + b = bSum + a - b  ===>a -  b = (aSum - bSum) / 2
     */
    public int[] findSwapValues(int[] array1, int[] array2) {
        int aSum = 0, bSum = 0;
        for (int a:array1){
            aSum+=a;
        }
        for (int b:array2){
            bSum+=b;
            set.add(b);
        }
        if ((aSum + bSum) % 2 != 0) {
            return new int[]{};
        }
        int diff = (aSum - bSum) / 2;
        for (int a : array1) {
            if (set.contains(a - diff)) {
                return new int[]{a, a - diff};
            }
        }
        return new int[]{};
    }


}
