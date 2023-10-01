class InsertionAtB
{
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
    Node head=null;
    Node tail=null;
    public void addf(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else
        {
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            head=newNode;
            tail.next=head;
        }
    }
    public void print()
    {
        Node pointer=head;
        if(head==null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            do
            {
             System.out.print(pointer.data+" ");
             pointer=pointer.next;
            }while(pointer!=head);
            System.out.println();
        }
    }
    public static void main(String arsg[])
    {
        InsertionAtB b=new InsertionAtB();
        b.addf(40);
        b.addf(20);
        b.addf(30);
        b.print();
    }
}