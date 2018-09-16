import java.util.*;
public class QueueUsingArray {
  int front, max = 20;
  int a[] = new int[max];
  QueueUsingArray() {
    front = -1;
  }

  public boolean isEmpty() {
    if(front < 0) {
      return true;
    } else {
      return false;
    }
  }

  public void enqueue(int data) {
    if(isEmpty()) {
      a[++front] = data;
    } else {
      a[++front] = data;
    }
  }

  public void dequeue() {
    if(isEmpty()) {
      System.out.println("Underflow");
      return;
    } else {
      for(int i = 0; i <= front; i++) {
        System.out.println(a[i]);
      }
    }
  }

  public static void main(String[] args) {
    QueueUsingArray q = new QueueUsingArray();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.dequeue();
  }
}
