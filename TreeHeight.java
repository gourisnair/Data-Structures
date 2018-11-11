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

  public void insert(int data, Node root) {
    if(data < root.data) {
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


public int height(Node root)
 {
	 if(root == null)
		 return 0;
	int right=1+height(root.right);
	int left=1+height(root.left);
	if(left>right)
	{
		return left;
	}
	else
		return right;
 }
}
public class TreeHeight {
  public static void main(String[] args) {
    Bst b = new Bst(new Node(40));
    b.insert(90, b.root);
    b.insert(32, b.root);
    b.insert(92, b.root);
    b.insert(56, b.root);
    System.out.println(b.height(b.root));
  }
}
