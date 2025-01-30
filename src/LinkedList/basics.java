package LinkedList;


import java.util.LinkedList;

public class basics {

    public static void main(String[] arg)
    {
        LinkedList<Integer> list =new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);
        list.addLast(4);

        reverseLinkedList(list);
    }

    //single linledList
    static void sLinkedList()
    {
        LinkedList<String> list =new LinkedList<>();

        list.add("sri");
        list.add("ram");
        list.add("m");

        list.addFirst("name");
        list.addLast("end");

        //list.getFirst();
        //list.getLast();

//        for(String n: list)
//        {
//            System.out.println(n);
//        }


    }

    //head = [1,2,3,4,5] reverse using LinkedList

    static void reverseLinkedList(LinkedList<Integer> list)
    {
        var reverselist= new LinkedList<Integer>();

        for(int i=list.getLast();i>list.getFirst();i--)
        {
           System.out.println(list.get(i));
           reverselist.add(list.get(i));
        }
    }



}
