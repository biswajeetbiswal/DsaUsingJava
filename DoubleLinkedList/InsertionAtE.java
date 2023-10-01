class InsertionAtE
{
    Node head;
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
    public void insertE( int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=null;
        Node cursor=head;
        while(cursor.next!=null)
        {
            cursor=cursor.next;
        }
        cursor.next=newNode;
        newNode.prev=cursor;
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
        InsertionAtE e=new InsertionAtE();
        e.insert(10);
        e.insert(20);
        e.insert(30);
        e.insert(45);
        e.print();
        e.insertE(50);
        e.insertE(90);
        e.insertE(70);
        e.print();
    }
}