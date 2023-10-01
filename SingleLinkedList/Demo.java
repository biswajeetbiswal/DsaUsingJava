import java.util.*;
class Demo
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
        newNode.next=head;
        head=newNode;
    }
    public void reverse()
    {
        Node prev=head;
        Node current=head.next;
        while(current!=null)
        {
            Node newNode=current.next;
            current.next=prev;
            prev=current;
            current=newNode;
        }
        head.next=null;
        head=prev;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            System.out.print(" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.addf(5);
        d.addf(6);
        d.addf(9);
        d.addf(10);
        d.print();
        d.reverse();
        d.print();
    }
}