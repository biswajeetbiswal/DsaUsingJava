class Demo
{
    int arr[]=new int[10];
    int top=-1;
    void push(int data)
    {
        if(top>=(10-1))
        {
            System.out.println("Stack is full");
        }
        else
        {
            arr[++top]=data;
        }
    }
    void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
        }
        else{
            top--;
        }
    }
    void peek()
    {
        if(top<0){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("Peek element is: "+arr[top]);
        }
    }
    void print()
    {
        for(int i=top;i>-1;i--)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
class SPush
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.push(10);
        d.push(20);
        d.push(30);
        d.push(40);
        d.push(60);
        d.push(50);
        d.push(80);
        d.push(90);
        d.push(40);
        d.push(65);
        d.print();
        d.push(20);
        d.print();
        d.pop();
        d.pop();
        d.pop();
        d.push(100);
        d.print();
        d.peek();
        d.pop();
        d.pop();
        d.print();
        d.pop();
        d.pop();
        d.peek();
    }
}