package per.tran.basicTraining;

import java.util.Scanner;

/**
 * ʮ������ת�˽���
 * ��������
 * ��������n��ʮ��������������������Ƕ�Ӧ�İ˽�������
 * �����ʽ
 * ��������ĵ�һ��Ϊһ��������n ��1<=n<=10����
 * ����������n�У�ÿ��һ����0~9����д��ĸA~F��ɵ��ַ�������ʾҪת����ʮ��������������ÿ��ʮ�����������Ȳ�����100000��
 * �����ʽ
 * �������n�У�ÿ��Ϊ�����Ӧ�İ˽�����������
 * ������ע�⡿
 * ���������ʮ��������������ǰ��0������012A��
 * ��������İ˽�����Ҳ������ǰ��0��
 * ��������
 * ����2
 * ����39
 * ����123ABC
 * �������
 * ����71
 * ����4435274
 * ��������ʾ��
 * �����Ƚ�ʮ��������ת����ĳ������������ĳ������ת���ɰ˽��ơ�
 */
public class sixteentoeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] result = new String[11];//�����������Ľ��
        /*ʮ������ת��Ϊ������*/
        for (int i = 0; i < n; i++) {
            String h = in.next();
            StringBuilder tempB = new StringBuilder();
            for (int m = 0; m < h.length(); m++) {
                char numH = h.charAt(m);
                String b = Integer.toBinaryString(Integer.valueOf(String.valueOf(numH), 16));

                for (int k = b.length(); k < 4; k++) {
                    b = '0' + b;
                }

                tempB.append(b);
            }
            /*������ת��Ϊ�˽���*/
            StringBuilder tempO = new StringBuilder();//���ȱ�Ϊ3�ı�������Ҫ����ǰ��0�ĸ���
            int addZero = 3 - tempB.length() % 3;
            for (int p = 0; p < addZero; p++) {
                tempB = new StringBuilder("0").append(tempB);
            }
            for (int m = 0; m < tempB.length(); m += 3) {
                //���ַ�������ת��Ϊ���ı������ǰ��0
                String numB = tempB.substring(m, m + 3);
                String o = Integer.toOctalString(Integer.valueOf(String.valueOf(numB), 2));
                tempO.append(o);
            }
            result[i] = tempO.toString().replaceAll("^(0+)", "");//��������ʽȥ��ǰ����
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
