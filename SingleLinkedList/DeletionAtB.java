class DeletionAtB
{
    Node head;
    class Node{
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
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
    }
    public static void main(String args[])
    {
        DeletionAtB d=new DeletionAtB();
        d.addf("linked list");
        d.addf("a");
        d.addf("is");
        d.addf("this");
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