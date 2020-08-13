package per.leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

/**������������
 дһ��RecentCounter�����������������
 ��ֻ��һ��������ping(int t)������t�����Ժ���Ϊ��λ��ĳ��ʱ�䡣
 ���ش� 3000 ����ǰ�����ڵ�ping����
 �κδ���?[t - 3000, t]ʱ�䷶Χ֮�ڵ� ping�����ᱻ�������ڣ�������ǰ��ָ tʱ�̣��� ping��
 ��֤ÿ�ζ� ping �ĵ��ö�ʹ�ñ�֮ǰ����� t ֵ��
 ʾ����
 ���룺inputs = ["RecentCounter","ping","ping","ping","ping"],
 inputs = [[],[1],[100],[3001],[3002]]
 �����[null,1,2,3,3]
 ��ʾ��
 ÿ����������������10000��ping��
 ÿ������������ʹ���ϸ������ t ֵ������ping��
 ÿ�ε��� ping����1 <= t <= 10^9��
 */
class RecentCounter {
    Queue<Integer> queue =null;
    public RecentCounter() {
        queue=new LinkedList();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */