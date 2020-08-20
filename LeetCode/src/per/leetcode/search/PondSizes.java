package per.leetcode.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**ˮ���С
 ����һ�����ڱ�ʾһƬ���ص���������land���þ�����ÿ�����ֵ�����Ӧ�ص�ĺ��θ߶ȡ���ֵΪ0���ʾˮ��
 �ɴ�ֱ��ˮƽ��Խ����ӵ�ˮ��Ϊ�����������Ĵ�С��ָ�����ӵ�ˮ��ĸ�������дһ��������������������г����Ĵ�С������ֵ��Ҫ��С��������
 ʾ����
 ���룺        0 1 2 3
            [
        0    [0,2,1,0],                           �� ��
        1    [0,1,0,1],     x=1   y=2  val=0  num[1][2]=0
        2    [1,1,0,1],
        3    [0,1,0,1]
            ]
 ����� [1,2,4]
 ��ʾ��
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
        // ��һ��List<Integer>תint[]
        // int[] result = new int[list.size()];
        // for (int i = 0; i < result.length; i++) {
        //   result[i] = list.get(i);
        // }

        // �ڶ���List<Integer>תint[]�������Ҹ�Ч
        int[] result = list.stream().mapToInt(Integer::valueOf).toArray();

        Arrays.sort(result);

        return result;


    }
    //�жϴ�ֱ��ˮƽ��Խ����ӵ��Ƿ�Ϊˮ��
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
