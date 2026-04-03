public class twodsearch {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 5;
        System.out.println(twoDSearch(arr, target));
    }
    static String twoDSearch(int[][] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return "Target found at: (" + i + ", " + j + ")"; // return the indices of the target
                }
            }
        }
        return "Target not found"; // return a message if the target is not found
    }
}
