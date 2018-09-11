class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class SCL {
  Node head;
  SCL() {
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

  public void splitSCL() {
    Node fast = head;
    Node slow = head;
    do {
      fast = fast.next.next;
      slow = slow.next;
    }
    while(fast.next != head && fast.next.next != head);
    if(fast.next.next == head) {
      fast = fast.next;
    }
    Node head1 = head;
    if(head.next != head) {
      Node head2 = slow.next;
      Node temp2 = head2;
      do{
        temp2  =temp2.next;
      }
      while(temp2.next != head);
      temp2.next = head2;
      do{
        System.out.println(temp2.data);
        temp2 = temp2.next;
      }
      while(temp2.next != head2);
    }
    fast.next = slow.next;
    slow.next = head;
    fast.next = head;
  }
}

public class SplitSCl{
  public static void main(String[] args) {
    SCL s1 = new SCL();
    s1.addNode(10);
    s1.addNode(20);
    s1.addNode(30);
    s1.addNode(40);
    s1.addNode(50);
    s1.addNode(60);
    s1.splitSCL();
    s1.printList();
  }
}
