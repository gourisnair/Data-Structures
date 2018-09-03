class Node {
  int data;
  Node left;
  Node right;
  Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

class BinaryTree {
  Node root;
  BinaryTree(Node root) {
    this.root = root;
  }

  public void insertNode(int data, Node node1) {
    if(data < node1.data) {
      if(node1.left == null) {
        node1.left = new Node(data);
      } else {
        insertNode(data, node1.left);
      }
    } else {
      if (node1.right == null) {
        node1.right = new Node(data);
      } else {
        insertNode(data, node1.right);
      }
    }
    return;
  }

  public void printLeafNodes(Node node2) {
    if(node2 == null) {
      return;
    }
    if(node2.left == null && node2.right == null) {
      System.out.println(node2.data);
    } else {
      printLeafNodes(node2.left);
      printLeafNodes(node2.right);
    }
  }
}

public class TreeLeaf {
  public static void main(String[] args) {
    BinaryTree t1 = new BinaryTree(new Node(10));
    t1.insertNode(20, t1.root);
    t1.insertNode(30, t1.root);
    t1.insertNode(15, t1.root);
    t1.printLeafNodes(t1.root);
  }
}
