public class postorder {
  static class Node {
    Node left;
    int data;
    Node right;

    public Node(int data) {
      this.data = data;
      left = right = null;
    }
  }

  static class binaryTree {
    void inorderTraversal(Node root) {
      if (root == null)
        return;
      inorderTraversal(root.left);
      inorderTraversal(root.right);
      System.out.print(root.data + " ");
    }

  }

  public static void main(String[] args) {
    binaryTree tree = new binaryTree();
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    // root.left.left = new Node(4);
    // root.left.right = new Node(5);
    tree.inorderTraversal(root);

  }
}
