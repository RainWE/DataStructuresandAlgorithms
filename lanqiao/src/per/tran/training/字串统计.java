package per.tran.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 字串统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int l = 0;
        String s = "" ;
        if(scanner.hasNext()){  //输入数字l与字符串s
            l = scanner.nextInt() ;
            s = scanner.next() ;
        }
        Map<String,Integer> map = new HashMap<String,Integer>() ;   //使用map中key保存字符串 value保存字符串出现的次数
        int maxValue = 0 ;  //保存字符串的出现次数的最大值
        String maxStr = "" ;    //保存出现次数最多的字符串
        for(int i = 0 ; i < s.length() - l + 1 ; i ++){
            for(int j = i + l ; j < s.length() ; j ++){
                String str = s.substring(i,j) ; //枚举截取长度大于等于l的字符串
                if(map.containsKey(str)){   //若该字符串之前出现过则map(key,value)中value值+1
                    int value = map.get(str) ;
                    value ++ ;
                    if(value > maxValue){
                        maxValue = value ;
                        maxStr = str ;
                    }else if(value == maxValue){    //若该字符串出现的次数与当前出现次数最多的字符串相等，则比较两个字符串的长度，取字符串长的
                        if(maxStr.length() < str.length()){
                            maxStr = str ;
                        }
                    }
                    map.put(str, value) ;
                }else{  //若该字符串之前并未出现过则添加，并初始化value值为0
                    map.put(str, 0) ;
                }
            }
        }
        System.out.println(maxStr); //输出出现次数最多的字符串
    }

}
