class Node{
  int data;
  Node left;
  Node right;
  Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

class Bst{
  Node root;
  Bst(Node root) {
    this.root = root;
  }

  public void insert(int data, Node node) {

    if(data < node.data) {
      if(node.left == null) {
        node.left = new Node(data);
      } else {
        insert(data, node.left);
      }
    } else {
      if(node.right == null) {
        node.right = new Node(data);
      } else {
        insert(data, node.right);
      }
    }
  }

  public int countLeaf(Node root) {
    if(root == null) {
      return 0;
    } else {
      if(root.left == null && root.right == null) {
        return 1;
      } else {
        return countLeaf(root.left) + countLeaf(root.right);
      }
    }
  }
}



public class CountLeaf {
  public static void main(String[] args) {
    Bst b = new Bst(new Node(40));
    b.insert(90, b.root);
    b.insert(32, b.root);
    b.insert(92, b.root);
    b.insert(56, b.root);
    b.insert(12, b.root);
    System.out.println(b.countLeaf(b.root));
  }
}
