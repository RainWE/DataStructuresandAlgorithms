package per.leetcode.sort;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ����˳�����о���Ԫ��
 * ���� R �� C �еľ������еĵ�Ԫ�����������Ϊ (r, c)������ 0 <= r < R �� 0 <= c < C��
 * ���⣬�����ڸþ����и�����һ������Ϊ?(r0, c0) �ĵ�Ԫ��
 * ���ؾ����е����е�Ԫ������꣬������ (r0, c0) �ľ������С������˳���ţ����У�����Ԫ��(r1, c1) �� (r2, c2) ֮��ľ����������پ��룬
 * |r1 - r2| + |c1 - c2|��������԰��κ������������˳�򷵻ش𰸡���
 * ʾ�� 1��
 * ���룺R = 1, C = 2, r0 = 0, c0 = 0
 * �����[[0,0],[0,1]]
 * ���ͣ��� (r0, c0) ��������Ԫ��ľ���Ϊ��[0,1]
 * ʾ�� 2��
 * ���룺R = 2, C = 2, r0 = 0, c0 = 1
 * �����[[0,1],[0,0],[1,1],[1,0]]
 * ���ͣ��� (r0, c0) ��������Ԫ��ľ���Ϊ��[0,1,1,2]
 * [[0,1],[1,1],[0,0],[1,0]] Ҳ�ᱻ������ȷ�𰸡�
 * ʾ�� 3��
 * ���룺R = 2, C = 3, r0 = 1, c0 = 2
 * �����[[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
 * ���ͣ��� (r0, c0) ��������Ԫ��ľ���Ϊ��[0,1,1,2,2,3]
 * ����������ĿҪ��Ĵ�Ҳ�ᱻ��Ϊ��ȷ������ [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]]��
 * ��ʾ��
 * 1 <= R <= 100
 * 1 <= C <= 100
 * 0 <= r0 < R
 * 0 <= c0 < C
 */
public class AllCellsDistOrder {
    public static void main(String[] args) {
//        int R = 1, C = 2, r0 = 0, c0 = 0;
        int R = 2, C = 2, r0 = 0, c0 = 1;
        allCellsDistOrder(R, C, r0, c0);
    }

    //Ͱ����
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] re = new int[R * C][2];//��0�д���x����1�д���y
        //|r1 - r2| + |c1 - c2|��Math.max(r0-0, R - 1 - r0) + Math.max(c0-0, C - 1 - c0);
        //��r0,c0����(0,0)�ͣ�R-1��C-1)֮��ľ��룬ȥ��ģ���ΪͰ�ĸ����������1������
        int maxDist = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);//�ܹ��ж��ٸ�Ͱ  ��R-1��C-1)������һ����
        ArrayList<LinkedList<Pos>> bucket = new ArrayList<>(maxDist + 1);//��������һ��
        for (int i = 0; i <= maxDist; i++) {
            bucket.add(new LinkedList<>());
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int d = dist(i, j, r0, c0);//dͰ��λ��
                LinkedList<Pos> list = bucket.get(d);
                list.add(new Pos(i, j));
            }
        }
        int cnt = 0;
        for (int i = 0; i <= maxDist; i++) {
            LinkedList<Pos> list = bucket.get(i);
            if (list.isEmpty()) continue;
            for (Pos p : list) {
                re[cnt][0] = p.r;
                re[cnt][1] = p.c;
                cnt++;
            }
        }

        return re;
    }

    public static int[][] allCellsDistOrder_1(int R, int C, int r0, int c0) {
        int res[][] = new int[R * C][2];
        int maxBucket = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);
        ArrayList<LinkedList<Pos>> list = new ArrayList<>(maxBucket + 1);
        for (int i = 0; i <= maxBucket; i++) {
            list.add(new LinkedList<>());
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int dist = dist(i, j, r0, c0);
                LinkedList<Pos> linkedList = list.get(dist);
                linkedList.add(new Pos(i, j));
            }
        }
        int cnt = 0;
        for (int i = 0; i <= maxBucket; i++) {
            LinkedList<Pos> lt = list.get(i);
            if (lt.isEmpty()) continue;
            for (Pos p : lt) {
                res[cnt][0] = p.r;
                res[cnt][1] = p.c;
                cnt++;
            }
        }
        return res;
    }

    private static int dist(int r1, int c1, int r2, int c2) {
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }

    private static class Pos {
        int r;
        int c;

        public Pos(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }


    //BFS
    public int[][] allCellsDistOrder_2(int R, int C, int r0, int c0) {
        int[][] re = new int[R * C][2];
        int dist = 0;
        int cnt = 0;
        int[] factor = {-1, 1};
        while (cnt < R * C) {
            for (int rowDist = 0; rowDist <= dist; rowDist++) {
                int colDist = dist - rowDist;
                for (int i = 0; i < 2; i++) {
                    int row = r0 + factor[i] * rowDist;
                    for (int j = 0; j < 2; j++) {
                        int col = c0 + factor[j] * colDist;
                        if (row >= 0 && row < R && col >= 0 && col < C) {
                            re[cnt][0] = row;
                            re[cnt][1] = col;
                            cnt++;
                        }
                        if (colDist == 0) break;
                    }
                    if (rowDist == 0) break;
                }
            }
            dist++;
        }

        return re;
    }

}
