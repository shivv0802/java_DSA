public class DoublyLinkedList {
  static class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
      data = d;
      next = null;
      prev = null;
    }
  }

  public static class linkedList {
    Node head = null;
    Node tail = null;

    public void insertAtBeginning(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
      } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
      }
    }

    public void insertAtEnd(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
      } else {
        Node temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
      }
    }

    public void insertAtKthNode(int data, int idx) {
      Node newNode = new Node(data);
      if (idx == 0) {
        insertAtBeginning(data);
        return;
      } else {
        Node temp = head;
        int count = 1;
        while (temp != null && count <= idx - 1) {
          temp = temp.next;
          count++;
        }
        temp.prev.next = newNode;
        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev = newNode;
      }

    }

    public void printList() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
    }
  }

  public static void main(String[] args) {
    linkedList dll = new linkedList();

    dll.insertAtBeginning(10);
    dll.insertAtBeginning(20);
    dll.insertAtEnd(30);
    dll.insertAtEnd(40);
    dll.insertAtKthNode(60, 2);

    dll.printList();
  }
}