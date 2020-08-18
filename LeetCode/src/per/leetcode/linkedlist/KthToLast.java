package per.leetcode.linkedlist;


import java.util.ArrayList;
import java.util.List;

/**
 * 返回倒数第 k 个节点
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * 注意：本题相对原题稍作改动
 * 示例：
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 * 说明：给定的 k?保证是有效的。
 */
public class KthToLast {
    //双指针，效率最高
    public int kthToLast_1(ListNode head, int k) {
        ListNode p =head;
        for (int i=0;i<k;i++){
            p=p.next;
        }
        while (p!=null){
            p=p.next;
            head=head.next;
        }
        return head.val;
    }

    public int kthToLast(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int n = list.get(list.size() - k);
        return n;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
