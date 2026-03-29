
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int n = input.nextInt();
        for (int i = 100; i <= 999; i++) { // we are checking for 3-digit numbers because Armstrong numbers are typically defined for 3-digit numbers, where the sum of the cubes of the digits equals the number itself.git 
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit; // for 3-digit numbers, we cube the digits
            n /= 10;
        }
        return sum == original;
    }



    
}
