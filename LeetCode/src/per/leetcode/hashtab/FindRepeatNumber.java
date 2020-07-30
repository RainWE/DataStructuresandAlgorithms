package per.leetcode.hashtab;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**�������ظ�������
 �ҳ��������ظ������֡�
 ��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1 �ķ�Χ�ڡ�
 ������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ�
 ���ҳ�����������һ���ظ������֡�
 ʾ�� 1��
 ���룺
 [2, 3, 1, 0, 2, 5, 3]
 �����2 �� 3
 ���ƣ�
 2 <= n <= 100000
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i],1);
            }
        }
        return -1;
    }
    public int findRepeatNumber_1(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

}
