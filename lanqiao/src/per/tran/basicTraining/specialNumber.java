package per.tran.basicTraining;

/**���������
 ��������
 ����153��һ���ǳ��������������������ÿλ���ֵ������ͣ���153=1*1*1+5*5*5+3*3*3���������������������������λʮ��������
 �����ʽ
 ��������С�����˳�����������������λʮ��������ÿ����ռһ�С�
 */
public class specialNumber {
    public static void main(String[] args) {
        int a,b,c;
        int sum;
        for (int i=100;i<1000;i++){
             a=i%10;
             b=i/10%10;
             c=i/100;
             sum=a*a*a+b*b*b+c*c*c;
             if (i==sum){
                 System.out.println(i);
             }
        }
    }
}
