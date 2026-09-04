package DAY8.SESSION1;

public class Menoization {

    static int climb(int n, int[] dp) {

        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = climb(n - 1, dp) + climb(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 5;

        int[] dp = new int[n + 1];

        System.out.println("Number of ways: " + climb(n, dp));
    }
}