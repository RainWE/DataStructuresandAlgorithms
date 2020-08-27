package per.tran.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramsŒ Ã‚ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.length()!=s2.length()){
            System.out.println("N");
        }
        Map<Character,Integer> map = new HashMap<>();
        for (char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        boolean flag = true;
        for (char c:s2.toCharArray()){
            if (map.containsKey(c)){
                if (map.get(c)>0){
                    map.put(c,map.get(c)-1);
                }else {
                    System.out.println("N");
                    flag=false;
                    break;
                }
            }else {
                System.out.println("N");
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("Y");
        }
    }
}
