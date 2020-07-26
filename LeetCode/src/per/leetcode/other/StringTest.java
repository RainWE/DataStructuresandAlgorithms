package per.leetcode.other;

import java.util.ArrayList;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        List<StringBuilder> listber = new ArrayList<>();

        listber.add(new StringBuilder("1"));
        System.out.println(listber.get(0));
        StringBuilder stber=listber.get(0);
        stber.append("2");
        System.out.println(listber.get(0));



        System.out.println("--------------");
        StringBuffer stringBuffer = new StringBuffer();
        List<StringBuffer> listbf= new ArrayList<>();
        listbf.add(new StringBuffer("a"));
        System.out.println(listbf.get(0));
        StringBuffer stbf=listbf.get(0);
        stbf.append("b");
        System.out.println(listbf.get(0));

    }
}
