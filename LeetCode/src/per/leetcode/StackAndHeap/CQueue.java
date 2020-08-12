package per.leetcode.StackAndHeap;

import java.util.Deque;
import java.util.LinkedList;

/**������ջʵ�ֶ���
 ������ջʵ��һ�����С����е��������£���ʵ�������������� appendTail �� deleteHead ��
 �ֱ�����ڶ���β�������������ڶ���ͷ��ɾ�������Ĺ��ܡ�(��������û��Ԫ�أ�deleteHead?�������� -1 )
 ʾ�� 1��
 ���룺
 ["CQueue","appendTail","deleteHead","deleteHead"]
 [[],[3],[],[]]
 �����[null,null,3,-1]
 ʾ�� 2��
 ���룺
 ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 [[],[],[5],[2],[],[]]
 �����[null,-1,null,null,5,2]
 ��ʾ��
 1 <= values <= 10000
 �����?appendTail��deleteHead ����?10000?�ε���
 */
class CQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    public CQueue() {
        stack1=new LinkedList<>();
        stack2=new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }else {
            int i=stack2.pop();
            return i;
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */