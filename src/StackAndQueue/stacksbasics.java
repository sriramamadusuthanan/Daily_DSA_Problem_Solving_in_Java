package StackAndQueue;

import java.util.*;

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
            //pop will return a generic type we mentioned while creating
            //internally stack is a array
            //stack is a class
            System.out.println(stack.pop());
        }
        System.out.println("____________queue____________");
        //queue
        //is a interface
        Queue<Integer> queue= new LinkedList<>();
        //if we create new Queue then we need to add all the abstract method of the
        //queue interface like to add or to remove...
        //internally it uses ll

        queue.add(9);
        queue.add(5);
        queue.add(8);
        queue.add(10);

        //peek is like a head ok ll
        //it just returns /gets the first most element
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        //simply removes the first element
        System.out.println("__________Dqueue_______");

        //we can add and remove from both sides
        Deque<Integer> deque=new ArrayDeque<>();
        //arrayDeque is class which is simple a resiziable array
        //no cabacity restriction
        //basicily faster than stacks
        //null element are not allowed
        //not thread safe
        deque.add(2);
        deque.addLast(56);
        deque.addFirst(25);
        deque.removeFirst();
        //etc...

    }
}
