package LinkedList;

//main class
public class CustomLinkedList {

    public static void main(String[] arg)
    {

        Node node=new Node(1,null);

        System.out.println(node.data);

        int[] arr={2,5,6,8,7};
        Node head=convertArrtoLL(arr);
        //System.out.println(head.data);

         head=DeleteHead(head);
        //System.out.println(head.data);


        head=DeleteTail(head);

        //irtrite througth ll
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.node;
        }
    }

    //convert array to linklist
    private static Node convertArrtoLL(int[] arr)
    {
        Node head =new Node(arr[0]);
        Node mover=head;

        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            mover.node=temp;
            mover=temp;
        }

        return head;
    }

    //method to delete the head
    private static Node DeleteHead(Node n)
    {
        if(n==null) return null;
        Node temp=n;
        Node newHead=n.node;
        n.node=null;

        //System.out.println(newHead.data);
        return newHead;

    }

    //method to delete the tail

    private static Node DeleteTail(Node n)
    {
        Node current=n;

        while(current.node.node!=null){

            current=current.node;
        }

        current.node=null;
        return n;
    }


}


//class for node dataStructure

class Node
{
  int data;
  Node node;

  //constructor
  Node(int data1,Node n)
  {
      this.data=data1;
      this.node=n;
  }

  Node(int data)
  {
      this.data=data;
  }


}


