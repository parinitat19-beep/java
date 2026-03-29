import java.util.Scanner;

public class Casecheck {
    public static void main(Stringfun [] args) {
      Scanner input = new Scanner(System.in);
      char ch = input.next().trim().charAt(0); // Read a single character from user input and trim any whitespace
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not an alphabetic character.");
        }
        input.close();
    }
}
