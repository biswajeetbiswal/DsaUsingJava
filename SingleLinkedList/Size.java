class Size
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
    public void range()
    {
        System.out.println(size);
    }
    public static void main(String args[])
    {
        Size s=new Size();
        s.addf(50);
        s.addf(40);
        s.addf(70);
        s.addf(90);
        s.range();
    }
}