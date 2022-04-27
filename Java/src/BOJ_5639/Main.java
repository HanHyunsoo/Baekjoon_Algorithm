package BOJ_5639;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tree tree = new Tree();

        while (true) {
            String input = br.readLine();
            if (input == null || input.isEmpty()) break;
            tree.insert(Integer.parseInt(input));
        }

        tree.postOrder(tree.root);
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}

class Tree {
    Node root;

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.value);
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node node = root;

        while (true) {

            if (node.value > value) {
                if (node.left == null) {
                    node.left = new Node(value);
                    return;
                }
                node = node.left;
            } else {
                if (node.right == null) {
                    node.right = new Node(value);
                    return;
                }
                node = node.right;
            }
        }
    }
}