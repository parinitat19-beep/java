public class Shadowing {
    static int x = 10;
    public static void main (String[] args ) {
        System.out.println(x);
        int x = 20;
        System.out.println(x);
        fun();
    }
    static void fun() {
        System.out.println(x); // will print 10 because it is static variable and not shadowed in this method
    }
    
}
