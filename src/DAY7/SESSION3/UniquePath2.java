package DAY7.SESSION3;

public class UniquePath2 {

    static int uniquePaths(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        if (grid[0][0] == 1) {
            return 0;
        }

        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {

                    if (i > 0) {
                        dp[i][j] += dp[i - 1][j];
                    }

                    if (j > 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {

        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        System.out.println("Number of paths: " + uniquePaths(grid));
    }
}