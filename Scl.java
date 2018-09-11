class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class CircularLL {
  Node head;
  CircularLL() {
    this.head = null;
  }

  public void addNode(int data) {
    Node n = new Node(data);
    Node temp = head;
    if(head == null) {
      head = n;
      n.next = head;
    } else {
      do{
        temp = temp.next;
      }
      while(temp.next != head);
      temp.next = n;
      n.next = head;
    }
  }

  public void printList() {
    Node temp = head;
    if(head == null) {
      System.out.println("Empty list");
    } else {
      do {
        System.out.println(temp.data);
        temp = temp.next;
      }
      while(temp != head);
    }
  }

  public void addHead(int data) {
    Node n = new Node(data);
    Node temp = head;
    if(head == null) {
      head = n;
      n.next = head;
    } else {
      n.next = head;
      do {
        temp = temp.next;
      }
      while(temp.next != head);
      temp.next = n;
      head = n;
    }
  }

  public void addNodePos(int data, int pos) {
    Node n = new Node(data);
    Node temp = head;
    Node temp1 = null;
    if(head == null && pos == 1) {
      head = n;
      n.next = head;
    } else if(head != null && pos == 1) {
      addHead(data);
    } else {
      for(int i = 0; i < pos -1; i++) {
        temp1 = temp;
        temp = temp.next;
      }
      n.next = temp1.next;
      temp1.next = n;
    }
  }

  public void delHead() {
    Node temp = head;
    if(head == null) {
      System.out.println("Empty list");
    } else {
      do {
        temp = temp.next;
      }
      while(temp.next != head);
      temp.next = head.next;
      head = head.next;

    }
  }

  public void delNodePos(int pos) {
    Node temp = head;
    Node temp1 = null;
    if(head == null&& pos == 1) {
      System.out.println("Empty list");
    } else if(head != null && pos == 1) {
      delHead();
    } else {
      for(int i = 0; i < pos - 1; i++) {
        temp1 = temp;
        temp = temp.next;
      }
      temp1.next = temp1.next.next;
    }
  }
}

public class Scl {
  public static void main(String[] args) {
    CircularLL c1 = new CircularLL();
    c1.addNode(10);
    c1.addNode(20);
    c1.addNode(30);
    c1.addNode(40);
    c1.addHead(5);
    c1.addNodePos(25, 4);
    c1.delHead();
    c1.delNodePos(3);
    c1.printList();
  }
}
