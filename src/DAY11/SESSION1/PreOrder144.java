package DAY11.SESSION1;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PreOrder144 {

    public List<Integer> getpreOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    public void preorder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.data);       // Root
        preorder(root.left, result); // Left
        preorder(root.right, result);// Right
    }

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        PreOrder144 obj = new PreOrder144();

        List<Integer> result = obj.getpreOrder(root);
        System.out.println(result);
    }
}