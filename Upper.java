import java.util.Scanner;
public class Upper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); // Read a single character from user input
        if (ch >= 'a' && ch <= 'z') { // Check if the character is a lowercase letter
            System.out.println("lOWERCASE");
        } else if (ch >= 'A' && ch <= 'Z') { // Check if the character is an uppercase letter
            System.out.println("UPPERCASE");
        } else {
            System.out.println("Input is not a letter."); // Handle non-letter input
        }
        in.close(); // Close the scanner to prevent resource leaks
    }
}
