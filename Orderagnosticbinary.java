public class Orderagnosticbinary {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 5;

        int result = orderAgnosticBinarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        boolean isAscending = arr[left] < arr[right]; // Check if the array is sorted in ascending or descending order

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            if (arr[mid] == target) { // Check if the target is at the middle
                return mid; // Return the index of the target
            }

            if (isAscending) { // If the array is sorted in ascending order
                if (target < arr[mid]) { // If the target is less than the middle element
                    right = mid - 1; // Search in the left half
                } else { // If the target is greater than the middle element
                    left = mid + 1; // Search in the right half
                }
            } else { // If the array is sorted in descending order
                if (target > arr[mid]) { // If the target is greater than the middle element
                    right = mid - 1; // Search in the left half
                } else { // If the target is less than the middle element
                    left = mid + 1; // Search in the right half
                }
            }
        }

        return -1; // Return -1 if the target is not found in the array
    } 
}
