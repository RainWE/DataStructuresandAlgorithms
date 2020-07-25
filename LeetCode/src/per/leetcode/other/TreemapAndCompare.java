package per.leetcode.other;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TreemapAndCompare {

    public static void main(String[] args) {
        //-170 -10 10 350
        //[30,200][10,20][30,20][400,50]
        int costs[][] = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};

        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return -(o1[0] - o1[1] - (o2[0] - o2[1]));
            }
        });
        for (int []a:costs){
            for (int s:a){
                System.out.printf("%d\t", s);
            }
            System.out.println();
        }

    }

}
