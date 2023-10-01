class Sort
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    int size=0;
    public void addf(int data)
    {
        size++;
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
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
        Node pointer =head;
        while(pointer!=null)
        {
            System.out.print(pointer.data+"->");
            pointer=pointer.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        Sort s=new Sort();
        s.addf(50);
        s.addf(30);
        s.addf(40);
        s.addf(85);
        s.addf(10);
        s.addf(100);
        s.addf(20);
        s.sort();
        s.print();
        s.addf(70);
        s.addf(101);
        s.sort();
        s.print();
    }
}