public class dllDeletion {
  static class Node {
    Node next;
    int data;
    Node prev;

    public Node(int data) {
      this.data = data;
      next = null;
      prev = null;
    }
  }

  public static class linkedList {
    Node head = null;
    Node tail;

    void deleteBegin() {
      if (head == null) {
        System.out.println("List is  Empty");
      } else {
        head = head.next;
      }
    }

    void deleteEnd() {
      if (head == null) {
        System.out.println("list is empty");
        return;
      }
      if (head.next == null) {
        head = null;
        tail = null;
        return;
      } else {
        Node temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
        tail = temp.prev;
        tail.next = null;
        temp.next = null;
        temp = null;
      }
    }

    void push(int newData) {
      Node newNode = new Node(newData);
      newNode.next = head;
      if (head != null) {
        head.prev = newNode;
      }
      head = newNode;
    }

    void deleteAtKthNode(int idx) {
      if (head == null) {
        System.out.println("list is empty");
        return;
      }
      if (head.next == null) {
        head = null;
        tail = null;
        return;
      } else {
        Node temp = head;
        int count = 1;
        while (temp != null && count <= idx - 1) {
          temp = temp.next;
          count++;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp = null;
      }
    }

    void printList() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    linkedList dll = new linkedList();

    dll.push(6);
    dll.push(5);
    dll.push(4);
    dll.push(3);
    dll.push(2);
    dll.push(1);
    dll.printList();
    dll.deleteBegin();
    dll.printList();
    dll.deleteEnd();
    dll.printList();
    dll.deleteAtKthNode(2);
    dll.printList();
  }
}