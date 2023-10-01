class Sort{
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
    int size=0;
    public void addf(int data)
    {
        size++;
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
    public void sort()
    {
        for(int i=0;i<size-1;i++)
        {
            Node cursor=head;
            for(int j=0;j<size-1-i;j++)
            {
                if(cursor.data>cursor.next.data)
                {
                    int temp=cursor.data;
                    cursor.data=cursor.next.data;
                    cursor.next.data=temp;
                }
                cursor=cursor.next;
            }
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
        Sort s=new Sort();
        s.addf(25);
        s.addf(50);
        s.addf(10);
        s.addf(4);
        s.addf(1);
        s.sort();
        s.print();
    }
}