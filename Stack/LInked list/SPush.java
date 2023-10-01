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
    void push(int x)
    {
        Node newNode=new Node(x);
        if(head==null)
        {
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
     void peek()
    {
       if(head==null)
       {
        System.out.println("Stack underflow");
       }
       else{
        System.out.println("The top most element is: "+head.data);
       }
    }
    void pop()
    {
        if(head==null)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            head=head.next;
        }
    }
    void size()
    {
        int Size=0;
        Node pointer =head;
        while(pointer!=null)
        {
            Size++;
            pointer=pointer.next;
        }
        System.out.println("The size of the stack is: "+Size);
    }
   
    void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
class SPush
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.push(50);
        d.push(60);
        d.push(70);
        d.push(80);
        d.push(90);
        d.print();
        d.pop();
        d.pop();
        d.print();
        d.pop();
        d.pop();
        d.pop();
        d.pop();
        d.push(32);
        d.push(20);
        d.push(15);
        d.push(42);
        d.print();
        d.peek();
        d.pop();
        d.peek();
        d.size();

    }
}