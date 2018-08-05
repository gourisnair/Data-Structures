import java.util.*;

class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Linkedlist {
  Node head;
  Linkedlist() {
    this.head = null;
  }

public void addNodeLast(int data) {
  Node temp = head;
  Node newNode = new Node(data);
  if(head == null) {
    head = newNode;
  }else {
  for(temp = head; temp.next != null; temp = temp.next);
    temp.next = newNode;
  }
}

  public int lengthOfList() {
    Node temp = head;
    int count = 0;
    while(temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public void printList() {
    Node temp = head;
    while(temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}

public class Linklength {
  public static void main(String[] args) {
    Linkedlist l1 = new Linkedlist();
    l1.addNodeLast(10);
    l1.addNodeLast(20);
    l1.printList();
    System.out.println(l1.lengthOfList());
  }
}
