public class calculator {
    public static void main(Stringfun[] args) {
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);  

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
