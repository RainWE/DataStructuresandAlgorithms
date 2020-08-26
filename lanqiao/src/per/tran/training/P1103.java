package per.tran.training;

import java.util.Scanner;

public class P1103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String temp=sc.next();
        char fu=temp.charAt(0);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double n,m;
        if (fu=='+') {// (a+bi)+(c+di)=(a+c)+(b+d)i
            n=a+c;
            m=b+d;
        }
        else if (fu=='-') {//(a+bi)-(c+di)=(a-c)+(b-d)i
            n=a-c;
            m=b-d;
        }else if (fu=='*') {//(a+bi)(c+di)=(ac-bd)+(bc+ad)i
            n=a*c-b*d;
            m=a*d+b*c;
        }
        else{//(a+bi)/(c+di)=(ac+bd)/(c^2+d^2) +((bc-ad)/(c^2+d^2))i
            n=(a*c+b*d)/(c*c+d*d);
            m=(b*c-a*d)/(c*c+d*d);
        }
        System.out.printf("%.2f+%.2fi",n,m);
    }
}
