package per.leetcode.stack;

import java.util.Stack;

/**ջ����Сֵ
 �����һ��ջ�����˳���ջ֧�ֵ�pop��push�������⣬��֧��min�������ú�������ջԪ���е���Сֵ��
 ִ��push��pop��min������ʱ�临�Ӷȱ���ΪO(1)��
 ʾ����
 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> ���� -3.
 minStack.pop();
 minStack.top();      --> ���� 0.
 minStack.getMin();   --> ���� -2.
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;
    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minstack.size()<=0){
            minstack.push(x);
        }else {
            if (minstack.peek()<x){
                minstack.push(minstack.peek());
            }else {
                minstack.push(x);
            }
        }
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return minstack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
