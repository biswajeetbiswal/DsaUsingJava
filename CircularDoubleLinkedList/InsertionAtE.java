class InsertionAtE
{
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    public void adde(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;
            newNode.next=head;
            tail=newNode;
            head.prev=tail;
        }
    }
     public void print()
    {
        Node pointer=head;
        if(head==null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            do
            {
             System.out.print(pointer.data+" ");
             pointer=pointer.next;
            }while(pointer!=head);
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        InsertionAtE i=new InsertionAtE();
        i.adde(30);
        i.adde(50);
        i.adde(25);
        i.print();
    }
}