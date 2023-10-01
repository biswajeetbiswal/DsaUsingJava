class Reverse
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
    public void reverse()
    {
        if(head==null)
        {
             System.out.println("The list is empty");
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
         while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.prev;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        Reverse r=new Reverse();
        r.insert(50);
        r.insert(40);
        r.insert(60);
        r.insert(80);
        r.insert(70);
        r.print();
        r.reverse();
    }
}