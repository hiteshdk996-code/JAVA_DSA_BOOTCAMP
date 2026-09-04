package DAY7.HW;

public class RatInTheMaze {

    static int n = 4;

    static int[][] maze = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };

    static int[][] solution = new int[n][n];
    static boolean findPath(int x, int y) {

        if (x < 0 || y < 0 || x >= n || y >= n ||
            maze[x][y] == 0) {
            return false;
        }

        if (x == n - 1 && y == n - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (solution[x][y] == 1) {
            return false;
        }

        solution[x][y] = 1;

        if (findPath(x + 1, y)) {
            return true;
        }

        if (findPath(x, y + 1)) {
            return true;
        }

        solution[x][y] = 0;
        return false;
    }

    public static void main(String[] args) {

        if (findPath(0, 0)) {

            System.out.println("Path found:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("No path found");
        }
    }
}