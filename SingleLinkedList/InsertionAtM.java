class InsertionAtM
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
    public void middle(String data)
    {
        Node newNode=new Node(data);
        Node current=head;
        if(head==null)
        {
            head=newNode;
            return;
        }
        for(int i=0;i<1 ;i++)
        {
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public void print()
    {
        Node current=head;
        while(current!=null)
        { 
            System.out.print(current.data +"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        InsertionAtM m=new InsertionAtM();
       /* m.addf("36");
        m.addf("56");
        m.addf("200");
        m.addf("90");
        m.print();*/
        m.middle("1000");
        m.print();
    }
}