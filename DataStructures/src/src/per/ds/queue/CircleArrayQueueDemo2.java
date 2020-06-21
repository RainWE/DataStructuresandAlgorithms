package src.per.ds.queue;

import java.util.Scanner;

public class CircleArrayQueueDemo2 {

	public static void main(String[] args) {
		
		//����һ��
		System.out.println("��������ģ�⻷�ζ��еİ���~~~");
		
		// ����һ�����ζ���
		CircleArray2 queue = new CircleArray2(4); //˵������4, ����е���Ч���������3
		char key = ' '; // �����û�����
		Scanner scanner = new Scanner(System.in);//
		boolean loop = true;
		// ���һ���˵�
		while (loop) {
			System.out.println("s(show): ��ʾ����");
			System.out.println("e(exit): �˳�����");
			System.out.println("a(add): ������ݵ�����");
			System.out.println("g(get): �Ӷ���ȡ������");
			System.out.println("h(head): �鿴����ͷ������");
			key = scanner.next().charAt(0);// ����һ���ַ�
			switch (key) {
			case 's':
				queue.showQueue();
				break;
			case 'a':
				System.out.println("���һ����");
				int value = scanner.nextInt();
				queue.addQueue(value);
				break;
			case 'g': // ȡ������
				try {
					int res = queue.getQueue();
					System.out.printf("ȡ����������%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'h': // �鿴����ͷ������
				try {
					int res = queue.headQueue();
					System.out.printf("����ͷ��������%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'e': // �˳�
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


class CircleArray2 {
	 private int maxsize;// ��ʾ������������
	//front �����ĺ�����һ�������� front ��ָ����еĵ�һ��Ԫ��, Ҳ����˵ arr[front] ���Ƕ��еĵ�һ��Ԫ��
	//front �ĳ�ʼֵ = 0
	private int front;
	//rear �����ĺ�����һ��������rear ָ����е����һ��Ԫ�صĺ�һ��λ��. ��Ϊϣ���ճ�һ���ռ���ΪԼ��.
	//rear �ĳ�ʼֵ = 0
	// ����β
	private int rear;
	 // ���������ڴ������, ģ�����
	private int arr[];
	public CircleArray2(int arrMaxSize) {
		maxsize=arrMaxSize;
		arr = new int[arrMaxSize];
	}
	
	// �ж϶����Ƿ���
	public boolean isFull() {
		//ȡģ��ֹrearԽ��
		return (rear+1)%maxsize==front;
	}
	
	// �ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return rear == front;
	}
	
	// ������ݵ�����
	public void addQueue(int n) {
		// �ж϶����Ƿ���
		if (isFull()) {
			System.out.println("�����������ܼ�������~");
			return;
		}
		//ֱ�ӽ����ݼ���
		arr[rear] =n;
		//�� rear ����, ������뿼��ȡģ
		rear = (rear + 1) % maxsize;
	}
	
	// ��ȡ���е�����, ������
	public int getQueue() {
		// �ж϶����Ƿ��
		if (isEmpty()) {
			// ͨ���׳��쳣
			throw new RuntimeException("���пգ�����ȡ����");
		}
		// ������Ҫ������ front��ָ����еĵ�һ��Ԫ��
		// 1. �Ȱ� front ��Ӧ��ֵ������һ����ʱ����
		// 2. �� front ����, ����ȡģ
		// 3. ����ʱ����ı�������
		int value = arr[front];
		front = (front+1)%maxsize;
		return value;
	}
	
	// ��ʾ���е���������
	public void showQueue() {
		// ����
		if (isEmpty()) {
			System.out.println("���пյģ�û������~~");
			return;
		}
		// ˼·����front��ʼ�������������ٸ�Ԫ��
		// ���Խ�
		for(int i=front;i<size()+front;i++){
			System.out.printf("arr[%d]=%d\n", i % maxsize, arr[i % maxsize]);
		}
	}
	
	// �����ǰ������Ч���ݵĸ���
	public int size() {
		// rear = 2
		// front = 1
		// maxSize = 3 
		return (rear +maxsize -front)%maxsize;
	}
	
	// ��ʾ���е�ͷ���ݣ� ע�ⲻ��ȡ������
	public int headQueue() {
		// �ж�
		if (isEmpty()) {
			throw new RuntimeException("���пյģ�û������~~");
		}
		return arr[front];
	}
}