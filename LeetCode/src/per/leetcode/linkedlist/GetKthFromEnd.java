package per.leetcode.linkedlist;

/**�����е�����k���ڵ�
 ����һ����������������е�����k���ڵ㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ�
 �����1��ʼ�������������β�ڵ��ǵ�����1���ڵ㡣
 ���磬һ��������6���ڵ㣬��ͷ�ڵ㿪ʼ�����ǵ�ֵ������1��2��3��4��5��6��
 �������ĵ�����3���ڵ���ֵΪ4�Ľڵ㡣
 ʾ��������һ������: 1->2->3->4->5, �� k = 2.
 �������� 4->5.
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
    //getKthFromEnd_1����
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