package per.leetcode.other;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegetToint {
    public static void main(String[] args) {
        //��int����ת��ΪInteger����
        int num[]={4,4,7,6,7};
        //�Ƚ�int����ת��Ϊ��ֵ��
        IntStream stream = Arrays.stream(num);
        //���е�Ԫ��ȫ��װ�䣬ת��Ϊ�� ---->intתΪInteger
        Stream<Integer> integerStream=stream.boxed();
        //����ת��Ϊ����
        Integer[] integers=integerStream.toArray(Integer[]::new);

        //����
        Arrays.sort(integers, Collections.reverseOrder());
        for (int i:integers){
            System.out.println(i);
        }
    }
}
