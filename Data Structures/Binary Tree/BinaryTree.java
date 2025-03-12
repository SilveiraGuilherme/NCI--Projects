// we know that our interface should list the methods that must be implemented
//when creating a Binary Search  Tree

// With Binary search trees we need to use objects that are comparable
// with each other.
//this specifices that we can only use object that have extended
//comparable and have an implementation of the compare method
public interface BinaryTree<T extends Comparable<T>> {

  // we need to check if the tree is empty...
  public boolean isEmpty();

  // we need to be able to add in an object into our Binary Search tree
  // This should use the compare method to decide the location in the tree
  public void insert(T elem);

  // we need to be able to check how many objects are in the tree
  public int size();

  // this is a method that facilitates searching the tree based on the order
  // of the objects.
  public void inOrder();

  // we would like to be able to find the object with the maximum value
  // based on the compare value --> bottom right of the tree
  public T findMax();

  // We would like to be able to find the smallest element in the tree -->
  // this should be in the left most position of the tree.
  public T findMin();

  // we need to be able to remove an element from the tree. This is
  // challenging as we need to consider what we are removing and be
  // able to rebalance the tree to take into consideration the object
  // that was removed.
  public boolean remove(T element);

  // we need to be able to check if an element is in the tree
  public boolean contains(T element);

  // to be implemented
  public T findNode(T element);

  // to be implemented
  public T findParent(T element);
}
