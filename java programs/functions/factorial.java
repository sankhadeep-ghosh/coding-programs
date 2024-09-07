import java.util.*;

class Factorial {
    public static void factorial(int a) {
        if (a < 0) {
            System.out.println("Invalid input: Factorial is not defined for negative numbers");
            return;
        }
        
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact *= i;
        }
        
        System.out.println("The factorial of " + a + " is: " + fact);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        factorial(a);
    }
}
