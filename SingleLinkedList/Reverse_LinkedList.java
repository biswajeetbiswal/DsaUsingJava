class Reverse_LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addf(int data)
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
    public void reverse()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public void print()
    {
        Node pointer =head;
        while(pointer!=null)
        {
            System.out.print(pointer.data+" ->");
            pointer=pointer.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        Reverse_LinkedList r=new Reverse_LinkedList();
        r.addf(50);
        r.addf(40);
        r.addf(65);
        r.addf(90);
        r.print();
        r.reverse();
        r.print();
    }
}