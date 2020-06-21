package src.per.ds.linkedlist;

public class DoubleLinkedListDemo1 {

    public static void main(String[] args) {
        // 测试
        System.out.println("双向链表的测试");
        // 先创建节点
        HeroNode3 hero1 = new HeroNode3(1, "宋江", "及时雨");
        HeroNode3 hero2 = new HeroNode3(2, "卢俊义", "玉麒麟");
        HeroNode3 hero3 = new HeroNode3(3, "吴用", "智多星");
        HeroNode3 hero4 = new HeroNode3(4, "林冲", "豹子头");
        // 创建一个双向链表
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
        // 修改
        HeroNode3 newHeroNode = new HeroNode3(4, "公孙胜", "入云龙");
        doubleLinkedList.update(newHeroNode);
        System.out.println("修改后的链表情况");
        doubleLinkedList.list();

        // 删除
        doubleLinkedList.del(3);
        System.out.println("删除后的链表情况~~");
        doubleLinkedList.list();
*/

    }

}

// 创建一个双向链表的类
class DoubleLinkedList3 {

    // 先初始化一个头节点, 头节点不要动, 不存放具体的数据
    private HeroNode3 head = new HeroNode3(0, "", "");

    // 返回头节点
    public HeroNode3 getHead() {
        return head;
    }

    // 遍历双向链表的方法
    // 显示链表[遍历]
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
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

    // 添加一个节点到双向链表的最后.
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

    // 修改一个节点的内容, 可以看到双向链表的节点内容修改和单向链表一样
    // 只是 节点类型改成 HeroNode3
    public void update(HeroNode3 newHeroNode) {
        if (head.next == null) {
            System.out.println("链表为空");
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
            System.out.printf("没有找到 编号 %d 的节点，不能修改\n", newHeroNode.no);
        }
    }

    // 从双向链表中删除一个节点,
    // 说明
    // 1 对于双向链表，我们可以直接找到要删除的这个节点
    // 2 找到后，自我删除即可
    public void del(int no) {
        if (head.next == null) {
            System.out.println("空链表");
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
            System.out.printf("要删除的 %d 节点不存在\n", no);
        }

    }
    //第二种方式在添加英雄时，根据排名将英雄插入到指定位置
    //(如果有这个排名，则添加失败，并给出提示)
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
            System.out.println("已存在");
        }else {
            if(temp.next==null){//链表为空
                temp.next = heroNode;
                heroNode.pre = temp;
            }else {//链表不为空
                heroNode.next=temp.next;
                temp.next.pre=heroNode;
                temp.next=heroNode;
                heroNode.pre=temp;
            }
        }
    }
}

// 定义HeroNode3 ， 每个HeroNode 对象就是一个节点
class HeroNode3 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode3 next; // 指向下一个节点, 默认为null
    public HeroNode3 pre; // 指向前一个节点, 默认为null
    // 构造器

    public HeroNode3(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    // 为了显示方法，我们重新toString
    @Override
    public String toString() {
        return "HeroNode [no=" + no + ", name=" + name + ", nickname=" + nickname + "]";
    }

}
