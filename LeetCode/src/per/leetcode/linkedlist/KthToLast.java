package per.leetcode.linkedlist;


import java.util.ArrayList;
import java.util.List;

/**
 * ���ص����� k ���ڵ�
 * ʵ��һ���㷨���ҳ����������е����� k ���ڵ㡣���ظýڵ��ֵ��
 * ע�⣺�������ԭ�������Ķ�
 * ʾ����
 * ���룺 1->2->3->4->5 �� k = 2
 * ����� 4
 * ˵���������� k?��֤����Ч�ġ�
 */
public class KthToLast {
    //˫ָ�룬Ч�����
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
