import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        int b=1;
        for(int i=1;i<=a;i++)
        {
            b=b*i;
        }
        System.out.println("The factorial of "+a+" is: "+b);
    }
}