import java.util.Scanner;

public class Sum {
    public static void main(Stringfun[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
        input.close();
    }
}
