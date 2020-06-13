package per.ds.linkedlist;

import java.util.Stack;

public class SingleLinkedListDemo1 {

	public static void main(String[] args) {
		//���в���
		//�ȴ����ڵ�
		HeroNode1 hero1 = new HeroNode1(1, "�ν�", "��ʱ��");
		HeroNode1 hero2 = new HeroNode1(2, "¬����", "������");
		HeroNode1 hero3 = new HeroNode1(3, "����", "�Ƕ���");
		HeroNode1 hero4 = new HeroNode1(4, "�ֳ�", "����ͷ");
		
		//����Ҫ������
		SingleLinkedList1 singleLinkedList = new SingleLinkedList1();
		
		
		//����
		singleLinkedList.add(hero1);
		singleLinkedList.add(hero4);
		singleLinkedList.add(hero2);
		singleLinkedList.add(hero3);

		// ����һ�µ�����ķ�ת����
		System.out.println("ԭ����������~~");
		singleLinkedList.list();
		
//		System.out.println("��ת������~~");
//		reversetList(singleLinkedList.getHead());
//		singleLinkedList.list();
		
		System.out.println("���������ӡ������, û�иı�����Ľṹ~~");
		reversePrint(singleLinkedList.getHead());
		
/*		
		//���밴�ձ�ŵ�˳��
		singleLinkedList.addByOrder(hero1);
		singleLinkedList.addByOrder(hero4);
		singleLinkedList.addByOrder(hero2);
		singleLinkedList.addByOrder(hero3);
		
		//��ʾһ��
		singleLinkedList.list();
		
		//�����޸Ľڵ�Ĵ���
		HeroNode1 newHeroNode = new HeroNode(2, "С¬", "������~~");
		singleLinkedList.update(newHeroNode);
		
		System.out.println("�޸ĺ���������~~");
		singleLinkedList.list();
		
		//ɾ��һ���ڵ�
		singleLinkedList.del(1);
		singleLinkedList.del(4);
		System.out.println("ɾ������������~~");
		singleLinkedList.list();
		
		//����һ�� ����������Ч�ڵ�ĸ���
		System.out.println("��Ч�Ľڵ����=" + getLength(singleLinkedList.getHead()));//2
		
		//����һ�¿����Ƿ�õ��˵�����K���ڵ�
		HeroNode res = findLastIndexNode(singleLinkedList.getHead(), 3);
		System.out.println("res=" + res);
*/		
		
	}
	
	//��ʽ2��
	//��������ջ������ݽṹ���������ڵ�ѹ�뵽ջ�У�Ȼ������ջ���Ƚ�������ص㣬��ʵ���������ӡ��Ч��
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
			System.out.println(stack.pop()); //stack���ص����Ƚ����
		}
	}
	
	//��������ת
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
			reverseHead.next = cur;//�ѽڵ���ӵ�reverseHead��ȥ  ע����һ����������û����һ���ڵ�Ϊ��
			cur = next;
		}
		head.next =reverseHead.next;
	}
	
	//���ҵ������еĵ�����k����� �����������⡿
	//˼·
	//1. ��дһ������������head�ڵ㣬ͬʱ����һ��index 
	//2. index ��ʾ�ǵ�����index���ڵ�
	//3. �Ȱ������ͷ��β�������õ�������ܵĳ��� getLength
	//4. �õ�size �����Ǵ�����ĵ�һ����ʼ���� (size-index)�����Ϳ��Եõ�
	//5. ����ҵ��ˣ��򷵻ظýڵ㣬���򷵻�nulll
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
	
	//��������ȡ��������Ľڵ�ĸ���(����Ǵ�ͷ������������ͳ��ͷ�ڵ�)
	/**
	 * @param head �����ͷ�ڵ�
	 * @return ���صľ�����Ч�ڵ�ĸ���
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


//����SingleLinkedList �������ǵ�Ӣ��
class SingleLinkedList1 {
	//�ȳ�ʼ��һ��ͷ�ڵ�, ͷ�ڵ㲻Ҫ��, ����ž��������
	private HeroNode1 head = new HeroNode1(0, "", "");
	
	
	//����ͷ�ڵ�
	public HeroNode1 getHead() {
		return head;
	}

	//��ӽڵ㵽��������
	//˼·���������Ǳ��˳��ʱ
	//1. �ҵ���ǰ��������ڵ�
	//2. ���������ڵ��next ָ�� �µĽڵ�
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
	
	//�ڶ��ַ�ʽ�����Ӣ��ʱ������������Ӣ�۲��뵽ָ��λ��
	//(�������������������ʧ�ܣ���������ʾ)
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
			System.out.printf("׼�������Ӣ�۵ı�� %d �Ѿ�������, ���ܼ���\n", heroNode.no);
		}else {
			heroNode.next=temp.next;
			temp.next=heroNode;
		}
	}

	//�޸Ľڵ����Ϣ, ����no������޸ģ���no��Ų��ܸ�.
	//˵��
	//1. ���� newHeroNode �� no ���޸ļ���
	public void update(HeroNode1 newHeroNode) {
		if(head.next==null){
			System.out.println("����Ϊ��");
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
			System.out.printf("û���ҵ� ��� %d �Ľڵ㣬�����޸�\n", newHeroNode.no);
		}

	}
	
	//ɾ���ڵ�
	//˼·
	//1. head ���ܶ������������Ҫһ��temp�����ڵ��ҵ���ɾ���ڵ��ǰһ���ڵ�
	//2. ˵�������ڱȽ�ʱ����temp.next.no ��  ��Ҫɾ���Ľڵ��no�Ƚ�
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
			System.out.printf("Ҫɾ���� %d �ڵ㲻����\n", no);
		}
	}
	
	//��ʾ����[����]
	public void list() {
		if(head.next==null){
			System.out.println("����Ϊ��");
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

//����HeroNode �� ÿ��HeroNode �������һ���ڵ�
class HeroNode1 {
	public int no;
	public String name;
	public String nickname;
	public HeroNode1 next; //ָ����һ���ڵ�
	//������
	public HeroNode1(int no, String name, String nickname) {
		this.no = no;
		this.name = name;
		this.nickname = nickname;
	}
	//Ϊ����ʾ��������������toString
	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + ", nickname=" + nickname + "]";
	}
	
}
