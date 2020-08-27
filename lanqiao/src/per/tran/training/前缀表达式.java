package per.tran.training;

import java.util.Scanner;

public class 前缀表达式 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int b=in.nextInt();
        int c=in.nextInt();
        switch(a){
            case "+":
                System.out.println(b+c);
                break;
            case "-":
                System.out.println(b-c);
                break;
            case "*":
                System.out.println(b*c);
                break;
            case "/":
                System.out.println(b/c);
                break;
        }
    }
}
