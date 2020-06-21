package src.per.ds.linkedlist;

public class DoubleLinkedListDemo1 {

    public static void main(String[] args) {
        // ����
        System.out.println("˫������Ĳ���");
        // �ȴ����ڵ�
        HeroNode3 hero1 = new HeroNode3(1, "�ν�", "��ʱ��");
        HeroNode3 hero2 = new HeroNode3(2, "¬����", "������");
        HeroNode3 hero3 = new HeroNode3(3, "����", "�Ƕ���");
        HeroNode3 hero4 = new HeroNode3(4, "�ֳ�", "����ͷ");
        // ����һ��˫������
        DoubleLinkedList3 doubleLinkedList = new DoubleLinkedList3();
//        doubleLinkedList.add(hero1);
//        doubleLinkedList.add(hero2);
//        doubleLinkedList.add(hero3);
//        doubleLinkedList.add(hero4);

        doubleLinkedList.addByOrder(hero4);
        doubleLinkedList.addByOrder(hero2);
        doubleLinkedList.addByOrder(hero3);
        doubleLinkedList.addByOrder(hero1);
        doubleLinkedList.list();
/*
        // �޸�
        HeroNode3 newHeroNode = new HeroNode3(4, "����ʤ", "������");
        doubleLinkedList.update(newHeroNode);
        System.out.println("�޸ĺ���������");
        doubleLinkedList.list();

        // ɾ��
        doubleLinkedList.del(3);
        System.out.println("ɾ������������~~");
        doubleLinkedList.list();
*/

    }

}

// ����һ��˫���������
class DoubleLinkedList3 {

    // �ȳ�ʼ��һ��ͷ�ڵ�, ͷ�ڵ㲻Ҫ��, ����ž��������
    private HeroNode3 head = new HeroNode3(0, "", "");

    // ����ͷ�ڵ�
    public HeroNode3 getHead() {
        return head;
    }

    // ����˫������ķ���
    // ��ʾ����[����]
    public void list() {
        if (head.next == null) {
            System.out.println("����Ϊ��");
            return;
        }
        HeroNode3 temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // ���һ���ڵ㵽˫����������.
    public void add(HeroNode3 heroNode) {
        HeroNode3 temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
        heroNode.pre = temp;

    }

    // �޸�һ���ڵ������, ���Կ���˫������Ľڵ������޸ĺ͵�������һ��
    // ֻ�� �ڵ����͸ĳ� HeroNode3
    public void update(HeroNode3 newHeroNode) {
        if (head.next == null) {
            System.out.println("����Ϊ��");
            return;
        }
        HeroNode3 temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == newHeroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.printf("û���ҵ� ��� %d �Ľڵ㣬�����޸�\n", newHeroNode.no);
        }
    }

    // ��˫��������ɾ��һ���ڵ�,
    // ˵��
    // 1 ����˫���������ǿ���ֱ���ҵ�Ҫɾ��������ڵ�
    // 2 �ҵ�������ɾ������
    public void del(int no) {
        if (head.next == null) {
            System.out.println("������");
            return;
        }
        HeroNode3 temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.printf("Ҫɾ���� %d �ڵ㲻����\n", no);
        }

    }
    //�ڶ��ַ�ʽ�����Ӣ��ʱ������������Ӣ�۲��뵽ָ��λ��
    //(�������������������ʧ�ܣ���������ʾ)
    public void addByOrder(HeroNode3 heroNode) {
        HeroNode3 temp = head;
        boolean flag =false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if(temp.next.no>heroNode.no){
                break;
            }else if(temp.next.no==heroNode.no){
                flag=true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("�Ѵ���");
        }else {
            if(temp.next==null){//����Ϊ��
                temp.next = heroNode;
                heroNode.pre = temp;
            }else {//����Ϊ��
                heroNode.next=temp.next;
                temp.next.pre=heroNode;
                temp.next=heroNode;
                heroNode.pre=temp;
            }
        }
    }
}

// ����HeroNode3 �� ÿ��HeroNode �������һ���ڵ�
class HeroNode3 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode3 next; // ָ����һ���ڵ�, Ĭ��Ϊnull
    public HeroNode3 pre; // ָ��ǰһ���ڵ�, Ĭ��Ϊnull
    // ������

    public HeroNode3(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    // Ϊ����ʾ��������������toString
    @Override
    public String toString() {
        return "HeroNode [no=" + no + ", name=" + name + ", nickname=" + nickname + "]";
    }

}
