class Node {
  int data;
  Node left;
  Node right;
  Node(int d) {
    this.data = d;
    this.left = null;
    this.right = null;
  }
}

class Tree {
  Node root;
  Tree(Node root) {
    this.root = root;
  }

  public void addNode(int data, Node node) {
    if(data < node.data) {
      if(node.left == null) {
        node.left = new Node(data);
      } else {
        addNode(data, node.left);
      }
    } else {
      if(node.right == null) {
        node.right = new Node(data);
      } else {
        addNode(data, node.right);
      }
    }
  }

  public void printInorder(Node node) {
    if(node == null) {
      return;
    } else {
      printInorder(node.left);
      System.out.println(node.data);
      printInorder(node.right);
    }
  }

  public void printPreorder(Node node) {
    if(node == null) {
      return;
    } else {
      System.out.println(node.data);
      printPreorder(node.left);
      printPreorder(node.right);
    }
  }

  public void printPostorder(Node node) {
    if(node == null) {
      return;
    } else {
      printPostorder(node.left);
      printPostorder(node.right);
      System.out.println(node.data);
    }
  }
}

public class Binarytree {
  public static void main(String[] args) {
    Tree t1 = new Tree(new Node(10));
    t1.addNode(2, t1.root);
    t1.addNode(30, t1.root);
    t1.addNode(1, t1.root);
    t1.addNode(4, t1.root);
    t1.addNode(20, t1.root);
    t1.addNode(40, t1.root);
    System.out.println("In - order:");
    t1.printInorder(t1.root);
    System.out.println("Pre - order:");
    t1.printPreorder(t1.root);
    System.out.println("Post - order:");
    t1.printPostorder(t1.root);
  }
}
