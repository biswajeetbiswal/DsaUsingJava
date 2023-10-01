import java.util.*;
class Linear_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the you want to found");
        int t=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==t)
            {
                System.out.println("The element found on "+i+" index");
                break;
            }
        }
    }
}