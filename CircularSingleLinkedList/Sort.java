class Sort{
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;
        int size=0;
    public void addf(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }
    public void sort()
    {
        for(int i=0;i<size-1;i++)
        {
            Node pointer=head;
            for(int j=0;j<size-i-1;j++)
            {
                if(pointer.data>pointer.next.data)
                {
                    int temp=pointer.data;
                    pointer.data=pointer.next.data;
                    pointer.next.data=temp;
                }
                pointer=pointer.next;
            }
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
        Sort s=new Sort();
        s.addf(90);
        s.addf(80);
        s.addf(70);
        s.addf(25);
        s.addf(10);
        s.sort();
        s.print();
    }

}