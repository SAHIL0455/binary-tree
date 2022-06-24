package com.brigdelabs;

public class BinaryTree<T extends Comparable> {

    public static void main(String[] args) {
        System.out.println("Welcome the Binary Tree Problems");
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addElementInBinary(55);
        binaryTree.addElementInBinary(20);
        binaryTree.addElementInBinary(10);
        binaryTree.preorder(binaryTree.head);
    }

    Node head;

    public void addElementInBinary(T key) {
        this.head = this.addRecursive(head, key);
    }

    private Node addRecursive(Node head, T key) {
        Node node = new Node<>(key);
        if (head == null) {
            return head = node;
        } else {
            int compareResult = key.compareTo(head.data);
            if (compareResult < 0) {
                head.left = addRecursive(head.left, key);
            } else {
                head.right = addRecursive(head.right, key);
            }
        }
        return head;
    }

    public static void preorder(Node node) {
        System.out.print(node.data + " ");

        if (node.right != null) {
            preorder(node.right);
        }
        if (node.left != null) {
            preorder(node.left);
        }
    }

}
