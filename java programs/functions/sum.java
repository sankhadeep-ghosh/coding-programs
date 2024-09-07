import java.util.*;
public class sum 
{
    public static int add(int num1, int num2) 
    {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Next number: ");
        int num2 = sc.nextInt();
        int sum = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
