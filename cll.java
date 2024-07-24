public class cll {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class CircularLinkedList {
    Node head;

    public void add(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
        newNode.next = head;
      } else {
        Node temp = head;
        while (temp.next != head) {
          temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
      }
    }

    public int length() {
      if (head == null) {
        return 0;
      }

      int count = 1;
      Node temp = head.next;

      while (temp != head) {
        count++;
        temp = temp.next;
      }
      return count;
    }

    public void display() {
      if (head == null) {
        System.out.println("List is empty");
        return;
      }

      Node temp = head;
      while (temp != head) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    CircularLinkedList circularList = new CircularLinkedList();
    circularList.add(1);
    circularList.add(2);
    circularList.add(3);
    circularList.add(4);

    circularList.display();
    System.out.println("Length of circular linked list: " + circularList.length());
  }
}
