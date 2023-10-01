class Sort
{
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    int size=0;
    public void insert(int data)
    {
        size++;
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        newNode.prev=null;
        if(head!=null)
        {
            head.prev=newNode;
        }
        head=newNode;
    }
     public void sort()
    {
        for(int i=0;i<size-1;i++)
        {
            Node pointer=head;
            for(int j=0;j<size-i-1;j++)
            {
                if(pointer.data>pointer.next.data)
                {
                    int temp=pointer.data;
                    pointer.data=pointer.next.data;
                    pointer.next.data=temp;
                }
                pointer=pointer.next;
            }
        }
    }
      public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        Sort s=new Sort();
       s.insert(50);
        s.insert(80);
        s.insert(45);
        s.insert(70);
        s.insert(95);
        s.insert(35);
        s.sort();
        s.print();
    }
}