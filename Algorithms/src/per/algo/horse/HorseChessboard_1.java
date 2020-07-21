package per.algo.horse;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class HorseChessboard_1 {

	private static int X; // 棋盘的列数
	private static int Y; // 棋盘的行数
	//创建一个数组，标记棋盘的各个位置是否被访问过
	private static boolean visited[];
	//使用一个属性，标记是否棋盘的所有位置都被访问
	private static boolean finished; // 如果为true,表示成功
	
	public static void main(String[] args) {
		System.out.println("骑士周游算法，开始运行~~");
		//测试骑士周游算法是否正确
		X = 8;
		Y = 8;
		int row = 1; //马儿初始位置的行，从1开始编号
		int column = 1; //马儿初始位置的列，从1开始编号
		//创建棋盘
		int[][] chessboard = new int[X][Y];
		visited = new boolean[X * Y];//初始值都是false
		//测试一下耗时
		long start = System.currentTimeMillis();
		traversalChessboard(chessboard, row - 1, column - 1, 1);
		long end = System.currentTimeMillis();
		System.out.println("共耗时: " + (end - start) + " 毫秒");
		
		//输出棋盘的最后情况
		for(int[] rows : chessboard) {
			for(int step: rows) {
				System.out.print(step + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * 完成骑士周游问题的算法
	 * @param chessboard 棋盘
	 * @param row 马儿当前的位置的行 从0开始 
	 * @param column 马儿当前的位置的列  从0开始
	 * @param step 是第几步 ,初始位置就是第1步 
	 */
	public static void traversalChessboard(int[][] chessboard, int row, int column, int step) {
		chessboard[row][column] =step;
		visited[row*X+Y]=true;
		ArrayList<Point> ps = next(new Point(column, row));
		sort(ps);
		while (!ps.isEmpty()){
			Point p = ps.remove(0);
			if(!visited[p.y * X + p.x]){
				traversalChessboard(chessboard,p.y,p.x,step+1);
			}
		}
		if(step<X*Y && !finished){
			chessboard[row][column]=0;
			finished=false;
		}else {
			finished=true;
		}
	}
	
	/**
	 * 功能： 根据当前位置(Point对象)，计算马儿还能走哪些位置(Point)，并放入到一个集合中(ArrayList), 最多有8个位置
	 * @param curPoint
	 * @return
	 */
	public static ArrayList<Point> next(Point curPoint) {
		ArrayList<Point> ps = new ArrayList<>();
		Point p1 = new Point();
		//5
		if((p1.x=curPoint.x-2)>=0 && (p1.y=curPoint.y-1)>=0){
			ps.add(new Point(p1));
		}
		//6
		if((p1.x=curPoint.x-1)>=0 && (p1.y=curPoint.y-2)>=0){
			ps.add(new Point(p1));
		}
		//7
		if((p1.x=curPoint.x+1)<X && (p1.y=curPoint.y-2)>=0){
			ps.add(new Point(p1));
		}
		//0
		if((p1.x=curPoint.x+2)<X && (p1.y=curPoint.y-1)>=0){
			ps.add(new Point(p1));
		}
		//1
		if((p1.x=curPoint.x+2)<X && (p1.y=curPoint.y+1)<Y){
			ps.add(new Point(p1));
		}
		//2
		if((p1.x=curPoint.x+1)<X && (p1.y=curPoint.y+2)<Y){
			ps.add(new Point(p1));
		}
		//3
		if((p1.x=curPoint.x-1)>=0 && (p1.y=curPoint.y+2)<Y){
			ps.add(new Point(p1));
		}
		//4
		if((p1.x=curPoint.x-2)>=0 && (p1.y=curPoint.y+1)<Y){
			ps.add(new Point(p1));
		}
		return ps;
	}

	//根据当前这个一步的所有的下一步的选择位置，进行非递减排序, 减少回溯的次数
	public static void sort(ArrayList<Point> ps) {
		ps.sort(new Comparator<Point>() {
		//非递减：9,6,5,5,5,4,4,3,3,2,2,1
			@Override
			public int compare(Point o1, Point o2) {
				// TODO Auto-generated method stub
				//获取到o1的下一步的所有位置个数
				int count1 = next(o1).size();
				//获取到o2的下一步的所有位置个数
				int count2 = next(o2).size();
				if(count1 < count2) {
					return -1;
				} else if (count1 == count2) {
					return 0;
				} else {
					return 1;
				}
			}

		});
	}
}
