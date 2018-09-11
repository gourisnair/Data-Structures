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

  public void sortedInsert(int data) {
    Node n = new Node(data);
    Node temp = head;
    Node temp1 = null;
    do {
      temp1 = temp;
      temp = temp.next;
    }
    while(temp.data < data);
    n.next = temp1.next;
    temp1.next = n;
  }

}

public class SortedInsert {
  public static void main(String[] args) {
    CircularLL c1 = new CircularLL();
    c1.addNode(10);
    c1.addNode(20);
    c1.addNode(30);
    c1.addNode(40);
    c1.sortedInsert(35);
    c1.printList();
  }
}
