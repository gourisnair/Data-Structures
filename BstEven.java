class Node{
  int data;
  Node left;
  Node right;
  Node(int data) {
    this.data = data;
    this.right = null;
    this.left = null;
  }
}
class Bst {
  Node root;
  Bst(Node root) {
    this.root = root;
  }
  public void insert(int data, Node root) {
    if(root == null) {
      root = new Node(data);
    } else {
      if(root.data > data) {
        if(root.left == null) {
          root.left = new Node(data);
        } else {
          insert(data, root.left);
        }
      } else {
        if(root.right == null) {
          root.right = new Node(data);
        } else {
          insert(data, root.right);
        }
      }
    }
  }

  public void printEven(Node root) {
    if(root == null) {
      return;
    }
    printEven(root.left);
    if(root.data % 2 == 0) {
      System.out.println(root.data);
    }
    printEven(root.right);
  }
}
public class BstEven{
  public static void main(String[] args) {
    Bst b = new Bst(new Node(1));
    b.insert(2, b.root);
    b.insert(3, b.root);
    b.insert(4, b.root);
    b.insert(8, b.root);
    b.insert(6, b.root);
    b.printEven(b.root);

  }
}
