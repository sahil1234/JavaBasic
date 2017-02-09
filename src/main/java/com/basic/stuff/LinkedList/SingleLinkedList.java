package com.basic.stuff.LinkedList;

/**
 * Created by sahilk on 07/01/17.
 */
public class SingleLinkedList {
    private static Node node;


    public SingleLinkedList() {
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (node == null) {
            node = newNode;
        } else {
            insert(value, node);
        }
    }
    public void insert(int value, Node node){
        Node newNode = new Node(value);
        // reach the last of the list and insert the newNode object at the end
         if (node.getNext() == null) {
             node.setNext(newNode);
         } else {
             insert(value, node.getNext());
        }
    }

    public void printNodes(Node node){
        while(node.getNext() != null){
            System.out.print(node.getValue() +", ");
            node = node.getNext();
        }
        System.out.println(node.getValue());
    }

    public void delete(int value) {
        Node tempNode = node;
        while (node.getNext() != null ) {
            if(tempNode.getNext().getValue() == value) {
                tempNode.setNext(tempNode.getNext().getNext());
                break;
            }
        }
    }

    public static Node getMiddleElement(Node node){
        Node slowNode = node;
        Node fastNode = node;
        int i =0;

        while (fastNode.getNext() != null) {
            if (i == 0) {
                fastNode = fastNode.getNext();
                i = 1;
            } else if (i == 1){
                fastNode = fastNode.getNext();
                slowNode = slowNode.getNext();
                i = 0;
            }
        }
        return slowNode;
    }

    public static int getNodeListCount(Node node) {
        int count = 0;
        if (node == null) {
            return 0;
        }
        while (node != null) {
            node = node.getNext();
            count++;
        }
        return count;
    }

    public static Node reverseNodeList(Node head){
        Node tempNode = null;
        Node prevNode = null;

        while (head != null) {
            if (tempNode == null) {
                tempNode =new Node(head.getValue());
                head = head.getNext();
                prevNode = head;
            } else {
                head = head.getNext();
                prevNode.setNext(tempNode);
                tempNode = prevNode;
                prevNode = head;
            }
        }
        return tempNode;
    }



    public static int findNthNodeFromEnd(Node node, int n) {
        int length = getNodeListCount(node);
        int value = length - n +1;
        int i = 1;
        while (node != null) {
            if ( i == value) {
                return node.getValue();
            }
            node = node.getNext();
            i++;
        }
        return -1;
    }


    public static boolean isPalindrome(Node node) {

        Node middleNode = getMiddleElement(node);
        Node reversedNodeList = reverseNodeList(middleNode.getNext());

        while (node != middleNode) {
            if (node.getValue() != reversedNodeList.getValue()) {
                return false;
            }
            node = node.getNext();
            reversedNodeList = reversedNodeList.getNext();
        }

        return true;
    }

    /**
     * Replace the kth node from start with the kth node from the end
     * @param node
     * @param k
     */
    public  void replaceKthNodeFromStartWithEnd(Node node, int k) {

        int nodeListLength = getNodeListCount(node);
        Node kthFromStart = null;
        Node kthFromEnd= null;
        int counter = 0;
        while (counter <= nodeListLength) {
            counter++;
            if (counter == k) {
                kthFromStart = node;
            }
            if (counter == nodeListLength - k +1) {
                kthFromEnd = node;
                break;
            }
            node = node.getNext();
        }
        int temp = kthFromStart.getValue();
        kthFromStart.setValue(kthFromEnd.getValue());
        kthFromEnd.setValue(temp);
    }


    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insert(1);
        singleLinkedList.insert(2);
        singleLinkedList.insert(3);
        singleLinkedList.insert(4);
        singleLinkedList.insert(5);
        singleLinkedList.insert(6);
        singleLinkedList.insert(7);
        singleLinkedList.insert(8);
        singleLinkedList.replaceKthNodeFromStartWithEnd(singleLinkedList.node, 1);
        singleLinkedList.printNodes(singleLinkedList.node);

        //singleLinkedList.printNodes(reverseWithRecurssionForDx(singleLinkedList.node));

        //System.out.println("This list is palindrome ---> "+ isPalindrome(singleLinkedList.node));
        //System.out.println("The nth value from end is -----> "+ findNthNodeFromEnd(singleLinkedList.node, 1));
    }



    public static Node reverseWithRecurssions(Node node) {


        if (node.getNext() == null) {
            // pointing node head to the last of the list.
            SingleLinkedList.node = node;
            return node;
        }
        Node tempNode = reverseWithRecurssions(node.getNext());
        tempNode.setNext(node);
        return node;
    }

    public static Node reverseWithRecurssion(Node tempNode) {
        Node newNode = null;
        newNode =  reverseWithRecurssions(tempNode);
        // after the reversal set null in the first node element which is now the last node of the list
        newNode.setNext(null);
        return node;
    }


    public static Node reverseWithRecurssionDx(Node node) {
        if (node.getNext() == null) {
            return node;
        }

        Node headNode = reverseWithRecurssionDx(node.getNext());
        node.getNext().setNext(node);
        return headNode;
    }

    /**
     * recursion with no class level Node object replace node within that list.
     * @param tempNode
     * @return
     */
    public static Node reverseWithRecurssionForDx(Node tempNode) {
        Node newNode = null;
        node = reverseWithRecurssionDx(tempNode);
        tempNode.setNext(null);
        return node;
    }








}
