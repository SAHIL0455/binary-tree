package com.brigdelabs;

import java.util.Scanner;

public class BinaryTree<T extends Comparable> {

    public static void main(String[] args) {
        System.out.println("Welcome the Binary Tree Problems");
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addElementInBinary(55);
        binaryTree.addElementInBinary(20);
        binaryTree.addElementInBinary(10);
        binaryTree.preorder(binaryTree.head);
        System.out.println();
        System.out.println("Print the binary tree in preorder");
        binaryTree.addElementInBinary(56);
        binaryTree.addElementInBinary(30);
        binaryTree.addElementInBinary(22);
        binaryTree.addElementInBinary(40);
        binaryTree.addElementInBinary(11);
        binaryTree.addElementInBinary(3);
        binaryTree.addElementInBinary(16);
        binaryTree.addElementInBinary(70);
        binaryTree.addElementInBinary(60);
        binaryTree.addElementInBinary(95);
        binaryTree.addElementInBinary(65);
        binaryTree.addElementInBinary(63);
        binaryTree.addElementInBinary(67);
        binaryTree.preorder(binaryTree.head);
        System.out.println();
        System.out.println("Enter the Number to Search");
        int number = scanner.nextInt();
        binaryTree.searchElement(binaryTree.head, number);
        if (flag == 1) {
            System.out.println(number+" is Present in Tree");
        } else {
            System.out.println(number+" is Absent in Tree");
        }
    }
    static Scanner scanner = new Scanner(System.in);
    Node head;
    static int flag;

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

    public void preorder(Node node) {
        System.out.print(node.data + " ");

        if (node.right != null) {
            preorder(node.right);
        }
        if (node.left != null) {
            preorder(node.left);
        }
    }

    public void searchElement(Node node, T key) {
        if (node.data == key) {
            flag = 1;
            return;
        }
        if (node.right != null) {
            searchElement(node.right, key);
        }
        if (node.left != null) {
            searchElement(node.left, key);
        }
    }
}
