package per.leetcode.divideAndconquer;

/**�ϲ��������������
 ����������������������ϲ�����������ʹ�������еĽڵ���Ȼ�ǵ�������ġ�
 ʾ��1��
 ���룺1->2->4, 1->3->4
 �����1->1->2->3->4->4
 ���ƣ�0 <= ������ <= 1000
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode listNode1 =new ListNode(1);
        ListNode listNode2 =new ListNode(2);
        ListNode listNode3 =new ListNode(4);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        ListNode listNode4 =new ListNode(1);
        ListNode listNode5 =new ListNode(3);
        ListNode listNode6 =new ListNode(4);
        listNode4.next=listNode5;
        listNode5.next=listNode6;

        ListNode temp=mergeTwoLists_1(listNode1,listNode4);

        while (temp!=null){
            System.out.printf(temp.val+"->");
            temp=temp.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }
        else if(l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
    public static ListNode mergeTwoLists_1(ListNode l1, ListNode l2){
        if(l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }
        if(l1.val<l2.val){
            l1.next=mergeTwoLists_1(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists_1(l1,l2.next);
            return l2;
        }
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
