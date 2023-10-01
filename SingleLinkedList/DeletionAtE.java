class DeletionAtE
{
    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addf(String data)
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
    public void delete()
    {
        Node present=head;
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
        while(present.next.next!=null)
        {
            present=present.next;
        }
        present.next=null;
    }
    public static void main(String args[])
    {
        DeletionAtE d=new DeletionAtE();
        d.addf("linked list");
        d.addf("a");
        d.addf("is");
        d.addf("This");
        d.print();
        d.delete();
        d.print();
        d.delete();
        d.print();
        d.delete();
        d.print();
        d.delete();
        d.print();
        d.delete();
    }
}