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
    l1.pushLast(90);
    l1.printList();
  }
}
