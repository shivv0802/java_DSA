public class sll {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class linkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    void insertAtEnd(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
      } else {
        tail.next = temp;

      }
      tail = temp;
      size++;
    }

    void insertStart(int val) {
      Node temp = new Node(val);
      if (head == null) {
        insertAtEnd(val);
      } else {
        temp.next = head;
        head = temp;
      }
      size++;
    }

    void insertAtIndex(int idx, int val) {
      Node t = new Node(val);
      Node temp = head;
      if (idx == size) {
        insertAtEnd(val);
        return;
      } else if (idx == 0) {
        insertStart(val);
        return;
      }
      for (int i = 1; i <= idx - 1; i++) {
        temp = temp.next;
      }
      t.next = temp.next;
      temp.next = t;
      size++;

    }

    int getAt(int idx) {
      Node temp = head;
      for (int i = 1; i <= idx; i++) {
        temp = temp.next;

      }
      return temp.data;
    }

    void deleteAtIndex(int idx) {
      if (idx == 0) {
        head = head.next;
        size--;
        return;
      }
      Node temp = head;

      for (int i = 1; i < idx - 1; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
      if (idx == size - 1) {
        tail = temp;
      }
      size--;
    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;

      }
    }

    void deleteVal(int val) {
      Node temp = head;
      if (head == null) {
        System.out.println("List is Empty");
      } else if (head.data == val) {
        head = head.next;
      } else {
        while (temp.next.data != val) {
          temp = temp.next;
        }
        Node t = temp.next;
        temp.next = t.next;
      }
    }

  }

  public static void main(String[] args) {
    linkedList ll = new linkedList();
    ll.insertAtEnd(10);
    ll.insertAtEnd(20);
    ll.insertAtEnd(30);
    ll.insertAtEnd(40);
    ll.insertAtEnd(50);
    // ll.insertAtIndex(5,3);
    // ll.insertAtIndex(0,100);
    // ll.getAt(3);
    // ll.deleteAtIndex(0);
    // ll.display();
    // int value = ll.remove(9);
    // System.out.println(value);
    ll.deleteVal(10);
    ll.display();
    // System.out.println(ll.size);
    // System.out.println(ll.getAt(0));
    // System.out.println(ll.tail.data);
    // System.out.println(ll.size);
  }
}
