public class evendiginarray {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        int result = countEvenDigits(nums);
        System.out.println("Numbers with even number of digits: " + result);
    }

    static int countEvenDigits(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) { // loop through the array
            int num = nums[i]; // get the current number
            if (hasEvenDigits(num)) { // check if it has even digits
                count++;
            }
        }

        return count; // return the count of numbers with even digits
    }

    static boolean hasEvenDigits(int num) {
        int digits = 0; // variable to count the number of digits

        if (num == 0) return false; // optional edge case // if the number is 0, it has 1 digit which is odd

        while (num > 0) {
            digits++;
            num /= 10;
        }

        return digits % 2 == 0; // return true if the number of digits is even, false otherwise
    }
}
