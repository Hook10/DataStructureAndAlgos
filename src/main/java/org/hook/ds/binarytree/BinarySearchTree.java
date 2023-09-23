package org.hook.ds.binarytree;

public class BinarySearchTree {

  private TreeNode root;

  private class TreeNode {
    private int data; // generic type
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
      this.data = data;
    }
  }

  public void insert(int value) {
    root = insert(root, value);
  }

  public TreeNode insert(TreeNode root, int value) {
    if (root == null) { // base case
      root = new TreeNode(value);
      return root;
    }
    if (value < root.data) {
      root.left = insert(root.left, value);
    } else {
      root.right = insert(root.right, value);
    }
    return root;
  }

  public void inOrder() {
    inOrder(root);
  }

  public void inOrder(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  public TreeNode search(int value) {
    return search(root, value);
  }

  private TreeNode search(TreeNode root, int key) {
    if (root == null || root.data == key) {
      return root;
    }
    if (key < root.data) {
      return search(root.left, key);
    } else {
      return search(root.right, key);
    }
  }

  public boolean isValidBinarySearchTree(TreeNode root, long min, long max) {
    if (root == null) {
      return true;
    }
    if (root.data <= min || root.data >= max) {
      return false;
    }
    boolean left = isValidBinarySearchTree(root.left, min, root.data);
    if (left) {
      boolean right = isValidBinarySearchTree(root.right, root.data, max);
      return right;
    }
    return false;
  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(5);
    bst.insert(3);
    bst.insert(7);
    bst.insert(1);
    bst.inOrder();
    bst.search(10);
    System.out.println(bst.isValidBinarySearchTree(bst.root, Long.MIN_VALUE, Long.MAX_VALUE));
  }
}
