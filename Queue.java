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

  //Method to enqueue an element to the end of the queue
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

  //Method to enqueue an element to the front of the queue
  public void insertFirst(int data) {
    Node newNode = new Node(data);
    if(front == null) {
      front = newNode;
      rear = newNode;
    } else {
      newNode.next = front;
      front = newNode;
    }
  }

  //Method to enqueue an element at a position in the queue
  public void insertPos(int data, int pos) {
    Node newNode = new Node(data);
    Node temp = front;
    Node prev = null;
    if(front == null) {
      front = newNode;
      rear = newNode;
    } else {
      for (int i = 0; i < pos - 1; i++) {
        prev = temp;
        temp  =temp.next;
      }
      newNode.next = prev.next;
      prev.next = newNode;
    }
  }

  //Method to dequeue an element from the last of queue
  public void removeLast() {
    if (front == null) {
      System.out.println("Empty queue");
    } else {
      Node prev = null;
      for(Node temp = front; temp.next != null; temp = temp.next) {
        prev = temp;
      }
      prev.next = null;
    }
  }

  //Method to dequeue an element from the front of the list
  public void removeFirst() {
    if (front == null) {
      System.out.println("Empty queue");
    } else {
      front = front.next;
    }
  }

  //Method to dequeue an elementfrom a position in the queue
  public void removePos(int pos) {
    if(front == null) {
      System.out.println("Empty queue");
    } else {
      Node temp = front;
      Node prev = null;
      for(int i = 0; i < pos - 1; i++) {
        prev = temp;
        temp = temp.next;
      }
      prev.next = temp.next;
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
    l1.insertFirst(00);
    l1.insertPos(35,5);
    System.out.println("");
    l1.printQueue();
    l1.removeFirst();
    System.out.println("");
    l1.printQueue();
    l1.removeLast();
    l1.removePos(4);
    System.out.println("");
    l1.printQueue();
  }
}
