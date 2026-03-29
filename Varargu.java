import java.util.Arrays;
public class Varargu {
    public static void main (String[] args ) {
        fun(2, 3, 4, 5); // signifies that we can pass any number of arguments to the method fun and it will be treated as an array of integers
    }
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}