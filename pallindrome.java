public  class pallindrome {
    public static void main(Stringfun[] args) {
        int n = 12321; // Example number
        int originalNumber = n; // Store the original number for comparison
        int reversedNumber = 0;

        while (n > 0) {
            int digit = n % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            n = n / 10; // Remove the last digit from n
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
    
}
