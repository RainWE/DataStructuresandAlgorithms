package per.tran.training;

import java.util.Scanner;

public class �ݹ���Ҷ���ʽϵ��ֵ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int res =recurs(n,k);
        System.out.println(res);
    }
    public static int recurs(int n,int k){
        if (k==0 || k==n){
            return 1;
        }
        return recurs(n-1,k)+recurs(n-1,k-1);
    }
}
