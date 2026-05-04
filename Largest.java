import java.util.Scanner;

public class Largest {
    public static void main(Stringfun[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max=a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
        input.close();
    }
}


// int max = Math.max(c, Math.max(a, b)); // This line uses the Math.max method to find the maximum of a, b, and c in a more concise way. It first finds the maximum of a and b, and then compares that result with c to find the overall maximum.
//System.out.println(max);
