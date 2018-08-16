import java.util.*;

class Node {
  int data;
  Node next;

  Node (int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node top;
  LinkedList() {
    this.top = null;
  }

//Method to check whether the stack is empty
  public void isEmpty() {
    if (top == null) {
      System.out.println("Stack is empty");
    } else {
      System.out.println("Not empty");
    }
  }

//Method to push element on to the stack
  public void pushFirst(int data) {
    Node newNode = new Node(data);
    if (top == null) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  //Method to push element at a position
  public void pushPosition(int data, int pos) {
    Node newNode = new Node(data);
    Node temp = top, temp1 = null;
    if(top == null) {
      top = newNode;
    } else {
      int i;
      for(i = 0; i < pos - 1; i++) {
        temp1  =temp;
        temp = temp.next;
      }
      newNode.next = temp1.next;
      temp1.next = newNode;
    }
  }

  //Method to push element to the end of the Stack
  public void pushLast(int data) {
    Node newNode = new Node(data);
    Node temp;
    if (top == null) {
      top = newNode;
    } else {
      for(temp = top; temp.next != null; temp = temp.next);
      temp.next = newNode;
    }
  }



  //Method to pop element from a stack
  public void popLast() {
    Node temp, temp1 = null;
    for(temp = top; temp.next != null; temp = temp.next) {
      temp1 = temp;
    }
    temp1.next = null;
  }



  //Method to pop element from first
  public void popFirst() {
    if (top == null) {
      System.out.println("Empty stack");
    } else {
      top = top.next;
    }
  }



  //Method to pop from a position
  public void popPosition(int pos) {
    Node temp = top, temp1 = null;
    if (top == null) {
      System.out.println("Empty stack");
    } else {
      for(int i = 0; i < pos - 1; i++) {
        temp1 = temp;
        temp = temp.next;
      }
      temp1.next = temp.next;
    }
  }

  //Method to print the Stack
  public void printList() {
    if(top == null) {
      System.out.println("Empty stack");
    } else {
      Node temp;
      for(temp = top; temp != null; temp = temp.next) {
        System.out.println(temp.data);
      }
    }
  }
}

public class Stack {
  public static void main(String[] args) {
    LinkedList l1 = new LinkedList();
    l1.pushFirst(10);
    l1.pushFirst(20);
    l1.pushFirst(30);
    l1.pushFirst(40);
    l1.pushFirst(50);
    l1.pushFirst(60);
    l1.pushFirst(70);
    l1.pushFirst(80);
    l1.printList();
    l1.popFirst();
    l1.printList();
    l1.popLast();
    l1.printList();
    l1.popPosition(2);
    l1.pushLast(90);
    //l1.pushPosition(100,1);
    l1.printList();
  }
}
