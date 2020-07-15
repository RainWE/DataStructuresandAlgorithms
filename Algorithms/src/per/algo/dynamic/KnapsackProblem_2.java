package per.algo.dynamic;

public class KnapsackProblem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] w = {0,1, 4, 3};//��Ʒ������
		int[] val = {0,1500, 3000, 2000}; //��Ʒ�ļ�ֵ ����val[i] ����ǰ�潲��v[i]
		int m = 7; //����������
		int n = val.length-1; //��Ʒ�ĸ���
		
		
		
		//������ά���飬
		//v[i][j] ��ʾ��ǰi����Ʒ���ܹ�װ������Ϊj�ı����е�����ֵ
		int[][] v = new int[n+1][m+1];
		//Ϊ�˼�¼������Ʒ����������Ƕ�һ����ά����
		int[][] path = new int[n+1][m+1];
		
		//��ʼ����һ�к͵�һ��, �����ڱ������У����Բ�ȥ������ΪĬ�Ͼ���0
		for(int i = 0; i < v.length; i++) {
			v[i][0] = 0; //����һ������Ϊ0
		}
		for(int i=0; i < v[0].length; i++) {
			v[0][i] = 0; //����һ������0
		}


		for(int i=1;i<v.length;i++){
			for(int j=1;j<v[0].length;j++){
				if(w[i]>j){
					v[i][j]=v[i-1][j];
				}else {
					if(v[i-1][j]<val[i]+v[i-1][j-w[i]]){
						v[i][j]=val[i]+v[i-1][j-w[i]];
						path[i][j]=1;
					}else {
						v[i][j]=v[i-1][j];
					}
				}
			}
		}

		//���һ��v ����Ŀǰ�����
		for(int i =0; i < v.length;i++) {
			for(int j = 0; j < v[i].length;j++) {
				System.out.print(v[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		for(int i =0; i < path.length;i++) {
			for(int j = 0; j < path[i].length;j++) {
				System.out.print(path[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		int i=path.length-1;
		int j=path[0].length-1;
		while (i>0 && j>0){
			if(path[i][j]==1){
				System.out.printf("��%d����Ʒ���뵽����\n", i);
				j-=w[i];
			}
			i--;
		}

	}

}
