public class Overloading {
    public static void main (String[] args ) {
        fun(2, 3); // will call the method with two integer parameters
        fun(2, 3, 4); // will call the method with three integer parameters
        fun(2.5, 3.5); // will call the method with two double parameters
    }
    static void fun(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    static void fun(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
    static void fun(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}
