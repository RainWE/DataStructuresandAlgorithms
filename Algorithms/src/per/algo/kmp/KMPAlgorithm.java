package per.algo.kmp;

import java.util.Arrays;

public class KMPAlgorithm {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str1 = "a";
//        String str2 = "ABCDABD";
        String str2 = "";

        int[] next = kmpNext_1(str2); //[0, 1, 2, 0]
//		int[] next = kmpNext("AABCAAAD");
        System.out.println("next=" + Arrays.toString(next));

        int index = kmpSearch_1(str1, str2, next);
        System.out.println("index=" + index); // 15��

    }

    //д�����ǵ�kmp�����㷨

    /**
     * @param str1 Դ�ַ���
     * @param str2 �Ӵ�
     * @param next ����ƥ���, ���Ӵ���Ӧ�Ĳ���ƥ���
     * @return �����-1����û��ƥ�䵽�����򷵻ص�һ��ƥ���λ��
     */
    public static int kmpSearch(String str1, String str2, int[] next) {

        //����
        for (int i = 0, j = 0; i < str1.length(); i++) {

            //��Ҫ���� str1.charAt(i) ��= str2.charAt(j), ȥ����j�Ĵ�С
            //KMP�㷨���ĵ�, ������֤...
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }

            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {//�ҵ��� // j = 3 i
                return i - j + 1;
            }
        }
        return -1;
    }

    public static int kmpSearch_1(String str1, String str2, int[] next) {
        for (int i = 0, j = 0; i < str1.length(); i++) {
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }

    public static int kmpSearch_2(String str1, String str2, int[] next) {
        for (int i = 0, j = 0; i < str1.length(); i++) {
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }

    public static int kmpSearch_3(String str1, String str2, int[] next) {
		for(int i=0,j=0;i<str1.length();i++){
			while (j>0 && str1.charAt(i)!=str2.charAt(j)){
				j=next[j-1];
			}
			if(str1.charAt(i)==str2.charAt(j)){
				j++;
			}
			if(j==str2.length()){
				return i-j+1;
			}
		}
		return -1;
    }

    public static int kmpSearch_4(String str1, String str2, int[] next) {
		for(int i=0,j=0;i<str1.length();i++){
			while (j>0 && str1.charAt(i)!=str2.charAt(j)){
				j=next[j-1];
			}
			if(str1.charAt(i)==str2.charAt(j)){
				j++;
			}
			if (j==str2.length()){
				return i-j+1;
			}
		}
		return -1;
	}

    public static int kmpSearch_5(String str1, String str2, int[] next) {
		for(int i=0,j=0;i<str1.length();i++){
			while (j>0 && str1.charAt(i)!=str2.charAt(j)){
				j=next[j-1];
			}
			if(str1.charAt(i)==str2.charAt(j)){
				j++;
			}
			if(j==str2.length()){
				return i-j+1;
			}
		}
		return -1;
    }

    public static int kmpSearch_6(String str1, String str2, int[] next) {
		for(int i=0,j=0;i<str1.length();i++){
			while (j>0 && str1.charAt(i)!=str2.charAt(j)){
				j=next[j-1];
			}
			if (str1.charAt(i)==str2.charAt(j)){
				j++;
			}
			if (j==str2.length()){
				return i-j+1;
			}
		}
		return -1;
    }

    //��ȡ��һ���ַ���(�Ӵ�) �Ĳ���ƥ��ֵ��
    public static int[] kmpNext(String dest) {
        //����һ��next ���鱣�沿��ƥ��ֵ
        int[] next = new int[dest.length()];
        next[0] = 0; //����ַ����ǳ���Ϊ1 ����ƥ��ֵ����0
        for (int i = 1, j = 0; i < dest.length(); i++) {
            //��dest.charAt(i) != dest.charAt(j) ��������Ҫ��next[j-1]��ȡ�µ�j
            //ֱ�����Ƿ��� ��  dest.charAt(i) == dest.charAt(j)�������˳�
            //��ʱkmp�㷨�ĺ��ĵ�
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            //��dest.charAt(i) == dest.charAt(j) ����ʱ������ƥ��ֵ����+1
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static int[] kmpNext_1(String dest) {
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static int[] kmpNext_2(String dest) {
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static int[] kmpNext_3(String dest) {
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static int[] kmpNext_4(String dest) {
        int next[] = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static int[] kmpNext_5(String dest) {
        int next[] = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static int[] kmpNext_6(String dest) {
        int next[] = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

}
