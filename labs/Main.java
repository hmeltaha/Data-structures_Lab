class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BST {
    BSTNode root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private BSTNode insertRecursive(BSTNode node, int value) {
        if (node == null) {
            return new BSTNode(value);
        }

        if (value < node.data) {
            node.left = insertRecursive(node.left, value);
        }
        else if (value > node.data) {
            node.right = insertRecursive(node.right, value);
        }

        // duplicate values are ignored
        return node;
    }

    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(BSTNode node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderRecursive(node.right);
        }
    }

    public void preOrder() {
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(BSTNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderRecursive(node.left);
            preOrderRecursive(node.right);
        }
    }

    public void postOrder() {
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(BSTNode node) {
        if (node != null) {
            postOrderRecursive(node.left);
            postOrderRecursive(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("InOrder:");
        tree.inOrder();

        System.out.println("PreOrder:");
        tree.preOrder();

        System.out.println("PostOrder:");
        tree.postOrder();
    }
}