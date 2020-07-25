package per.leetcode.greedy;


import java.util.Arrays;
import java.util.Comparator;

/**
 * ���ص���
 * ��˾�ƻ����� 2N �ˡ��� i �˷��� A �еķ���Ϊ costs[i][0]������ B �еķ���Ϊ costs[i][1]��
 * ���ؽ�ÿ���˶��ɵ�ĳ�����е���ͷ��ã�Ҫ��ÿ�����ж��� N �˵ִ
 * ʾ����
 * ���룺[[10,20],[30,200],[400,50],[30,20]]
 * �����110
 * A  B
 * 1[[10,20],
 * 2[30,200],
 * 3[400,50],
 * 4[30,20]]
 * ���ͣ�
 * ��һ����ȥ A �У�����Ϊ 10��
 * �ڶ�����ȥ A �У�����Ϊ 30��
 * ��������ȥ B �У�����Ϊ 50��
 * ���ĸ���ȥ B �У�����Ϊ 20��
 * ����ܷ���Ϊ 10 + 30 + 50 + 20 = 110��ÿ�����ж���һ����������ԡ�
 * ��ʾ��
 * 1 <= costs.length <= 100
 * costs.length Ϊż��
 * 1 <= costs[i][0], costs[i][1] <= 1000
 */
public class TwoCitySchedCost {
    public static void main(String[] args) {
        //-170 -10 10 350
        //-170ȥA�ķ��ñ�ȥB�ķ����ٻ�170
        //350ȥA�ķ��ñ�ȥB�ķ��ö໨170
        //[30,200][10,20][30,20][400,50]
        int costs[][] = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        System.out.println(twoCitySchedCost_1(costs));
    }

    /**
     ������������������⣬��˾���Ƚ��� 2N ����ȫ�����ŷ��� B �У���ѡ�� N ���˸ı����ǵ��г̣������Ƿ��� A �С�
     ���ѡ��ı�һ���˵��г̣���ô��˾������⸶�� price_A - price_B �ķ��ã�������ÿ����ɸ���
     ������ŵķ����ǣ�ѡ�� price_A - price_B ��С�� N ���ˣ������Ƿ��� A �У������˷��� B �С�
     1.ȫ��ȥB�ķ�����290
     2.���ѡ��ı�һ���˵��г̣�Ҳ����ȥA����ʱ�ܷ���290����Ҫ����ȥA�ķ��ã�ͬʱ��Ҫ��ȥԭ��ȥB�ķ���
     ��290+(A-B) �磺290+(30-200) ��A��B   ��30-200=-170˵��ȥA�ɽ�ʡ�ܷ���170
     ��Ϊ����˵��ȥA�������ܷ���
     */
    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o1[1] - (o2[0] - o2[1]);//ȥA�ķ��ñ�ȥB�ķ��ý�ʡ���������Ĳ��֣���ʡΪ�������Ϊ����
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
