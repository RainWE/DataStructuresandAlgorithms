package per.leetcode.sort;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 距离顺序排列矩阵单元格
 * 给出 R 行 C 列的矩阵，其中的单元格的整数坐标为 (r, c)，满足 0 <= r < R 且 0 <= c < C。
 * 另外，我们在该矩阵中给出了一个坐标为?(r0, c0) 的单元格。
 * 返回矩阵中的所有单元格的坐标，并按到 (r0, c0) 的距离从最小到最大的顺序排，其中，两单元格(r1, c1) 和 (r2, c2) 之间的距离是曼哈顿距离，
 * |r1 - r2| + |c1 - c2|。（你可以按任何满足此条件的顺序返回答案。）
 * 示例 1：
 * 输入：R = 1, C = 2, r0 = 0, c0 = 0
 * 输出：[[0,0],[0,1]]
 * 解释：从 (r0, c0) 到其他单元格的距离为：[0,1]
 * 示例 2：
 * 输入：R = 2, C = 2, r0 = 0, c0 = 1
 * 输出：[[0,1],[0,0],[1,1],[1,0]]
 * 解释：从 (r0, c0) 到其他单元格的距离为：[0,1,1,2]
 * [[0,1],[1,1],[0,0],[1,0]] 也会被视作正确答案。
 * 示例 3：
 * 输入：R = 2, C = 3, r0 = 1, c0 = 2
 * 输出：[[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
 * 解释：从 (r0, c0) 到其他单元格的距离为：[0,1,1,2,2,3]
 * 其他满足题目要求的答案也会被视为正确，例如 [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]]。
 * 提示：
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

    //桶排序
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] re = new int[R * C][2];//第0列代表x，第1列代表y
        //|r1 - r2| + |c1 - c2|，Math.max(r0-0, R - 1 - r0) + Math.max(c0-0, C - 1 - c0);
        //（r0,c0）到(0,0)和（R-1，C-1)之间的距离，去最长的，作为桶的个数，还需加1（本身）
        int maxDist = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);//总共有多少个桶  （R-1，C-1)最右下一个点
        ArrayList<LinkedList<Pos>> bucket = new ArrayList<>(maxDist + 1);//加上自身一个
        for (int i = 0; i <= maxDist; i++) {
            bucket.add(new LinkedList<>());
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int d = dist(i, j, r0, c0);//d桶的位置
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
