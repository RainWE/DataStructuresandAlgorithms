package per.leetcode.stack;

import java.util.Stack;

/**栈的最小值
 请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。
 执行push、pop和min操作的时间复杂度必须为O(1)。
 示例：
 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> 返回 -3.
 minStack.pop();
 minStack.top();      --> 返回 0.
 minStack.getMin();   --> 返回 -2.
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
