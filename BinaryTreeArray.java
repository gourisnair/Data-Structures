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

class Tree {
  Node root;
  Tree() {
    this.root = null;
  }

  public Node insertLevelOrder(int[] a, Node root, int i) {

    if(i < a.length) {
      Node temp = new Node(a[i]);
      root = temp;
      root.left = insertLevelOrder(a, root.left, 2*i+1);
      root.right = insertLevelOrder(a, root.right, 2*i+2);
    }

    return root;
  }

  public void printInorder(Node root) {
    if(root != null) {
      printInorder(root.left);
      System.out.println(root.data);
      printInorder(root.right);
    }
  }
}

public class BinaryTreeArray {
  public static void main(String[] args) {
    Tree t = new Tree();
    int[] a = {1, 2, 3, 4, 5, 6, 6, 6, 6};
    t.root = t.insertLevelOrder(a, t.root, 0);
    t.printInorder(t.root);
  }
}
