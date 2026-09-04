package DAY11.SESSION2;


import java.util.*;

public class LeetCode107 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static List<List<Integer>> levelOrderBottom(Node root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int n = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                Node node = queue.poll();
                level.add(node.data);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(level);
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(3);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<List<Integer>> result = levelOrderBottom(root);

        System.out.println(result);
    }
}