import java.util.*;

class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = next;
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

  public int nthElement(int a) {
    Node temp = head;
    int count = 0,i;
    while(temp != null) {
      count++;
      temp = temp.next;
    }
    temp = head;
    int s = count - a;
    for(i=1; i<=s; i++) {
      temp = temp.next;
    }
    return temp.data;
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

public class Nfromend {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LinkedList l1 = new LinkedList();
    l1.addNodeLast(10);
    l1.addNodeLast(20);
    l1.addNodeLast(30);
    l1.addNodeLast(40);
    l1.addNodeLast(50);
    l1.addNodeLast(60);
    l1.printList();
    int n = scanner.nextInt();
    System.out.println(l1.nthElement(n));
  }
}
