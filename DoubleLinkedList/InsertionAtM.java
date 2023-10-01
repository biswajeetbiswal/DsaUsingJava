class InsertionAtM
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
    public void insert(int data)
    {
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
    public void middle(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node current=head;
        for(int i=0;i<1;i++)
        {
            current=current.next;
        }
        current.next.prev=newNode;
        newNode.next=current.next;
        current.next=newNode;
        newNode.prev=current;
    }
    public void print()
    {
        Node present=head;
        while(present!=null)
        {
            System.out.print(present.data+"->");
            present=present.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        InsertionAtM m=new InsertionAtM();
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.insert(50);
        m.print();
        m.middle(80);
        m.print();
    }
}