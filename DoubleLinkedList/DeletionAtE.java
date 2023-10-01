class DeletionAtE
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
     public void delete()
    {
        Node pointer=head;
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        while(pointer.next.next!=null)
        {
            pointer=pointer.next;
        }    
        pointer.next=null;
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
        DeletionAtE d=new DeletionAtE();
        d.insert(50);
        d.insert(60);
        d.insert(80);
        d.insert(90);
        d.print();
        d.delete();
        d.print();
    }
}