public class bst {
  /*
   * Number of Leaf Nodes: The number of leaf nodes in a BST with n nodes is given
   * by:
   * L = (n+1)/2
   */

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node insert(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    }
    if (data < root.data) {
      root.left = insert(root.left, data);
    }
    if (data > root.data) {
      root.right = insert(root.right, data);
    }
    return root;
  }

  public static void inorder(Node root) {
    if (root == null)
      return;
    inorder(root.left);
    System.out.println(root.data + " ");
    inorder(root.right);
  }

  public static Node deleteLeaf(Node root, int data) {
    if (root == null)
      return root;
    if (data < root.data) {
      root.left = deleteLeaf(root.left, data);
      return root;
    }
    if (data > root.data) {
      root.right = deleteLeaf(root.right, data);
      return root;
    }
    if (root.left == null && root.right == null) {
      // free(root);
      return null;
    }
    if (root.left == null) {
      Node temp = root.right;
      return temp;
    }
    if (root.right == null) {
      Node temp = root.left;
      return temp;
    }
    Node parent = root;
    Node next = root.right;
    while (next.left != null) {
      parent = next;
    }

  }

  }

  public static void main(String[] args) {
    int[] arr = { 5, 1, 3, 4, 2, 7 };
    Node root = null;
    for (int i = 0; i < arr.length; i++) {
      root = insert(root, arr[i]);
    }
    inorder(root);
    searchBST(root, 4);

    // deleteLeaf(root, 4);
    System.out.println(deleteLeaf(root, 4));
    System.out.println("hello");
  }
}
