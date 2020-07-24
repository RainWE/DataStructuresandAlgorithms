package per.leetcode.search;

/**ϡ����������
 ϡ�������������и��ź�����ַ������飬����ɢ����һЩ���ַ�������дһ�ַ������ҳ������ַ�����λ�á�
 ʾ��1:
 ����: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
 �����-1
 ˵��: �����ڷ���-1��
 ʾ��2:
 ���룺words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
 �����4
 ��ʾ:
 words�ĳ�����[1, 1000000]֮��
 */
public class FindString {
    public int findString(String[] words, String s) {
        int left=0;
        int right =words.length-1;
        int mid;
        while (left<=right){
            while (words[left].length()==0){
                left++;
            }
            while (words[right].length()==0){
                right--;
            }
            mid=(left+right)/2;
            while (mid>=0 &&words[mid].length()==0 ){
                mid--;
            }
            if (words[mid].compareTo(s)==0){
                return mid;
            } else if (words[mid].compareTo(s)>0){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
    public int findString_1(String[] words, String s){
        int left=0;
        int right=words.length-1;
        int mid;
        while (left<=right){
            while (words[left].length()==0){
                left++;
            }
            while (words[right].length()==0){
                right--;
            }
            mid=(left+right)/2;
            while (mid>=0 && words[mid].length()==0){
                mid--;
            }
            if(words[mid].compareTo(s)==0){
                return mid;
            }else if (words[mid].compareTo(s)>0){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
}
