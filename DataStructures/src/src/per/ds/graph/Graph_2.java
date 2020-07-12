package src.per.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph_2 {

	private ArrayList<String> vertexList; //�洢���㼯��
	private int[][] edges; //�洢ͼ��Ӧ���ڽ����
	private int numOfEdges; //��ʾ�ߵ���Ŀ
	//���������boolean[], ��¼ĳ������Ƿ񱻷���
	private boolean[] isVisited;

	public static void main(String[] args) {
		//����һ��ͼ�Ƿ񴴽�ok
		int n = 8;  //���ĸ���
		//String Vertexs[] = {"A", "B", "C", "D", "E"};
		String Vertexs[] = {"1", "2", "3", "4", "5", "6", "7", "8"};

		//����ͼ����
		Graph_2 graph = new Graph_2(n);
		//ѭ������Ӷ���
		for(String vertex: Vertexs) {
			graph.insertVertex(vertex);
		}

		//��ӱ�
		//A-B A-C B-C B-D B-E
//		graph.insertEdge(0, 1, 1); // A-B
//		graph.insertEdge(0, 2, 1); //
//		graph.insertEdge(1, 2, 1); //
//		graph.insertEdge(1, 3, 1); //
//		graph.insertEdge(1, 4, 1); //

		//���±ߵĹ�ϵ
		graph.insertEdge(0, 1, 1);
		graph.insertEdge(0, 2, 1);
		graph.insertEdge(1, 3, 1);
		graph.insertEdge(1, 4, 1);
		graph.insertEdge(3, 7, 1);
		graph.insertEdge(4, 7, 1);
		graph.insertEdge(2, 5, 1);
		graph.insertEdge(2, 6, 1);
		graph.insertEdge(5, 6, 1);



		//��ʾһ���ڽ����
		graph.showGraph();

		//����һ�ѣ����ǵ�dfs�����Ƿ�ok
		System.out.println("��ȱ���");
		graph.dfs(); // A->B->C->D->E [1->2->4->8->5->3->6->7]
//		System.out.println();
		System.out.println("�������!");
		graph.bfs(); // A->B->C->D-E [1->2->3->4->5->6->7->8]

	}

	//������
	public Graph_2(int n) {
		//��ʼ�������vertexList
		edges = new int[n][n];
		vertexList = new ArrayList<String>(n);
		numOfEdges = 0;
		
	}
	
	//�õ���һ���ڽӽ����±� w 
	/**
	 * 
	 * @param index 
	 * @return ������ھͷ��ض�Ӧ���±꣬���򷵻�-1
	 */
	public int getFirstNeighbor(int index) {

		return -1;
	}
	//����ǰһ���ڽӽ����±�����ȡ��һ���ڽӽ��
	public int getNextNeighbor(int v1, int v2) {

		return -1;
	}
	
	//������ȱ����㷨
	//i ��һ�ξ��� 0
	private void dfs(boolean[] isVisited, int i) {

		
	}
	
	//��dfs ����һ������, �����������еĽ�㣬������ dfs
	public void dfs() {

	}
	
	//��һ�������й�����ȱ����ķ���
	private void bfs(boolean[] isVisited, int i) {


	} 
	
	//�������еĽ�㣬�����й����������
	public void bfs() {

	}
	
	//ͼ�г��õķ���
	//���ؽ��ĸ���
	public int getNumOfVertex() {
		return vertexList.size();
	}
	//��ʾͼ��Ӧ�ľ���
	public void showGraph() {
		for(int[] link : edges) {
			System.err.println(Arrays.toString(link));
		}
	}
	//�õ��ߵ���Ŀ
	public int getNumOfEdges() {
		return numOfEdges;
	}
	//���ؽ��i(�±�)��Ӧ������ 0->"A" 1->"B" 2->"C"
	public String getValueByIndex(int i) {
		return vertexList.get(i);
	}
	//����v1��v2��Ȩֵ
	public int getWeight(int v1, int v2) {
		return edges[v1][v2];
	}
	//������
	public void insertVertex(String vertex) {
		vertexList.add(vertex);
	}
	//��ӱ�
	/**
	 * 
	 * @param v1 ��ʾ����±꼴ʹ�ڼ�������  "A"-"B" "A"->0 "B"->1
	 * @param v2 �ڶ��������Ӧ���±�
	 * @param weight ��ʾ 
	 */
	public void insertEdge(int v1, int v2, int weight) {
		edges[v1][v2] = weight;
		edges[v2][v1] = weight;
		numOfEdges++;
	}
}
