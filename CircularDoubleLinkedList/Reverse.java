class Reverse{
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
    public void reverse()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        Node cursor=head;
        while(cursor.next!=head)
        {
            cursor=cursor.next;
        }
        do{
            System.out.print(cursor.data+" ");
            cursor=cursor.prev;
        }while(cursor!=tail);
    }
    public static void main(String args[])
    {
        Reverse r=new Reverse();
        r.addf(25);
        r.addf(60);
        r.addf(80);
        r.addf(90);
        r.reverse();
    }
}