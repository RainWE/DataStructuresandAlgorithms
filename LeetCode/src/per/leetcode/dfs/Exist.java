package per.leetcode.dfs;

/**
 * �����е�·��
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
 * ·�����ԴӾ����е�����һ��ʼ��ÿһ�������ھ����������ҡ��ϡ����ƶ�һ��
 * ���һ��·�������˾����ĳһ����ô��·�������ٴν���ø��ӡ�
 * ���磬�������3��4�ľ����а���һ���ַ�����bfce����·����·���е���ĸ�üӴֱ������
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * �������в������ַ�����abfb����·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��
 * ·�������ٴν���������ӡ�
 * ʾ�� 1��
 * ���룺board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * �����true
 * ʾ�� 2��
 * ���룺board = [["a","b"],["c","d"]], word = "abcd"
 * �����false
 * ��ʾ��
 * 1 <= board.length <= 200
 * 1 <= board[i].length <= 200
 */
public class Exist {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (dfs(board,chars,i,j,0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != words[k]) {
            return false;
        }
        if (k == words.length - 1) return true;
        char tmp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board, words, i + 1, j, k+1) ||
                              dfs(board, words, i - 1, j, k+1) ||
                              dfs(board, words, i, j - 1, k+1) ||
                              dfs(board, words, i, j + 1, k+1);
        board[i][j]=tmp;
        return res;
    }
}
