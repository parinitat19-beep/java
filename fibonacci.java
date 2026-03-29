import java.util.Scanner;

public class fibonacci {
    public static void main(Stringfun[] args) {
     Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0, b = 1;
        int count = 2 ; // We already have the first two Fibonacci numbers
        while (count <=n) {
            int temp = b;
            b = a + b; // Calculate the next Fibonacci number
            a = temp; // Update a to the previous Fibonacci number
            count++;
        }
            //System.out.print(a + " "); // Print the current Fibonacci number followed by a space
            System.out.print(b); // Print the current Fibonacci number followed by a space        
        input.close();
    }
}

        
        
    

