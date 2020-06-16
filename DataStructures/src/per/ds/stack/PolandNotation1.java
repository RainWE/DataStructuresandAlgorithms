package per.ds.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation1 {

    public static void main(String[] args) {


        //��ɽ�һ����׺���ʽת�ɺ�׺���ʽ�Ĺ���
        //˵��
        //1. 1+((2+3)��4)-5 => ת��  1 2 3 + 4 �� + 5 �C
        //2. ��Ϊֱ�Ӷ�str ���в����������㣬��� �Ƚ�  "1+((2+3)��4)-5" =�� ��׺�ı��ʽ��Ӧ��List
        //   �� "1+((2+3)��4)-5" => ArrayList [1,+,(,(,2,+,3,),*,4,),-,5]
        //3. ���õ�����׺���ʽ��Ӧ��List => ��׺���ʽ��Ӧ��List
        //   �� ArrayList [1,+,(,(,2,+,3,),*,4,),-,5]  =�� ArrayList [1,2,3,+,4,*,+,5,�C]

//        String expression = "1+((2+3)*4)-5";//ע����ʽ
//        List<String> infixExpressionList = toInfixExpressionList(expression);
//        System.out.println("��׺���ʽ��Ӧ��List=" + infixExpressionList); // ArrayList [1,+,(,(,2,+,3,),*,4,),-,5]
//        List<String> suffixExpreesionList = parseSuffixExpreesionList(infixExpressionList);
//        System.out.println("��׺���ʽ��Ӧ��List" + suffixExpreesionList); //ArrayList [1,2,3,+,4,*,+,5,�C]
//
//        System.out.printf("expression=%d", calculate(suffixExpreesionList)); // ?
		
		
		

		//�ȶ�����沨�����ʽ
		//(30+4)��5-6  => 30 4 + 5 �� 6 - => 164
		// 4 * 5 - 8 + 60 + 8 / 2 => 4 5 * 8 - 60 + 8 2 / + 
		//���� 
		//˵��Ϊ�˷��㣬�沨�����ʽ �����ֺͷ���ʹ�ÿո����
		//String suffixExpression = "30 4 + 5 * 6 -";
		String suffixExpression = "4 5 * 8 - 60 + 8 2 / +"; // 76
		//˼·
		//1. �Ƚ� "3 4 + 5 �� 6 - " => �ŵ�ArrayList��
		//2. �� ArrayList ���ݸ�һ������������ ArrayList ���ջ ��ɼ���
		
		List<String> list = getListString(suffixExpression);
		System.out.println("rpnList=" + list);
		int res = calculate(list);
		System.out.println("����Ľ����=" + res);
		
    }


    //�� ArrayList [1,+,(,(,2,+,3,),*,4,),-,5]  =�� ArrayList [1,2,3,+,4,*,+,5,�C]
    //���������õ�����׺���ʽ��Ӧ��List => ��׺���ʽ��Ӧ��List
    public static List<String> parseSuffixExpreesionList(List<String> ls) {

        return null;
    }

    //�������� ��׺���ʽת�ɶ�Ӧ��List
    //  s="1+((2+3)��4)-5";
    public static List<String> toInfixExpressionList(String s) {
        return null;
    }

    //��һ���沨�����ʽ�� ���ν����ݺ������ ���뵽 ArrayList��
    public static List<String> getListString(String suffixExpression) {
        String[] str = suffixExpression.split(" ");
        List<String> list = new ArrayList<>();
        for (String s : str) {
            list.add(s);
        }
        return list;
    }

    //��ɶ��沨�����ʽ������
	/*
	 * 1)��������ɨ�裬��3��4ѹ���ջ��
		2)����+���������˵���4��3��4Ϊջ��Ԫ�أ�3Ϊ�ζ�Ԫ�أ��������3+4��ֵ����7���ٽ�7��ջ��
		3)��5��ջ��
		4)�������ǡ����������˵���5��7�������7��5=35����35��ջ��
		5)��6��ջ��
		6)�����-������������35-6��ֵ����29���ɴ˵ó����ս��
	 */

    public static int calculate(List<String> ls) {
        Stack<String> stack = new Stack<>();
        for (String s : ls) {
            if (s.matches("\\d+")) {//ƥ���λ����������ʽ
                stack.push(s);
            } else {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (s.equals("+")) {
                    res = num1 + num2;
                } else if (s.equals("-")) {
                    res = num1 - num2;
                } else if (s.equals("*")) {
                    res = num1 * num2;
                } else if (s.equals("/")) {
                    res = num1 / num2;
                }else {
                	throw new RuntimeException("�����д�");
				}
                stack.push(""+res);
            }
        }
        return Integer.parseInt(stack.pop());
    }

}

//��дһ���� Operation ���Է���һ������� ��Ӧ�����ȼ�
class Operation1 {
    private static int ADD = 1;
    private static int SUB = 1;
    private static int MUL = 2;
    private static int DIV = 2;

    //дһ�����������ض�Ӧ�����ȼ�����
    public static int getValue(String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case "*":
                result = MUL;
                break;
            case "/":
                result = DIV;
                break;
            default:
                System.out.println("�����ڸ������" + operation);
                break;
        }
        return result;
    }

}
