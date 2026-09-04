package DAY11.SESSION2;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {

    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class CousinsTree {

    public boolean CheckCousins(TreeNode root, int x, int y) {

        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            boolean foundX = false;
            boolean foundY = false;
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.data == x) {
                    foundX = true;
                }
                if (node.data == y) {
                    foundY = true;
                }
                // Check if x and y have the same parent
                if (node.left != null && node.right != null) {
                    if ((node.left.data == x && node.right.data == y) ||
                        (node.left.data == y && node.right.data == x)) {
                        return false;
                    }
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // Both are present at the same level
            if (foundX && foundY) {
                return true;
            }
            // Only one is present
            if (foundX || foundY) {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        CousinsTree obj = new CousinsTree();
        System.out.println(obj.CheckCousins(root, 4, 5));
    }
}