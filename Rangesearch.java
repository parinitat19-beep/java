public class Rangesearch {
    public static void main(String[] args) {
        int[] arr = {1, 3 ,23, 9, 8};
        int target = 8;
        int start = 0; //you should fix the indices and not the values in the array because we are searching for the target in a specific range of the array, not for a specific value. The start and end indices define the range within which we want to search for the target.
        int end = 3;
        System.out.println(rangeSearch(arr, target, start, end));
    }
    static int rangeSearch(int[] arr, int target, int start, int end) {
        for(int i=start; i<=end; i++) {
            if(arr[i] == target) {
                return i; // return the index of the target
            }
        }
        return -1; // return -1 if the target is not found
    }
}
