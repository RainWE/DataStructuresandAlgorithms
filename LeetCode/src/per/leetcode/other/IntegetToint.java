package per.leetcode.other;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegetToint {
    public static void main(String[] args) {
        //将int数组转换为Integer数组
        int num[]={4,4,7,6,7};
        //先将int数组转换为数值流
        IntStream stream = Arrays.stream(num);
        //流中的元素全部装箱，转换为流 ---->int转为Integer
        Stream<Integer> integerStream=stream.boxed();
        //将流转换为数组
        Integer[] integers=integerStream.toArray(Integer[]::new);

        //降序
        Arrays.sort(integers, Collections.reverseOrder());
        for (int i:integers){
            System.out.println(i);
        }
    }
}
