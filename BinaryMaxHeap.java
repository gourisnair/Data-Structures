class Heap {
  int size;
  int a[];
  Heap(int size) {
    this.size = size;
    a = new int[size];
  }

  public int leftChild(int pos) {
    return 2*pos+1;
  }

  public int rightChild(int pos) {
    return 2*pos+2;
  }

  public int parent(int pos) {
    return pos/2;
  }

  public void swap(int papos, int chpos) {
    int temp = a[papos];
    a[papos] = a[chpos];
    a[chpos] = temp;
  }

  public void insertParent(int data) {
    a[0] = data;
  }

  public void insertLeft(int data, int pos) {
    if(a[pos] > data) {
      a[2*pos+1] = data;
    } else {
      a[2*pos+1] = data;
      swap(pos, 2*pos+1);
      return;
    }
  }

  public void insertRight(int data, int pos) {
    if(a[pos] > data) {
      a[2*pos+2] = data;
    } else {
      a[2*pos+2] = data;
      swap(pos, 2*pos+2);
      return;
    }
  }

  public void printLevelOrder() {
    for(int i = 0; i < 7; i++) {
      System.out.println(a[i]);
    }
  }

}


public class BinaryMaxHeap {
  public static void main(String[] args) {
    Heap h = new Heap(10);
    h.insertParent(50);
    h.insertLeft(7, 0);
    h.insertRight(40, 0);
    h.insertLeft(10, 1);
    h.insertRight(25, 1);
    h.insertRight(30, 2);
    h.printLevelOrder();

  }
}
