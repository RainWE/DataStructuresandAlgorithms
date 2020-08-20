package per.leetcode.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**水域大小
 你有一个用于表示一片土地的整数矩阵land，该矩阵中每个点的值代表对应地点的海拔高度。若值为0则表示水域。
 由垂直、水平或对角连接的水域为池塘。池塘的大小是指相连接的水域的个数。编写一个方法来计算矩阵中所有池塘的大小，返回值需要从小到大排序。
 示例：
 输入：        0 1 2 3
            [
        0    [0,2,1,0],                           行 列
        1    [0,1,0,1],     x=1   y=2  val=0  num[1][2]=0
        2    [1,1,0,1],
        3    [0,1,0,1]
            ]
 输出： [1,2,4]
 提示：
 0 < len(land) <= 1000
 0 < len(land[i]) <= 1000
 */

/**
                     [0,2,1,0],
                     [0,1,0,1],
                     [1,0,0,1],
                     [0,1,0,1]
 [0,2,1,0],
 [0,1,0,1],
 [1,1,0,1],
 [0,1,0,1]
 */
public class PondSizes {
    public static void main(String[] args) {
        int [][]lan= {{0,2,1,0},
                      {0,1,0,1},
                        {1,1,0,1},
                        {0,1,0,1}};
        int[] ints = pondSizes(lan);
        for (int i:ints){
            System.out.println(i);
        }
    }
    public static int[] pondSizes(int[][] land) {
       List<Integer> list= new ArrayList<>();
       for (int i=0;i<land.length;i++){
           for (int j=0;j<land[0].length;j++){
               int temp = judgement(land,i,j);
               if (temp != 0 ) list.add(temp);
           }
       }
        // 第一种List<Integer>转int[]
        // int[] result = new int[list.size()];
        // for (int i = 0; i < result.length; i++) {
        //   result[i] = list.get(i);
        // }

        // 第二种List<Integer>转int[]，优雅且高效
        int[] result = list.stream().mapToInt(Integer::valueOf).toArray();

        Arrays.sort(result);

        return result;


    }
    //判断垂直、水平或对角连接的是否为水域
    public static int judgement(int[][] land,int x,int y){
        int num=0;
        if (x<0 || x>= land.length || y<0 || y>=land[0].length || land[x][y]!=0){
            return num;
        }
        num++;
        land[x][y]=-1;
        num += judgement(land, x + 1, y);
        num += judgement(land, x - 1, y);
        num += judgement(land, x, y + 1);
        num += judgement(land, x, y - 1);
        num += judgement(land, x + 1, y + 1);
        num += judgement(land, x + 1, y - 1);
        num += judgement(land, x - 1, y + 1);
        num += judgement(land, x - 1, y - 1);
        return num;
    }
}
