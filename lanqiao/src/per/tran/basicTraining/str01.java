package per.tran.basicTraining;

/** 01�ִ�
 ��������
 ���ڳ���Ϊ5λ��һ��01����ÿһλ��������0��1��һ����32�ֿ��ܡ����ǵ�ǰ�����ǣ�
 00000
 00001
 00010
 00011
 00100
 �밴��С�����˳�������32��01����
 �����ʽ
 ������û�����롣
 �����ʽ
 ���32�У�����С�����˳��ÿ��һ������Ϊ5��01����
 �������
 00000
 00001
 00010
 00011
 <���²���ʡ��>
 */
public class str01 {
    public static void main(String[] args) {
        int i,j,k,l,m;
        for(i=0;i<2;i++)                       //5��ѭ�����ƴ�С�������
            for(j=0;j<2;j++)
                for(k=0;k<2;k++)
                    for(l=0;l<2;l++)
                        for(m=0;m<2;m++)
                            System.out.printf("%d%d%d%d%d\n",i,j,k,l,m);
    }
    public void aa(){
        String[] n = new String[5];
        for (int i = 0; i < 32; i++) {
            int ii = i;
            for (int j = 0; j < 5; j++) {
                n[j]=ii%2+"";
                ii = ii / 2;
            }
            System.out.println(n[4]+n[3]+n[2]+n[1]+n[0]);
        }
    }
}
