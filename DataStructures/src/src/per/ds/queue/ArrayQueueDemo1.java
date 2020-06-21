package src.per.ds.queue;

import java.util.Scanner;

public class ArrayQueueDemo1 {

	public static void main(String[] args) {
		//����һ��
		//����һ������
		ArrayQueue1 queue = new ArrayQueue1(3);
		char key = ' '; //�����û�����
		Scanner scanner = new Scanner(System.in);//
		boolean loop = true;
		//���һ���˵�
		while(loop) {
			System.out.println("s(show): ��ʾ����");
			System.out.println("e(exit): �˳�����");
			System.out.println("a(add): ������ݵ�����");
			System.out.println("g(get): �Ӷ���ȡ������");
			System.out.println("h(head): �鿴����ͷ������");
			key = scanner.next().charAt(0);//����һ���ַ�
			switch (key) {
			case 's':
				queue.showQueue();
				break;
			case 'a':
				System.out.println("���һ����");
				int value = scanner.nextInt();
				queue.addQueue(value);
				break;
			case 'g': //ȡ������
				try {
					int res = queue.getQueue();
					System.out.printf("ȡ����������%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'h': //�鿴����ͷ������
				try {
					int res = queue.headQueue();
					System.out.printf("����ͷ��������%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'e': //�˳�
				scanner.close();
				loop = false;
				break;
			default:
				break;
			}
		}
		
		System.out.println("�����˳�~~");
	}

}

// ʹ������ģ�����-��дһ��ArrayQueue��
class ArrayQueue1 {
	 private int maxsize;// ��ʾ������������
	 private int front;// ����ͷ
	 private int rear;// ����β
	 private int arr[];// ���������ڴ������, ģ�����

	// �������еĹ�����
	public ArrayQueue1(int arrMaxSize) {
		maxsize =arrMaxSize;
		arr = new int[maxsize];
		 front = -1;// ָ�����ͷ����������front��ָ�����ͷ��ǰһ��λ��.
		 rear = -1;// ָ�����β��ָ�����β������(�����Ƕ������һ������)
	}

	// �ж϶����Ƿ���
	public boolean isFull() {
		return rear == maxsize-1;
	}

	// �ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return rear==front;
	}

	// ������ݵ�����
	public void addQueue(int n) {
		// �ж϶����Ƿ���
		if(isFull()){
			System.out.println("�����������ܼ�������~");
			return;
		}

		rear++; // ��rear ����
		arr[rear]=n;
	}

	// ��ȡ���е�����, ������
	public int getQueue() {
		// �ж϶����Ƿ��
		if(isEmpty()){
			// ͨ���׳��쳣
			throw new RuntimeException("���пգ�����ȡ����");
		}
		front++;// front����
		return arr[front];
	}

	// ��ʾ���е���������
	public void showQueue() {
		if(isEmpty()){
			System.out.println("���пյģ�û������~~");
			return;
		}
		// ����
		for (int i =0;i<arr.length;i++){
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}
	}

	// ��ʾ���е�ͷ���ݣ� ע�ⲻ��ȡ������
	public int headQueue() {
		// �ж�
		if(isEmpty()){
			throw new RuntimeException("���пյģ�û������~~");
		}
		return arr[front+1];
	}
}
