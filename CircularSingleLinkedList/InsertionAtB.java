class InsertionAtB {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void addf(int data) {
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

    public static void main(String args[]) {
        InsertionAtB i = new InsertionAtB();
        i.addf(12);
        i.addf(25);
        i.addf(30);
        i.addf(58);
        i.print();
    }
}