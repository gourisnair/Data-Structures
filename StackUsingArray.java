import java.util.*;
public class StackUsingArray {
  int max = 20;
  int a[] = new int[max];
  int top;
  StackUsingArray() {
    top = -1;
  }

  public boolean isEmpty() {
    if(top == -1) {
      return true;
    } else {
      return false;
    }
  }

public void push(int data) {
  if(top > max - 1) {
    System.out.println("Stack overflow");
  } else {
    if(isEmpty()) {
      top = 0;
      a[top] = data;
    } else {
      a[++top] = data;
    }
  }
}

public void pop() {
  if(isEmpty()) {
    System.out.println("Empty stack");
    return;
  } else {
      for(int i = top; i > -1; i--) {
        System.out.println(a[i]);
      }
  }
}

  public static void main(String[] args) {
    StackUsingArray s  = new StackUsingArray();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.pop();
  }
}
