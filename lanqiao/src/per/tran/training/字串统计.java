package per.tran.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class �ִ�ͳ�� {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int l = 0;
        String s = "" ;
        if(scanner.hasNext()){  //��������l���ַ���s
            l = scanner.nextInt() ;
            s = scanner.next() ;
        }
        Map<String,Integer> map = new HashMap<String,Integer>() ;   //ʹ��map��key�����ַ��� value�����ַ������ֵĴ���
        int maxValue = 0 ;  //�����ַ����ĳ��ִ��������ֵ
        String maxStr = "" ;    //������ִ��������ַ���
        for(int i = 0 ; i < s.length() - l + 1 ; i ++){
            for(int j = i + l ; j < s.length() ; j ++){
                String str = s.substring(i,j) ; //ö�ٽ�ȡ���ȴ��ڵ���l���ַ���
                if(map.containsKey(str)){   //�����ַ���֮ǰ���ֹ���map(key,value)��valueֵ+1
                    int value = map.get(str) ;
                    value ++ ;
                    if(value > maxValue){
                        maxValue = value ;
                        maxStr = str ;
                    }else if(value == maxValue){    //�����ַ������ֵĴ����뵱ǰ���ִ��������ַ�����ȣ���Ƚ������ַ����ĳ��ȣ�ȡ�ַ�������
                        if(maxStr.length() < str.length()){
                            maxStr = str ;
                        }
                    }
                    map.put(str, value) ;
                }else{  //�����ַ���֮ǰ��δ���ֹ�����ӣ�����ʼ��valueֵΪ0
                    map.put(str, 0) ;
                }
            }
        }
        System.out.println(maxStr); //������ִ��������ַ���
    }

}
