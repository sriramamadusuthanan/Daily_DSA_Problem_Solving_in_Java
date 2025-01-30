package LinkedList;

public class customLL {

    public static void main(String[] args) {

        LinkList linkList = new LinkList();
        linkList.append(1);
        linkList.append(2);
        linkList.append(3);
        linkList.append(4);

        linkList.Display();
        linkList.delete(2);
        System.out.println();
        linkList.Display();
    }


}

//creating a ListNode
class ListNode
{
    int val;
    ListNode next;

    //constructor
    public ListNode(int val,ListNode node)
    {
        this .val=val;
        this.next=node;
    }

    public ListNode(int val)
    {
        this .val=val;

    }

    public ListNode()
    {

    }
}

class LinkList
{
    private ListNode head;

    //to add node to LinkList
    public void append(int data)
    {
        ListNode node = new ListNode(data);
        if(head==null)
        {
            head=node;
            return ;
        }
        ListNode current = head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=node;
        return ;

    }

    //to display LinkList
    public void Display()
    {
        if(head==null)
        {
            System.out.println("the LinkList is emplty");
            return ;
        }
        ListNode current = head;
        while(current!=null)
        {
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.print("null");
    }

    //delete a node
    public void delete(int data)
    {
        if(head.val==data)
        {
            head=head.next;
            return;
        }

        ListNode pre=head;
        ListNode temp=head.next;
        while(temp!=null)
        {
            if(temp.val==data)
            {
                pre.next=temp.next;
                return;
            }
            pre=pre.next;
            temp=temp.next;
        }

    }



}


