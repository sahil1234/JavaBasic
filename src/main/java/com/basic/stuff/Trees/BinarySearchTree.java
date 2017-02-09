package com.basic.stuff.Trees;

/**
 * Created by sahilk on 04/02/17.
 */
public class BinarySearchTree {

    private Node root;
     public BinarySearchTree() {

     }


    public void insert(int value) {
        if (root == null) {
            Node tempNode = new Node();
            tempNode.setValue(value);
            root = tempNode;
        } else {
            insert(root, value);
        }
    }

    private Node insert(Node root, int value) {

        Node tempNode = new Node();
        tempNode.setValue(value);

        if (root == null) {
            root = tempNode;
            return root;
        } else {
            if (value > root.getValue()) {
                root.setRight(insert(root.getRight(), value));
            } else {
                root.setLeft(insert(root.getLeft(), value));
            }
        }
        return root;
    }


    public static void preOrderTraversal(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.getValue() +", ");
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }


    public static int getHeight(Node root) {
            return getHeights(root)+1;
    }
    public static int getHeights(Node root){

        if (root == null) {
            return 0;
        }
        int leftTotal = getHeights(root.getLeft());
        int rightTotal = getHeights(root.getRight());
        return (leftTotal > rightTotal ? leftTotal : rightTotal)+1;

    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(15);
        tree.insert(12);
        tree.insert(10);
        tree.insert(8);
        tree.insert(6);
        tree.insert(4);
        tree.insert(2);
        tree.insert(20);
        tree.insert(21);
        tree.insert(22);
        tree.insert(23);
        tree.insert(24);
        tree.insert(25);
        tree.insert(26);
        tree.insert(27);
        tree.insert(28);
        tree.insert(29);



        preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("the height is ----> "+ getHeight(tree.root));

    }
}
