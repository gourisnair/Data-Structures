import java.util.*;

class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next  =null;
  }
}

class LinkedList {
  Node head;
  LinkedList() {
    this.head = null;
  }

  public void addNodeLast(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
    } else {
      Node temp;
      for(temp = head; temp.next != null; temp = temp.next);
      temp.next = newNode;
    }
  }

  public void reverseList() {
    Node curr = head;
    Node adj = null;
    Node prev = null;
    while(curr != null) {
      adj = curr.next;
      curr.next = prev;
      prev = curr;
      curr = adj;
    }
    head = prev;
  }

  public void printList(){
    Node temp;
    if(head == null) {
      System.out.println("Empty List");
    } else {
    for(temp = head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
      }
    }
  }
}

public class Reverse {
  public static void main(String[] args) {
  LinkedList l1 = new LinkedList();
  l1.addNodeLast(10);
  l1.addNodeLast(20);
  l1.addNodeLast(30);
  l1.addNodeLast(40);
  l1.addNodeLast(60);
  l1.printList();
  l1.reverseList();
  l1.printList();
  }
}
