class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Circular {
  Node head;
  Node tail;
  Circular() {
    this.head = null;
    this.tail = null;
  }

  public void insertTail (int data) {
    Node n = new Node(data);
    if(head == null) {
      head = n;
      tail = n;
    } else {
      tail.next = n;
      n.next = head;
      tail = n;
    }
  }

  public void insertHead(int data) {
    Node n = new Node(data);
    if(head == null) {
      head = n;
      tail = n;
    } else {
      tail.next = n;
      n.next = head;
      head = n;
    }
  }

  public void insertAfter(int data, int pos) {
    Node n = new Node(data);
    Node temp = head;
    Node temp1 = null;
    if(head == null) {
      head = n;
      tail = n;
    } else {
      if(pos == 1 && head == null) {
        head = n;
        tail = n;
      } else if (pos == 1 && head != null) {
        insertHead(data);
      } else {
        for(int i = 0; i < pos - 1; i++) {
          temp1 = temp;
          temp = temp.next;
        }
        n.next = temp1.next;
        temp1.next = n;
      }
    }
  }

  public void delData(int data) {
    Node temp = head;
    Node temp1 = null;
    if(head == null) {
      System.out.println("Empty list");
    } else {
      while(temp .data != data) {
        temp1 = temp;
        temp = temp.next;
      }
      temp1.next = temp1.next.next;
    }
  }

  public void delPosition(int pos) {
    Node temp = head;
    Node temp1 = null;
    if(head == null) {
      System.out.println("Empty list");
    } else {
      if(pos == 1 && head == null) {
        System.out.println("Empty list");
      } else if(pos == 1 && head != null) {
        head = tail.next.next;
        tail.next = head; 
      } else {
        for(int i = 0; i < pos - 1; i++) {
          temp1 = temp;
          temp = temp.next;
        }
        temp1.next = temp1.next.next;
      }

      }
  }

  public void printList() {
    Node temp = head;
    if(head == null) {
      System.out.println("Empty list");
    } else {
      while(temp.next != head) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
  }
}

public class CircularSingly {
  public static void main(String[] args) {
    Circular c1 = new Circular();
    c1.insertTail(10);
    c1.insertTail(20);
    c1.insertTail(30);
    c1.insertTail(40);
    c1.printList();
    c1.insertHead(5);
    c1.printList();
    c1.insertAfter(25, 4);
    c1.printList();
    c1.delData(25);
    c1.printList();
    c1.delPosition(1);
    c1.printList();
  }
}
