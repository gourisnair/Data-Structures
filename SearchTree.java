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

  public boolean search(int data, Node root) {
    if(root == null) {
      return false;
    }
    if(root.data == data) {
      return true;
    } else {
      if(data < root.data) {
        return search(data, root.left);
      } else {
        return search(data, root.right);
      }
    }
  }

  public int minimum(Node root) {
    if(root == null) {
      return 0;
    }
    if(root.left == null) {
      return root.data;
    } else {
      return minimum(root.left);
    }
  }

  public int maximum(Node root) {
    if(root == null) {
      return 0;
    }
    if(root.right == null) {
      return root.data;
    } else {
      return maximum(root.right);
    }
  }
}



public class SearchTree {
  public static void main(String[] args) {
    Bst b = new Bst(new Node(40));
    b.insert(90, b.root);
    b.insert(32, b.root);
    b.insert(92, b.root);
    b.insert(56, b.root);
    b.insert(12, b.root);
    System.out.println(b.search(92, b.root));
    System.out.println(b.search(20, b.root));
    System.out.println(b.minimum(b.root));
    System.out.println(b.maximum(b.root));
  }
}
