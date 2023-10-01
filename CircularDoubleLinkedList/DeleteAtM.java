class DeleteAtM
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
    public void addf(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else
        {
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            head=newNode;
            tail.next=head;
        }
    }
    public void delete()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
        }
        else if(head.next==head)
        {
            head=null;
        }
      else if(head.next.next==head)
        {
            head=null;
        }
        else{
            Node cursor=head;
            for(int i=0;i<1;i++)
            {
                cursor=cursor.next;
            }
            cursor.next=tail;
            tail.prev=cursor;
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
        DeleteAtM d=new DeleteAtM();
        d.addf(80);
        d.addf(30);
        d.addf(20);
        d.addf(50);
        d.delete();
        d.print();
    }
}