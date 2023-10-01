class InsertionAtE
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
    public void addl(String data) 
    {
        
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
       // newNode.next=null;
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
        InsertionAtE ie=new InsertionAtE();
       ie.addf("a");
        ie.addf("is");
        ie.addf("It");
        ie.print();
        ie.addl("linked list");
        ie.print();
    }
}