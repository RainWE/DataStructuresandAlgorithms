package per.leetcode.other;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //第一题
    public int GetMaxConsecutiveOnes(int[] arr, int k) {
        int maxlength = 0;
        int count = 0;
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {//arr[i]==0
                if (count > maxlength) {
                    maxlength = count;//最大的1的长度
                    startIndex = i + 1 - count;//得到开始计数的起始位置
                }
                count = 0;
            }
        }
        int templ = 0;
        int tempr = 0;
        //向左
        if (arr[startIndex - k - 1] != 0) {
            while (startIndex - k - 1 >= 0 && arr[startIndex - k - 1] == 1) {
                templ++;
            }
        }
        //向右
        if (arr[startIndex + k + 1]!=0){
            while (startIndex + k + 1 < arr.length && arr[startIndex + k + 1] == 1) {
                tempr++;
            }
        }
        if (templ > tempr) {
            maxlength += templ;
        } else {
            maxlength += tempr;
        }
        return maxlength + k;
    }

    public int GetMaxConsecutiveOnes_1(int[] arr, int k) {
        int maxlength = 0;
        int count = 0;
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {

        }
        return 0;
    }

    //第二题

    /**
     * [1,2,3,4,8,12,11,10,9,5,6,7]
     * [1,2,3,4],
     * [5,6,7,8],
     * [9,10,11,12]
     */
    public int[] SpiralMatrix(int[][] matrix) {
        int m = matrix.length;//行
        int n = matrix[0].length;//列
        int res[] = new int[m * n];
        boolean [][]is=new boolean[m][n];
        help(is,matrix,res,0,0,0);
        return res;
    }

    public void help(boolean[][] is,int[][] arr,int[] res,int i,int j,int index) {
        if (i<0 || j<0 || i>arr.length || j>arr[0].length){
            return;
        }
        res[index]=arr[i][j];
        is[i][j]=true;
        index++;
        if (!is[i][j]){
            help(is,arr,res,i,j+1,index);
            help(is,arr,res,i+1,j,index);
            help(is,arr,res,i,j-1,index);
            help(is,arr,res,i-1,j,index);
        }
    }

    public static void main(String[] args) {
        String str = "aaabbaac";
        System.out.println(GetFragment(str));
    }

    //第三题
    public static int GetFragment(String str) {
        Map<StringBuilder, Integer> map = new HashMap<>();
        StringBuilder strtemp = new StringBuilder();
        char tempc = 0;
        for (char c : str.toCharArray()) {
            if (strtemp == null) {
                tempc = c;
                strtemp.append(c);
            } else {
                if (tempc == c) {
                    strtemp.append(c);
                } else {
                    map.put(strtemp, map.getOrDefault(strtemp, 0) + 1);
                    strtemp = new StringBuilder();
                    strtemp.append(c);
                    tempc = c;
                }
            }
        }
        int size = map.size();
        int res = 0;
        for (StringBuilder s : map.keySet()) {
            res += s.length();
        }
        return res / size;
    }
}
