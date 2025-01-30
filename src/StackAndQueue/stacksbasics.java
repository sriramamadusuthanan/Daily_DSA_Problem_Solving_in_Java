package StackAndQueue;

import java.util.Stack;

public class stacksbasics {

    public static void main(String[] args) {
        stacksbasics stack=new stacksbasics();
        stack.stackLib();
    }

    public void stackLib()
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.empty())
        {
            System.out.println(stack.pop());
        }
    }
}
