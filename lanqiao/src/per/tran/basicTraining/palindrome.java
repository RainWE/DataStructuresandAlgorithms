package per.tran.basicTraining;

/**������
 ��������
 ����1221��һ���ǳ����������������߶��ʹ��ұ߶���һ���ģ������������������λʮ��������
 �����ʽ
 ��������С�����˳�����������������λʮ��������
 */
public class palindrome {
    public static void main(String[] args) {
        for (int i=1000;i<10000;i++){
            String str =i+"";
            if (str.charAt(0)==str.charAt(3)){
                if (str.charAt(1)==str.charAt(2)){
                    System.out.println(i);
                }
            }
        }
    }
}
