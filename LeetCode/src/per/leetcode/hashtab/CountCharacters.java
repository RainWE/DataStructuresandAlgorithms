package per.leetcode.hashtab;

import java.util.HashMap;
import java.util.Map;

/**拼写单词
 给你一份『词汇表』（字符串数组）?words?和一张『字母表』（字符串）?chars。
 假如你可以用?chars?中的『字母』（字符）拼写出 words?中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
 返回词汇表?words?中你掌握的所有单词的 长度之和。?
 示例 1：
 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 输出：6
 解释：
 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 示例 2：
 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 输出：10
 解释：
 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 提示：
 1 <= words.length <= 1000
 1 <= words[i].length, chars.length?<= 100
 所有字符串中都仅包含小写英文字母
 */
public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        int len=0;
        Map<Character,Integer> hashchars= new HashMap<>();
        for(char c:chars.toCharArray()){
            hashchars.put(c,hashchars.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> tmpMap;
        for(String word:words){
            boolean flag = true;
            tmpMap = new HashMap<>();
            for(char c:word.toCharArray()){
                int count =tmpMap.getOrDefault(c,0)+1;
                if(count>hashchars.getOrDefault(c,0)){
                    flag = false;
                    break;
                }
                tmpMap.put(c,count);
            }
            if(flag){
                len +=word.length();
            }
        }
        return len;
    }
    public int countCharacters_1(String[] words, String chars){
        int len=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char c:chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> wordsmap;
        for(String word:words){
            boolean flag=true;
            wordsmap = new HashMap<>();
            for(char c:word.toCharArray()){
                int count=wordsmap.getOrDefault(c,0)+1;
                if(count>map.getOrDefault(c,0)){
                    flag=false;
                    break;
                }
                wordsmap.put(c,count);
            }
            if(flag){
                len+=word.length();
            }
        }
        return len;
    }

}
