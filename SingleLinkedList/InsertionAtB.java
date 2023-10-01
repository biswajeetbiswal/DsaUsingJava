class InsertionAtB
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
    public void addFirst(String data)
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
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        InsertionAtB ab=new InsertionAtB();
        ab.addFirst("a");
        ab.addFirst("is");
        ab.addFirst("list");
        ab.print();
    }
}