/**
 * My
 */
public class My {
  public class Node {
    Node prev;
    int data;
    Node next;

    public Node(int data) {
      this.data = data;

    }

    public class linkedlist {
      Node head;
      Node tail;

      public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
          head = newNode;
        } else {
          tail.next = newNode;
          newNode.prev = tail;
        }
        tail = newNode;
      }

      public void printList() {
        Node temp = head;
        while (temp.next != null) {
          System.out.println(temp.data);
        }
      }

    }

    public void printList(){
          Node temp = head;
          while(temp.next != null){
            System.out.println(temp.data);

    public static void main(String[] args) {
      linkedlist ll = new linkedlist();
      ll.add(5);
      ll.add(6);
      ll.add(7);

    }
}
