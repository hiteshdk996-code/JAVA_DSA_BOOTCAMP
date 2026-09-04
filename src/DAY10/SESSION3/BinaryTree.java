package DAY10.SESSION3;

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public class BinaryTree{
        public static void main(String[] args) {
            Node root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(20);
            root.left.left = new Node(40);
            root.left.right = new Node(50);
    }
}

