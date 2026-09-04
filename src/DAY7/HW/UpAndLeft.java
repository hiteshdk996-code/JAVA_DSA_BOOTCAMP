package DAY7.HW;

import java.util.Arrays;
import java.util.List;

public class UpAndLeft {

    static boolean findingPath(List<List<Integer>> maze, int x, int y, String path) {

        int rows = maze.size();
        int cols = maze.get(0).size();
        // Boundary check
        if (x < 0 || y < 0 || x >= rows || y >= cols) {
            return false;
        }
        // Blocked cell
        if (maze.get(x).get(y) == 0) {
            return false;
        }
        // Destination
        if (x == 0 && y == 0) {
            System.out.println("Path: " + path);
            return true;
        }
        // Mark visited
        maze.get(x).set(y, 0);
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
            Arrays.asList(1, 1, 1, 1),
            Arrays.asList(0, 0, 0, 1),
            Arrays.asList(1, 1, 1, 1),
            Arrays.asList(1, 1, 1, 1)
        );

        boolean result = findingPath(
            maze,
            maze.size() - 1,
            maze.get(0).size() - 1,
            ""
        );

        if (!result) {
            System.out.println("No path found");
        }
    }
}