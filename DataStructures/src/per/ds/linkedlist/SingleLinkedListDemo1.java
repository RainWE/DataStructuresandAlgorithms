package per.ds.linkedlist;

import java.util.Stack;

public class SingleLinkedListDemo1 {

	public static void main(String[] args) {
		//进行测试
		//先创建节点
		HeroNode1 hero1 = new HeroNode1(1, "宋江", "及时雨");
		HeroNode1 hero2 = new HeroNode1(2, "卢俊义", "玉麒麟");
		HeroNode1 hero3 = new HeroNode1(3, "吴用", "智多星");
		HeroNode1 hero4 = new HeroNode1(4, "林冲", "豹子头");
		
		//创建要给链表
		SingleLinkedList1 singleLinkedList = new SingleLinkedList1();
		
		
		//加入
		singleLinkedList.add(hero1);
		singleLinkedList.add(hero4);
		singleLinkedList.add(hero2);
		singleLinkedList.add(hero3);

		// 测试一下单链表的反转功能
		System.out.println("原来链表的情况~~");
		singleLinkedList.list();
		
//		System.out.println("反转单链表~~");
//		reversetList(singleLinkedList.getHead());
//		singleLinkedList.list();
		
		System.out.println("测试逆序打印单链表, 没有改变链表的结构~~");
		reversePrint(singleLinkedList.getHead());
		
/*		
		//加入按照编号的顺序
		singleLinkedList.addByOrder(hero1);
		singleLinkedList.addByOrder(hero4);
		singleLinkedList.addByOrder(hero2);
		singleLinkedList.addByOrder(hero3);
		
		//显示一把
		singleLinkedList.list();
		
		//测试修改节点的代码
		HeroNode1 newHeroNode = new HeroNode(2, "小卢", "玉麒麟~~");
		singleLinkedList.update(newHeroNode);
		
		System.out.println("修改后的链表情况~~");
		singleLinkedList.list();
		
		//删除一个节点
		singleLinkedList.del(1);
		singleLinkedList.del(4);
		System.out.println("删除后的链表情况~~");
		singleLinkedList.list();
		
		//测试一下 求单链表中有效节点的个数
		System.out.println("有效的节点个数=" + getLength(singleLinkedList.getHead()));//2
		
		//测试一下看看是否得到了倒数第K个节点
		HeroNode res = findLastIndexNode(singleLinkedList.getHead(), 3);
		System.out.println("res=" + res);
*/		
		
	}
	
	//方式2：
	//可以利用栈这个数据结构，将各个节点压入到栈中，然后利用栈的先进后出的特点，就实现了逆序打印的效果
	public static void reversePrint(HeroNode1 head) {
		if(head.next ==null){
			return;
		}
		Stack<HeroNode1> stack = new Stack<>();
		HeroNode1 temp = head.next;
		while (temp !=null){
			stack.push(temp);
			temp=temp.next;
		}
		while (stack.size() > 0) {
			System.out.println(stack.pop()); //stack的特点是先进后出
		}
	}
	
	//将单链表反转
	public static void reversetList(HeroNode1 head) {
		if(head.next == null || head.next.next ==null){
			return;
		}
		HeroNode1 cur =head.next;
		HeroNode1 next =null;
		HeroNode1 reverseHead = new HeroNode1(0,"","");
		while (cur !=null) {
			next = cur.next;
			cur.next=reverseHead.next;
			reverseHead.next = cur;//把节点添加到reverseHead上去  注意这一步不能忘，没有这一步节点为空
			cur = next;
		}
		head.next =reverseHead.next;
	}
	
	//查找单链表中的倒数第k个结点 【新浪面试题】
	//思路
	//1. 编写一个方法，接收head节点，同时接收一个index 
	//2. index 表示是倒数第index个节点
	//3. 先把链表从头到尾遍历，得到链表的总的长度 getLength
	//4. 得到size 后，我们从链表的第一个开始遍历 (size-index)个，就可以得到
	//5. 如果找到了，则返回该节点，否则返回nulll
	public static HeroNode1 findLastIndexNode(HeroNode1 head, int index) {
		if(head.next==null){
			return null;
		}
		int size =getLength(head);
		if(index <0 || index>size){
			return null;
		}
		HeroNode1 cur = head.next;
		for(int i =0 ; i<size-index;i++){
			cur=cur.next;
		}
		return cur;
	}
	
