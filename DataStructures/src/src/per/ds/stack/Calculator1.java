package src.per.ds.stack;

public class Calculator1 {

    public static void main(String[] args) {
        String expression = "7*2*2-5+1-5+3-4"; // 15//��δ����λ�������⣿5-6*2-10  7*2*2-5+1-5+3-4
        ArrayStack3 numStack = new ArrayStack3(10);
        ArrayStack3 operStack = new ArrayStack3(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";
        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);
            if (operStack.isOper(ch)) {//����������
                if (!operStack.isEmpty()) {
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        numStack.push(res);
                        operStack.push(ch);
                    } else {
                        operStack.push(ch);
                    }
                } else {
                    operStack.push(ch); // 1 + 3
                }
            } else {
                keepNum += ch;
                if (index == expression.length() - 1) {
                    numStack.push(Integer.parseInt(keepNum));
                } else {
                    if (operStack.isOper(expression.substring(index + 1, index + 2).charAt(0))) {
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
            }
            index++;
            if (index >= expression.length()) {
                break;
            }
        }
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);//��ջ
        }
        int res2 = numStack.pop();
        System.out.printf("���ʽ %s = %d", expression, res2);
    }

}

//�ȴ���һ��ջ,ֱ��ʹ��ǰ�洴����
//����һ�� ArrayStack2 ��ʾջ, ��Ҫ��չ����
class ArrayStack3 {
    private int maxSize; // ջ�Ĵ�С
    private int[] stack; // ���飬����ģ��ջ�����ݾͷ��ڸ�����
    private int top = -1;// top��ʾջ������ʼ��Ϊ-1

    //������
    public ArrayStack3(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    //����һ�����������Է��ص�ǰջ����ֵ, ���ǲ���������pop
    public int peek() {
        return stack[top];
    }

    //ջ��
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //ջ��
    public boolean isEmpty() {
        return top == -1;
    }

    //��ջ-push
    public void push(int value) {
        //���ж�ջ�Ƿ���
        if (isFull()) {
            System.out.println("ջ��");
            return;
        }
        top++;
        stack[top] = value;
    }

    //��ջ-pop, ��ջ�������ݷ���
    public int pop() {
        //���ж�ջ�Ƿ��
        if (isEmpty()) {
            //�׳��쳣
            throw new RuntimeException("ջ�գ�û������~");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //��ʾջ�����[����ջ]�� ����ʱ����Ҫ��ջ����ʼ��ʾ����
    public void list() {
        if (isEmpty()) {
            System.out.println("ջ�գ�û������~~");
            return;
        }
        //��Ҫ��ջ����ʼ��ʾ����
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    //��������������ȼ������ȼ��ǳ���Ա��ȷ��, ���ȼ�ʹ�����ֱ�ʾ
    //����Խ�������ȼ���Խ��.
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    //�ж��ǲ���һ�������
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/' ;
    }

    //���㷽��
    public int cal(int num1, int num2, int oper) {
        int res =0;// res ���ڴ�ż���Ľ��
		switch (oper){
			case '+':
				res = num1 + num2;
				break;
			case '-':
				res = num2 - num1;
				break;
			case '*':
				res = num1 * num2;
				break;
			case '/':
				res = num2 / num1;
				break;
			default:
				break;
		}
        return res;
    }

}
