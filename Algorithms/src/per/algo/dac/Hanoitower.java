package per.algo.dac;

public class Hanoitower {

    public static void main(String[] args) {
        hanoiTower(5, 'A', 'B', 'C');
    }

    //��ŵ�����ƶ��ķ���
    //ʹ�÷����㷨

	/**
	 *
	 * @param num
	 * @param a ��ʼ��
	 * @param b ������
	 * @param c Ŀ����
	 */
    public static void hanoiTower(int num, char a, char b, char c) {
        //���ֻ��һ����
        if (num == 1) {
            System.out.println("��1���̴� " + a + "->" + c);
        } else {
            //��������� n >= 2 ������������ǿ��Կ����������� 1.���±ߵ�һ���� 2. �����������
            //1. �Ȱ� ������������� A->B�� �ƶ����̻�ʹ�õ� c
            hanoiTower(num - 1, a, c, b);
            //2. �����±ߵ��� A->C
            System.out.println("��" + num + "���̴� " + a + "->" + c);
            //3. ��B���������� �� B->C , �ƶ�����ʹ�õ� a��
            hanoiTower(num - 1, b, a, c);

        }
    }

    public static void hanoiTower_1(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println("��1���̴� " + a + "->" + c);
        } else {
            hanoiTower_1(num - 1, a, c, b);
            System.out.println("��" + num + "���̴� " + a + "->" + c);
            hanoiTower_1(num - 1, b, a, c);
        }
    }

    public static void hanoiTower_2(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println("��1���̴� " + a + "->" + c);
        } else {
            hanoiTower_2(num - 1, a, c, b);
            System.out.println("��" + num + "���̴� " + a + "->" + c);
            hanoiTower_2(num - 1, b, a, c);
        }
    }

    public static void hanoiTower_3(int num, char a, char b, char c) {
		if(num==1){
			System.out.println("��һ���̴�"+a+"->"+c);
		}else {
			hanoiTower_3(num-1,a,c,b);
			System.out.println("��"+num+"���̴�"+a+"->"+c);
			hanoiTower_3(num-1,b,a,c);
		}
    }

    public static void hanoiTower_4(int num, char a, char b, char c) {
		if(num==1){
			System.out.println("��һ���̴�"+a+"->"+c);
		}else {
			hanoiTower_4(num-1,a,c,b);
			System.out.println("��"+num+"���̴�"+a+"->"+c);
			hanoiTower_4(num-1,b,a,c);
		}
    }
    public static void hanoiTower_5(int num, char a, char b, char c) {
		if(num==1){
			System.out.println("��һ���̴�"+a+"->"+c);
		}else {
			hanoiTower_5(num-1,a,c,b);
			System.out.println("��"+num+"���̴�"+a+"->"+c);
			hanoiTower_5(num-1,b,a,c);
		}
    }
 	public static void hanoiTower_6(int num, char a, char b, char c) {
		if(num==1){
			System.out.println("��һ���̴�"+a+"->"+c);
		}else {
			hanoiTower_6(num-1,a,c,b);
			System.out.println("��"+num+"���̴�"+a+"->"+c);
			hanoiTower_6(num-1,b,a,c);
		}
    }
 	public static void hanoiTower_7(int num, char a, char b, char c) {
		if(num==1){
			System.out.println("��һ���̴�"+a+"->"+c);
		}else {
			hanoiTower_7(num-1,a,c,b);
			System.out.println("��"+num+"���̴�"+a+"->"+c);
			hanoiTower_7(num-1,b,a,c);
		}
    }
 	public static void hanoiTower_8(int num, char a, char b, char c) {
		if(num==1){
			System.out.println("��һ���̴�"+a+"->"+c);
		}else {
			hanoiTower_8(num-1,a,c,b);
			System.out.println("��"+num+"���̴�"+a+"->"+c);
			hanoiTower_8(num-1,b,a,c);
		}
    }
 	public static void hanoiTower_9(int num, char a, char b, char c) {
		if(num==1){
			System.out.println("��һ���̴�"+a+"->"+c);
		}else {
			hanoiTower_9(num-1,a,c,b);
			System.out.println("��"+num+"���̴�"+a+"->"+c);
			hanoiTower_9(num-1,b,a,c);
		}
    }

}
