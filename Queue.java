class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node rear;
  Node front;
  LinkedList() {
    this.rear = null;
    this.front = null;
  }

  //Method to enqueue an element to the queue
  public void insertLast(int data) {
    Node newNode = new Node(data);
    if(front == null) {
      front  = newNode;
      rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }



  //Method to dequeue an element from the list
  public void removeFirst() {
    if (front == null) {
      System.out.println("Empty queue");
    } else {
      front = front.next;
    }
  }


  //Method to print the queue
  public void printQueue() {
    if(front == null) {
      System.out.println("Empty queue");
    } else {
      Node temp;
      for(temp = front; temp != null; temp = temp.next) {
        System.out.println(temp.data);
      }
    }
  }
}

public class Queue {
  public static void main(String[] args) {
    LinkedList l1 = new LinkedList();
    l1.insertLast(10);
    l1.insertLast(20);
    l1.insertLast(30);
    l1.insertLast(40);
    l1.insertLast(50);
    l1.printQueue();
    System.out.println("");
    l1.printQueue();
    l1.removeFirst();
    System.out.println("");
    l1.printQueue();
  }
}
