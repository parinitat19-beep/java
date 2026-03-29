import java.util.Scanner;

public class Loops {
    public static void main(Stringfun[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " "); // print numbers from 1 to num with a space in between
        }   
        input.close();
    }
}
