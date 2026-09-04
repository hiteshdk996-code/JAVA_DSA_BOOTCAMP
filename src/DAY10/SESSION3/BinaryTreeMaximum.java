package DAY10.SESSION3;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeMaximum {

    Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    int findMaximum(Node root) {

        if (root == null) {
            return -1;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
    public static void main(String[] args) {

        BinaryTreeMaximum tree = new BinaryTreeMaximum();

        Node root = null;

        root = tree.insert(root, 50);
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 20);
        tree.insert(root, 40);
        tree.insert(root, 60);
        tree.insert(root, 80);

        System.out.println("Maximum value: " + tree.findMaximum(root));
    }
}