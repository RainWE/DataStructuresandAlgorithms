package per.leetcode.linkedlist;

/**链表中倒数第k个节点
 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，
 本题从1开始计数，即链表的尾节点是倒数第1个节点。
 例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。
 这个链表的倒数第3个节点是值为4的节点。
 示例：给定一个链表: 1->2->3->4->5, 和 k = 2.
 返回链表 4->5.
 */
public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head==null){
            return head;
        }
        int cout=0;
        ListNode temp=head;
        while (temp!=null){
            cout++;
            temp=temp.next;
        }
        temp=head;
        for (int i=0;i<cout-k;i++){
            temp=temp.next;
        }
        return temp;
    }
    //getKthFromEnd_1更好
    public ListNode getKthFromEnd_1(ListNode head, int k) {
        ListNode former = head, latter = head;
        if(former == null) return null;
        for(int i = 0; i < k; i++) {
            former = former.next;
        }
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
    public ListNode getKthFromEnd_2(ListNode head, int k){
        ListNode temp =head,last = head;
        if (temp==null){
            return temp;
        }
        for (int i=0;i<k;i++){
            temp=temp.next;
        }
        while (temp!=null){
            temp=temp.next;
            last=last.next;
        }
        return last;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}