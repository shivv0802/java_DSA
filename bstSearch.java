public class bstSearch {

  class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    public boolean searchBST(Node root, int key) {
      if (root == null) {
        return false;
      }

      if (key == root.data) {
        return true;
      }

      if (key < root.data) {
        return searchBST(root.left, key);
      } else {
        return searchBST(root.right, key);
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

    public static void main(String[] args) {
      int[] arr = { 5, 1, 3, 4, 2, 7 };
      Node root = null;
      for (int i = 0; i < arr.length; i++) {
        root = insert(root, arr[i]);
      }
      inorder(root);
    }
  }
}
