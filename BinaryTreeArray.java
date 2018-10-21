class Tree {
  int max;
  int a[];
  Tree(int max) {
    this.max = max;
    a = new int[max];
  }

  public int leftChild(int pos) {
    return (2*pos)+1;
  }

  public int rightChild(int pos) {
    return (2*pos)+2;
  }

  public int parent(int pos) {
    return (pos/2);
  }

  public void insertParent(int data) {
    a[0] = data;
  }

  public void insertLeft(int data, int pos) {
    if(a[parent(pos)] == 0) {
      System.out.println("No parent node");
      return;
    } else {
      a[leftChild(pos)] = data;
    }
  }

  public void insertRight(int data, int pos) {
    if(a[parent(pos)] == 0) {
      System.out.println("No parent node");
      return;
    } else {
      a[rightChild(pos)] = data;
    }
  }

  public void printLevelOrder() {
    for(int i = 0; i < 7; i++) {
      System.out.print(a[i] + " ");
    }
  }
}

public class BinaryTreeArray {
  public static void main(String[] args) {
    Tree t = new Tree(10);
    t.insertParent(10);
    t.insertLeft(7, 0);
    t.insertRight(15, 0);
    t.insertLeft(6, 1);
    t.insertRight(30, 2);
    t.printLevelOrder();
  }
}
