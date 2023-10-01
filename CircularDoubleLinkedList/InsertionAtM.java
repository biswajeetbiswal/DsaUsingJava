class InsertionAtM
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
    public void addm(int data)
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
            Node cursor=head;
            for(int i=0;i<1;i++)
            {
                cursor=cursor.next;
            }
            newNode.prev=cursor;
            newNode.next=cursor.next;
            newNode.next.prev=newNode;
            cursor.next=newNode;
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
        InsertionAtM i=new InsertionAtM();
        i.addf(100);
        i.addf(50);
        i.addf(800);
        i.addf(200);
        i.addm(90);
        i.print();
    }
}