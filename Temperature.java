import java.util.Scanner;
public class Temperature {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the temperature in Celsius");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        input.close(); // Close the scanner to prevent resource leaks
    }
    
}

