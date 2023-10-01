class Addition
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
    public void addf(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    int x=0;
    public void add()
    {
        Node pointer=head;
        while(pointer!=null)
        {
            x+=pointer.data;
            pointer=pointer.next;
        }
        System.out.println("Sum of element in Linked list is:"+x);
    }
    public static void main(String args[])
    {
        Addition a=new Addition();
        a.addf(50);
        a.addf(60);
        a.addf(90);
        a.addf(85);
        a.add();
    }
}