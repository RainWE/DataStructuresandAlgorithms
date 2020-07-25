package per.leetcode.greedy;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 两地调度
 * 公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。
 * 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。
 * 示例：
 * 输入：[[10,20],[30,200],[400,50],[30,20]]
 * 输出：110
 * A  B
 * 1[[10,20],
 * 2[30,200],
 * 3[400,50],
 * 4[30,20]]
 * 解释：
 * 第一个人去 A 市，费用为 10。
 * 第二个人去 A 市，费用为 30。
 * 第三个人去 B 市，费用为 50。
 * 第四个人去 B 市，费用为 20。
 * 最低总费用为 10 + 30 + 50 + 20 = 110，每个城市都有一半的人在面试。
 * 提示：
 * 1 <= costs.length <= 100
 * costs.length 为偶数
 * 1 <= costs[i][0], costs[i][1] <= 1000
 */
public class TwoCitySchedCost {
    public static void main(String[] args) {
        //-170 -10 10 350
        //-170去A的费用比去B的费用少花170
        //350去A的费用比去B的费用多花170
        //[30,200][10,20][30,20][400,50]
        int costs[][] = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        System.out.println(twoCitySchedCost_1(costs));
    }

    /**
     我们这样来看这个问题，公司首先将这 2N 个人全都安排飞往 B 市，再选出 N 个人改变它们的行程，让他们飞往 A 市。
     如果选择改变一个人的行程，那么公司将会额外付出 price_A - price_B 的费用，这个费用可正可负。
     因此最优的方案是，选出 price_A - price_B 最小的 N 个人，让他们飞往 A 市，其余人飞往 B 市。
     1.全部去B的费用是290
     2.如果选择改变一个人的行程，也就是去A，这时总费用290就需要加上去A的费用，同时还要减去原来去B的费用
     即290+(A-B) 如：290+(30-200) 加A减B   而30-200=-170说明去A可节省总费用170
     若为正数说明去A会增加总费用
     */
    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o1[1] - (o2[0] - o2[1]);//去A的费用比去B的费用节省（或多出）的部分，节省为负，多出为正，
            }
        });
        int total = 0;
        int n = costs.length / 2;
        for (int i = 0; i < n; ++i){
            total += costs[i][0] + costs[i + n][1];
        }
        return total;
    }

    public static int twoCitySchedCost_1(int[][] costs){
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o1[1]-(o2[0]-o2[1]);
            }
        });
        int res=0;
        int n=costs.length/2;
        for(int i=0;i<n;i++){
            res+=costs[i][0]+costs[i+n][1];
        }
        return res;
    }
}
