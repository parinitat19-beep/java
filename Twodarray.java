import java.util.Scanner;
import java.util.Arrays;
public class Twodarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) { //i is for rows
            for(int j=0; j<arr[i].length; j++) { //j is for columns
                arr[i][j] = in.nextInt(); //taking input for 2d array
            }
        }
        //for(int i=0; i<arr.length; i++) {
           // for(int j=0; j<arr[i].length; j++) {
               // System.out.print(arr[i][j] + " "); //printing the 2d array
           // }
           // System.out.println();//for new line after each row
       // }
    // enhanced for loop to print the 2d array
    for(int i=0; i<arr.length; i++) {
        System.out.println(Arrays.toString(arr[i]));
    }
    in.close();
}
    
}
