/*
    This is going to be the node that we are going to use in the Binary tree
    Here a node is just a java class that we are going to use
    This class will have different elements in it to help us create the tree.

    A tree is a hierarchical data structure that is used to store information in
    a tree like structure...

*/

//class definition
public class BTNode<T> {

  // instance variables...
  protected T element;
  protected BTNode<T> left;
  protected BTNode<T> right;

  // constructors
  public BTNode(T element) {
    this.element = element;
  }

  // We would also like to be able to create a string representation of this node.
  @Override

  public String toString() {
    String leftVal = (left == null ? "NULL" : left.element.toString());
    String rightVal = (right == null ? "NULL" : right.element.toString());
    return "BTNode {" + element + ", left = " + leftVal + ", right = " + rightVal + " }";
  }

}
