import java.util.*;
class Solutions {
    private static int positive = 0; 
    private static int negative = 0; 
    private static int zeros = 0; 
    public static void random()
    {
        Scanner sc = new Scanner(System.in);
        int input = 1;
        while(input == 1) {
           System.out.println("Enter your number : ");
           int number = sc.nextInt();
           if(number > 0) {
               positive++;
           } else if(number < 0) {
               negative++;
           } else {
               zeros++;
           }
        System.out.println("Press 1 to continue & 0 to stop");
           input = sc.nextInt();
           
    }}
    public static void main(String args[]) {
       System.out.println("Press 1 to continue & 0 to stop");
       Scanner sc = new Scanner(System.in);
       int start = sc.nextInt();
       if(start == 1)
       {
           random();
           System.out.println("Positives : "+ positive);
           System.out.println("Negatives : "+ negative);
           System.out.println("Zeros : "+ zeros);
       }
       else
           System.out.println("Exiting program");
       sc.close();
   }   
}
