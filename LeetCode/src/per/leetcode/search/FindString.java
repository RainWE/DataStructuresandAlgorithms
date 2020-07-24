package per.leetcode.search;

/**稀疏数组搜索
 稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。
 示例1:
 输入: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
 输出：-1
 说明: 不存在返回-1。
 示例2:
 输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
 输出：4
 提示:
 words的长度在[1, 1000000]之间
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
