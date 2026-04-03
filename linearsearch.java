public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 3 ,23, 9, 8};
        int target = 9;
        System.out.println(linearSearch(arr, target));
    }
    static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i; // return the index of the target
            }
        }
        return -1; // return -1 if the target is not found
    }
}
