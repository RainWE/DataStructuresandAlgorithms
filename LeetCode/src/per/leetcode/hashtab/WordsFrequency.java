package per.leetcode.hashtab;

import java.util.HashMap;
import java.util.Map;

/**����Ƶ��
 ���һ���������ҳ�����ָ��������һ�����еĳ���Ƶ�ʡ�
 ���ʵ��Ӧ��֧�����²�����
 WordsFrequency(book)���캯��������Ϊ�ַ������鹹�ɵ�һ����
 get(word)��ѯָ�����������г��ֵ�Ƶ��
 ʾ����
 WordsFrequency wordsFrequency = new WordsFrequency({"i", "have", "an", "apple", "he", "have", "a", "pen"});
 wordsFrequency.get("you"); //����0��"you"û�г��ֹ�
 wordsFrequency.get("have"); //����2��"have"����2��
 wordsFrequency.get("an"); //����1
 wordsFrequency.get("apple"); //����1
 wordsFrequency.get("pen"); //����1
 ��ʾ��
 book[i]��ֻ����Сд��ĸ
 1 <= book.length <= 100000
 1 <= book[i].length <= 10
 get�����ĵ��ô������ᳬ��100000
 */
public class WordsFrequency {
    Map<String,Integer> map = new HashMap<>();
    public WordsFrequency(String[] book) {

        for (String s :book){
            map.put(s,map.getOrDefault(s,0)+1);
        }
    }

    public int get(String word) {
        if(map.get(word)!=null){
            return map.get(word);
        }
        return 0;
    }
}

/**
 * Your WordsFrequency object will be instantiated and called as such:
 * WordsFrequency obj = new WordsFrequency(book);
 * int param_1 = obj.get(word);
 */