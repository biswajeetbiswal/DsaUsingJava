class DeletionAtM
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
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        Node pointer=head;
        for(int i=0;i<1;i++)
        {
            pointer=pointer.next;
        }
        pointer.next.next.prev=pointer;
        pointer.next=pointer.next.next;
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
        DeletionAtM d=new DeletionAtM();
        d.insert(50);
        d.insert(40);
        d.insert(90);
        d.insert(60);
        d.print();
        d.delete();
        d.print();
    }
}