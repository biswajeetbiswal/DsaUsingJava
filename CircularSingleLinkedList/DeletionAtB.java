class DeletionAtB
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
    public void deletef()
    {
        if(head==null)
        {
            System.out.println("The List is empty");
        }
        else if(head.next==head)
        {
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            tail.next=head;
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
    public static void main(String arsg[])
    {
        DeletionAtB d=new DeletionAtB();
        d.addf(55);
        d.addf(90);
        d.addf(70);
        d.addf(50);
        d.deletef();
        d.print();
    }
}