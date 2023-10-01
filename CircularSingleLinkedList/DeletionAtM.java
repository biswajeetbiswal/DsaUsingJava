class DeletionAtM
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
    public void delete()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
        }
        else if(head.next==head)
        {
            head=null;
            tail=null;
        }
        else{
            Node cursor=head;
            for(int i=0;i<1;i++)
            {
                cursor=cursor.next;
            }
            cursor.next=cursor.next.next;
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
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        DeletionAtM d=new DeletionAtM();
        d.addf(50);
        d.addf(40);
        d.addf(70);
        d.print();
        d.delete();
        d.print();
    }
}