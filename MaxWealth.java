public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 5, 1}
        };

        int result = maximumWealth(accounts);
        System.out.println("Maximum wealth: " + result);
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) { // loop through each customer
            int wealth = 0; // variable to calculate the wealth of the current customer

            for (int j = 0; j < accounts[i].length; j++) { // loop through each account of the current customer
                wealth += accounts[i][j]; // add the amount in the current account to the wealth
            }

            if (wealth > maxWealth) { // check if the current customer's wealth is greater than the maximum wealth found so far
                maxWealth = wealth; // update the maximum wealth
            }
        }

        return maxWealth; // return the maximum wealth found
    }
}