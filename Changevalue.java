import java.util.Arrays;
public static void main(String args []) {
    int [] arr = {1, 2, 3, 4, 5};
    change (arr);
    System.out.println(Arrays.toString(arr)); // to string is used to print the array in a readable format
}
static void change (int [] arr) {
    arr [0] = 99; // this will change the first element of the array to 99
    
}
