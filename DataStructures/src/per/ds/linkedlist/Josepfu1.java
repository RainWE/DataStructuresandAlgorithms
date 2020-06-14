package per.ds.linkedlist;

public class Josepfu1 {

    public static void main(String[] args) {
        // ����һ�ѿ����������������ͱ����Ƿ�ok
        CircleSingleLinkedList1 circleSingleLinkedList = new CircleSingleLinkedList1();
        circleSingleLinkedList.addBoy(5);// ����5��С���ڵ�
        circleSingleLinkedList.showBoy();

        //����һ��С����Ȧ�Ƿ���ȷ
        circleSingleLinkedList.countBoy(1, 2, 5); // 2->4->1->5->3
        //String str = "7*2*2-5+1-5+3-3";
    }

}

// ����һ�����εĵ�������
class CircleSingleLinkedList1 {
    // ����һ��first�ڵ�,��ǰû�б��
    private Boy1 first = null;

    // ���С���ڵ㣬������һ�����ε�����
    public void addBoy(int nums) {
        if (nums < 1) {
            System.out.println("���ֲ���ȷ");
            return;
        }
        Boy1 curBoy = null;
        for (int i = 1; i <= nums; i++) {
            Boy1 boy = new Boy1(i);
            if (i == 1) {
                first = boy;
                first.setNext(first);
                curBoy = first;
            } else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }

        }
    }

    // ������ǰ�Ļ�������
    public void showBoy() {
        if (first == null) {
            System.out.println("û���κ�С��");
            return;
        }
        Boy1 curBoy = first;
        while (true) {
            System.out.printf("С���ı�� %d \n", curBoy.getNo());
            if (curBoy.getNext() == first) {
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

    // �����û������룬�����С����Ȧ��˳��

    /**
     * @param startNo  ��ʾ�ӵڼ���С����ʼ����
     * @param countNum ��ʾ������
     * @param nums     ��ʾ����ж���С����Ȧ��
     */
    public void countBoy(int startNo, int countNum, int nums) {
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("������������ ����������");
            return;
        }
        Boy1 helper = first;
        while (true) {
            if (helper.getNext() == first) {
                break;
            }
            helper = helper.getNext();
        }
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }

        while (true) {
            if (first == helper) {
                break;
            }
            for (int i = 0; i < countNum - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.printf("С��%d��Ȧ\n", first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("�������Ȧ�е�С�����%d \n", first.getNo());


    }
}

// ����һ��Boy�࣬��ʾһ���ڵ�
class Boy1 {
    private int no;// ���
    private Boy1 next; // ָ����һ���ڵ�,Ĭ��null

    public Boy1(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy1 getNext() {
        return next;
    }

    public void setNext(Boy1 next) {
        this.next = next;
    }
}
