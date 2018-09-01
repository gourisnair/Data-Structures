import java.util.*;

class Node {
  int data;
  Node left;
  Node right;
  Node (int data) {
    this.data = data;
  }
}

class Tree {
  Node root;
  Tree(Node root) {
    this.root = root;
  }

  //Method to insert nodes to the binary tree
  public void addNode(int data, Node node1) {
    if(data < node1.data) {
      if(node1.left == null) {
        node1.left = new Node(data);
      } else {
        addNode(data, node1.left);
      }
    } else {
      if(data > node1.data) {
        if(node1.right == null) {
          node1.right = new Node(data);
        } else {
          addNode(data, node1.right);
        }
      }
    }
    return;
  }


  //Method to print the binary tree pre-order
  public void printPreorder(Node root) {
    if(root == null) {
      return;
    }
    System.out.println(root.data);
    printPreorder(root.left);
    printPreorder(root.right);
  }

  //Method to print binary tree post-order
  public void printPostorder(Node root) {
    if(root == null) {
      return;
    }
    printPostorder(root.left);
    printPostorder(root.right);
    System.out.println(root.data);
  }


  //Method to print binary tree in-order
  public void printInorder(Node root) {
    if(root == null) {
      return;
    }
    printInorder(root.left);
    System.out.println(root.data);
    printInorder(root.right);
  }
}

public class BinaryTree {
  public static void main(String[] args) {
    Tree t1 = new Tree(new Node(10));
    t1.addNode(20, t1.root);
    t1.addNode(70, t1.root);
    t1.addNode(40, t1.root);
    t1.addNode(50, t1.root);
    t1.addNode(60, t1.root);
    t1.printPreorder(t1.root);
    System.out.println(" ");
    t1.printPostorder(t1.root);
    System.out.println(" ");
    t1.printInorder(t1.root);
  }
}
