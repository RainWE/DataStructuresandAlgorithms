package per.leetcode.divideAndconquer;

/**����������
 ����M��N����ÿһ�С�ÿһ�ж����������У����д�����ҳ�ĳԪ�ء�
 ʾ��:
 ���о��� matrix ���£�
 [
 [1,   4,  7, 11, 15],
 [2,   5,  8, 12, 19],
 [3,   6,  9, 16, 22],
 [10, 13, 14, 17, 24],
 [18, 21, 23, 26, 30]
 ]
 ���� target?=?5������?true��
 ����?target?=?20������?false��
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x=matrix.length-1;
        int y=0;
        //x>=0 && x<=matrix.length-1 && y>=0 && y<=matrix[0].length-1
        while (x>=0 && y<matrix[0].length){
            if (target>matrix[x][y]){
                y++;
                continue;
            }
            if (target<matrix[x][y]){
                x--;
                continue;
            }
            if (target==matrix[x][y]){
                return true;
            }
        }
        return false;
    }
}