	//方法：获取到单链表的节点的个数(如果是带头结点的链表，需求不统计头节点)
	/**
	 * @param head 链表的头节点
	 * @return 返回的就是有效节点的个数
	 */
	public static int getLength(HeroNode1 head) {
		if(head.next==null){
			return 0;
		}
		int length =0;
		HeroNode1 cur = head.next;
		while (cur.next != null){
			length++;
			cur= cur.next;
		}
		return length;
	}

}


//定义SingleLinkedList 管理我们的英雄
class SingleLinkedList1 {
	//先初始化一个头节点, 头节点不要动, 不存放具体的数据
	private HeroNode1 head = new HeroNode1(0, "", "");
	
	
	//返回头节点
	public HeroNode1 getHead() {
		return head;
	}

	//添加节点到单向链表
	//思路，当不考虑编号顺序时
	//1. 找到当前链表的最后节点
	//2. 将最后这个节点的next 指向 新的节点
	public void add(HeroNode1 heroNode) {
		HeroNode1 temp = head;
		while (true){
			if(temp.next==null){
				break;
			}
			temp=temp.next;
		}
		temp.next=heroNode;
	}
	
	//第二种方式在添加英雄时，根据排名将英雄插入到指定位置
	//(如果有这个排名，则添加失败，并给出提示)
	public void addByOrder(HeroNode1 heroNode) {
		HeroNode1 temp = head;
		boolean flag =false;
		while (true){
			if(temp.next==null){
				break;
			}
			if(temp.next.no > heroNode.no){
				break;
			}else if(temp.next.no == heroNode.no){
				flag =true;
				break;
			}
			temp = temp.next;
		}
		if(flag){
			System.out.printf("准备插入的英雄的编号 %d 已经存在了, 不能加入\n", heroNode.no);
		}else {
			heroNode.next=temp.next;
			temp.next=heroNode;
		}
	}

	//修改节点的信息, 根据no编号来修改，即no编号不能改.
	//说明
	//1. 根据 newHeroNode 的 no 来修改即可
	public void update(HeroNode1 newHeroNode) {
		if(head.next==null){
			System.out.println("链表为空");
			return;
		}
		HeroNode1 temp = head.next;
		boolean flag =false;
		while (true){
			if(temp ==null){
				break;
			}
			if(temp.no == newHeroNode.no){
				flag=true;
				break;
			}
			temp=temp.next;
		}
		if(flag){
			temp.name =newHeroNode.name;
			temp.nickname = newHeroNode.nickname;
		}else {
			System.out.printf("没有找到 编号 %d 的节点，不能修改\n", newHeroNode.no);
		}

	}
	
	//删除节点
	//思路
	//1. head 不能动，因此我们需要一个temp辅助节点找到待删除节点的前一个节点
	//2. 说明我们在比较时，是temp.next.no 和  需要删除的节点的no比较
	public void del(int no) {
		HeroNode1 temp = head;
		boolean flag =false;
		while (true){
			if(temp.next ==null){
				break;
			}
			if(temp.next.no == no){
				flag=true;
				break;
			}
			temp=temp.next;
		}
		if(false){
			temp.next=temp.next.next;
		}else {
			System.out.printf("要删除的 %d 节点不存在\n", no);
		}
	}
	
	//显示链表[遍历]
	public void list() {
		if(head.next==null){
			System.out.println("链表为空");
			return;
		}
		HeroNode1 temp = head.next;
		while (true){
			if(temp==null){
				break;
			}
			System.out.println(temp);
			temp=temp.next;
		}
	}
}

//定义HeroNode ， 每个HeroNode 对象就是一个节点
class HeroNode1 {
	public int no;
	public String name;
	public String nickname;
	public HeroNode1 next; //指向下一个节点
	//构造器
	public HeroNode1(int no, String name, String nickname) {
		this.no = no;
		this.name = name;
		this.nickname = nickname;
	}
	//为了显示方法，我们重新toString
	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + ", nickname=" + nickname + "]";
	}
	
}
