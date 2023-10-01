import java.util.*;
class AddElementAtButtom
{
    public static void atButtom(int data,Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        atButtom(data,s);
        s.push(top);
    }
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        atButtom(4,s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}