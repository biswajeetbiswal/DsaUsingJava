class InsertionAtE {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    public void adde(int data)
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
            tail.next=newNode;
            tail=newNode;
            newNode.next=head;
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
        InsertionAtE i=new InsertionAtE();
        i.adde(25);
        i.adde(50);
        i.adde(60);
        i.adde(80);
        i.print();
    }
}
