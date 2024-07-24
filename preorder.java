public class preorder {
  static class Node {
    Node left;
    int data;
    Node right;

    public Node(int data) {
      this.data = data;
      left = right = null;
    }
  }

  // here recursion concept is came in action i.e. preorder->R,l,r
  static class binaryTree {
    void preorderTraversal(Node root) {
      if (root == null)
        return;
      System.out.print(root.data + " ");
      preorderTraversal(root.left);
      // System.out.print(root.data + " ");
      preorderTraversal(root.right);

    }

  }

  public static void main(String[] args) {
    binaryTree tree = new binaryTree();
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    // root.left.left = new Node(4);
    // root.left.right = new Node(5);
    tree.preorderTraversal(root);

  }
}
