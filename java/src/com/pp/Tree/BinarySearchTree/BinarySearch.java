package com.pp.Tree.BinarySearchTree;

public class BinarySearch<E extends Comparable<E>> {

    public BinarySearch() {
        root = null;
        size = 0;
    }

    private class Node {
        public E e;
        public Node left;
        public Node right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;

        }
    }

    private Node root;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
//        return size == 0 ? true : false;
        return size == 0;
    }
}
