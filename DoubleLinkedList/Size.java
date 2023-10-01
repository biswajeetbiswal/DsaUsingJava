class Size
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
    public void range()
    {
        System.out.println(size);
    }
    public static void main(String args[])
    {
        Size s=new Size();
        s.insert(50);
        s.insert(40);
        s.insert(70);
        s.insert(90);
        s.insert(94);
        s.range();
    }
}