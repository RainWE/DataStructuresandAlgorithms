package per.algo.dynamic;

public class KnapsackProblem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] w = {0,1, 4, 3};//物品的重量
		int[] val = {0,1500, 3000, 2000}; //物品的价值 这里val[i] 就是前面讲的v[i]
		int m = 7; //背包的容量
		int n = val.length-1; //物品的个数
		
		
		
		//创建二维数组，
		//v[i][j] 表示在前i个物品中能够装入容量为j的背包中的最大价值
		int[][] v = new int[n+1][m+1];
		//为了记录放入商品的情况，我们定一个二维数组
		int[][] path = new int[n+1][m+1];
		
		//初始化第一行和第一列, 这里在本程序中，可以不去处理，因为默认就是0
		for(int i = 0; i < v.length; i++) {
			v[i][0] = 0; //将第一列设置为0
		}
		for(int i=0; i < v[0].length; i++) {
			v[0][i] = 0; //将第一行设置0
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

		//输出一下v 看看目前的情况
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
				System.out.printf("第%d个商品放入到背包\n", i);
				j-=w[i];
			}
			i--;
		}

	}

}
