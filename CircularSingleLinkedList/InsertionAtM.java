class InsertionAtM
{
    class Node{
        int data;
        Node next;
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
        else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
    }
    public void addm(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else{
            Node cursor=head;
            for(int i=0;i<1;i++)
            {
                cursor=cursor.next;
            }
            newNode.next=cursor.next;
            cursor.next=newNode;
        }
    }
     public void print() {
        Node pointer = head;
        if (head == null) {
            System.out.println("The list is empty");

        } else {
            do {
                System.out.print(pointer.data + " ");
                pointer = pointer.next;
            } while (pointer != head);
        }
    }
    public static void main(String args[])
    {
        InsertionAtM i=new InsertionAtM();
        i.addf(90);
        i.addf(70);
        i.addf(80);
        i.addf(65);
        i.addm(15);
       
        i.print();
    }
}