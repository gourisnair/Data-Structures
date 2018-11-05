class Queue{
  int a[];
  int max = 100;
  int size;
  int front, rear;
  Queue(int size) {
    this.size = size;
    a = new int[max];
    front = -1; rear = -1;
  }

  public void enqueue(int data) {
    int n = a.length;
    if(rear >= n || front == rear+1%n) {
      System.out.println("Overflow");
    } else {
      if(front == -1) {
        front = 0;
        rear = rear+1%n;
        a[rear] = data;
      } else {
        rear = rear+1%n;
        a[rear] = data;
      }
    }
  }

  public int dequeue() {
    int n = a.length;
    if(front == -1) {
      System.out.println("Underflow");
      return -1;
    } else {
      int element = a[front];
      front = front+1%n;
      return element;
    }
  }
  public void display() {
    int n = a.length;
    if(front == -1 || rear == -1) {
      System.out.println("Underflow");
    } else {
      for(int i = 0; i < size; i++) {
        System.out.println(a[i]);
      }
    }
  }
}

public class CircularQueue {
  public static void main(String[] args) {
    Queue q = new Queue(3);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.display();
  }
}
