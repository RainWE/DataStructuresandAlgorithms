package per.tran.basicTraining;

import java.util.Scanner;

/**ʮ������תʮ����
 ��������
 �����Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
 ����ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��
 ��������
 FFFF
 �������
 65535
 */
public class sixteentoten {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String hex_num = scanner.nextLine();
        long dec_num = Long.parseLong(hex_num, 16);
        System.out.println(dec_num);
    }
}
