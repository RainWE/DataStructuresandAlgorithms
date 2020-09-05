package per.leetcode.sort;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**�ǵ���˳�����С������
 ����һ������ nums��������г�ȡһ�������У�����������е�Ԫ��֮�� �ϸ� ����δ�����ڸ��������еĸ�Ԫ��֮�͡�
 ������ڶ�����������ֻ�践�� ������С �������С������Ȼ�ж������������򷵻� Ԫ��֮����� �������С�
 �������鲻ͬ�ĵط����ڣ�������������С���ǿ��Ԫ����ԭ�����е������ԣ�Ҳ����˵��������ͨ���������з���һЩ��Ҳ���ܲ����룩Ԫ�صõ���
 ע�⣬��Ŀ���ݱ�֤��������Լ�������Ľ�������� Ψһ �ġ�ͬʱ�����صĴ�Ӧ���� �ǵ���˳�� ���С�
 ʾ�� 1��
 ���룺nums = [4,3,10,9,8]
 �����[10,9]
 ���ͣ������� [10,9] �� [10,8] ����С�ġ�����Ԫ��֮�ʹ���������Ԫ��֮�͵������С����� [10,9] ��Ԫ��֮�����?
 ʾ�� 2��
 ���룺nums = [4,4,7,6,7]
 �����[7,7,6]
 ���ͣ������� [7,7] �ĺ�Ϊ 14 �����ϸ����ʣ�µ�����Ԫ��֮�ͣ�14 = 4 + 4 + 6������ˣ�[7,6,7] �������������С�����С�ע�⣬Ԫ�ذ��ǵ���˳�򷵻ء�
 ʾ�� 3��
 ���룺nums = [6]
 �����[6]
 ��ʾ��
 1 <= nums.length <= 500
 1 <= nums[i] <= 100
 */
public class MinSubsequence {
    public static void main(String[] args) {

    }
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list=  new ArrayList<Integer>();
        int total=0;
        for(int s:nums){
            total+=s;
        }
        Arrays.sort(nums);
        int temp=0;
        for(int i=nums.length-1;i>=0;i--){
            temp+=nums[i];
            list.add(nums[i]);
            if(2*temp>total){
                break;
            }
        }
        return list;

    }
    public List<Integer> minSubsequence_1(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        Stream<Integer> integerStream=stream.boxed();
        Integer[] integers=integerStream.toArray(Integer[]::new);
        Arrays.sort(integers,Collections.reverseOrder());
        int count=0;
        for (int i:integers){
            count+=i;
        }
        int Maxres=0;
        List<Integer> list = new ArrayList<>();
        for (int i:integers){
            if (Maxres<=count){
                count-=i;
                Maxres+=i;
                list.add(i);
            }
        }
        return list;
    }
}
