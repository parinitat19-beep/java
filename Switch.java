import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch(fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            default -> System.out.println("Unknown fruit");
            input.close();

        }
    }
}//only supported in java 14 and above