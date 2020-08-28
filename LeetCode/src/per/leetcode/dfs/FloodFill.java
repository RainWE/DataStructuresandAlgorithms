package per.leetcode.dfs;

/**��ɫ���
 ��д������ʵ�����ͼƬ�༭�����֧�ֵġ���ɫ��䡹���ܡ�
 ������ͼ���ö�ά���� image ��ʾ��Ԫ��Ϊ��ʼ��ɫֵ����ʼ�����ĺ�����Ϊ sr ������Ϊ sc����Ҫ��������ɫΪ newColor ��
 ����Χ������ָ��ɫ��ͬ�����ϡ��¡������ĸ������ϴ����������������Ԫ�ء�
 ��������ɫ����ʼ��������Χ���򣬲����������ͼ��
 ʾ����
 ���룺
 image = [[1,1,1],
         [1,1,0],
         [1,0,1]]
 sr = 1, sc = 1, newColor = 2
 �����[[2,2,2],
      [2,2,0],
     [2,0,1]]
 ����:
 ��ʼ�����λ��ͼ������м䣬���� (sr,sc)=(1,1) ��
 ��ʼ�������Χ���������з������������ص����ɫ�������ĳ� 2 ��
 ע�⣬���½ǵ�����û�и���Ϊ 2 ����Ϊ�������ڳ�ʼ��������Χ����
 ��ʾ��
 image ��image[0]�ĳ��Ⱦ��ڷ�Χ[1, 50] �ڡ�
 ��ʼ����� (sr,sc) ����0 <= sr < image.length ��0 <= sc < image[0].length ��
 image[i][j] ��newColor��ʾ����ɫֵ�ڷ�Χ[0, 65535] �ڡ�
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        dfs(image,sr,sc,oldColor,newColor);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int oldColor, int newColor){
        if (sr<0 || sc<0 || sr>=image.length || sc>=image[0].length){
            return;
        }
        int c=image[sr][sc];
        if (c!=newColor && c==oldColor){
            image[sr][sc]=newColor;
            dfs(image,sr,sc-1,oldColor,newColor);
            dfs(image,sr,sc+1,oldColor,newColor);
            dfs(image,sr-1,sc,oldColor,newColor);
            dfs(image,sr+1,sc,oldColor,newColor);
        }
    }

}
