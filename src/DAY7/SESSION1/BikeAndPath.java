package DAY7.SESSION1;

import java.util.Arrays;
import java.util.List;

public class BikeAndPath {

    static boolean findingPath(List<List<Integer>> maze, int x, int y, String path) {

        int rows = maze.size();
        int cols = maze.get(0).size();

        // Check boundaries
        if (x < 0 || y < 0 || x >= rows || y >= cols) {
            return false;
        }

        // Check if cell is blocked
        if (maze.get(x).get(y) == 0) {
            return false;
        }

        // Destination reached
        if (x == rows - 1 && y == cols - 1) {
            System.out.println("Path: " + path);
            return true;
        }
        // Mark current cell as visited
        maze.get(x).set(y, 0);
        // Move Down
        if (findingPath(maze, x + 1, y, path + "D")) {
            return true;
        }
        // Move Right
        if (findingPath(maze, x, y + 1, path + "R")) {
            return true;
        }
        // Move Up
        if (findingPath(maze, x - 1, y, path + "U")) {
            return true;
        }
        // Move Left
        if (findingPath(maze, x, y - 1, path + "L")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        List<List<Integer>> maze = Arrays.asList(
            Arrays.asList(1, 0, 0, 0),
            Arrays.asList(1, 1, 0, 1),
            Arrays.asList(0, 1, 0, 0),
            Arrays.asList(0, 1, 1, 1)
        );

        boolean result = findingPath(maze, 0, 0, "");

        if (!result) {
            System.out.println("No path found");
        }
    }
}