package per.leetcode.hashtab;

import java.util.HashMap;
import java.util.Map;

/**ƴд����
 ����һ�ݡ��ʻ�����ַ������飩?words?��һ�š���ĸ�����ַ�����?chars��
 �����������?chars?�еġ���ĸ�����ַ���ƴд�� words?�е�ĳ�������ʡ����ַ���������ô���Ǿ���Ϊ��������������ʡ�
 ע�⣺ÿ��ƴд��ָƴд�ʻ���е�һ�����ʣ�ʱ��chars �е�ÿ����ĸ��ֻ����һ�Ρ�
 ���شʻ��?words?�������յ����е��ʵ� ����֮�͡�?
 ʾ�� 1��
 ���룺words = ["cat","bt","hat","tree"], chars = "atach"
 �����6
 ���ͣ�
 �����γ��ַ��� "cat" �� "hat"�����Դ��� 3 + 3 = 6��
 ʾ�� 2��
 ���룺words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 �����10
 ���ͣ�
 �����γ��ַ��� "hello" �� "world"�����Դ��� 5 + 5 = 10��
 ��ʾ��
 1 <= words.length <= 1000
 1 <= words[i].length, chars.length?<= 100
 �����ַ����ж�������СдӢ����ĸ
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
