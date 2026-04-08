public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // might be possible that (left + right) exceeds the range of int, so we use this formula to avoid overflow

            if (arr[mid] == target) { // Check if the target is at the middle
                return mid; // Return the index of the target
            } else if (arr[mid] < target) { // If the target is greater than the middle element
                left = mid + 1; // Search in the right half
            } else { // If the target is less than the middle element
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Return -1 if the target is not found in the array
    }
}
