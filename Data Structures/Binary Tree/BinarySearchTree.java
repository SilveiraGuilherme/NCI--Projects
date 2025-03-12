//This class is going to implement the binary search tree

//class signature. It has to extend comparable
public class BinarySearchTree<T extends Comparable<T>> implements BinaryTree<T> {
    // instance variable to allow us to access the root Node
    protected BTNode<T> root;

    // we need to check if the tree is empty...
    public boolean isEmpty() {
        return root == null;
    };

    // we need to be able to add in an object into our Binary Search tree
    // This should use the compare method to decide the location in the tree
    public void insert(T elem) {
        if (isEmpty()) {
            root = new BTNode<>(elem);
        } else {
            // we need to find out the position...
            insertNode(elem, root);
        }
    }

    private void insertNode(T elem, BTNode<T> current) {
        // we are looking for the position to place the new node into the tree
        if (elem.compareTo(current.element) == -1) {
            // we need to add to the left
            if (current.left == null) {
                current.left = new BTNode<>(elem);
            } else {
                // there was a node in the way.. we need to keep searching
                insertNode(elem, current.left);
            }
        } else {
            // the object must not be less
            if (current.right == null) {
                current.right = new BTNode<>(elem);
            } else {
                insertNode(elem, current.right);
            }
        }
    }

    // we need to be able to check how many objects are in the tree
    public int size() {
        return size(root);
    };

    // we search all possible nodes
    private int size(BTNode<T> current) {
        if (current == null) {
            return 0;
        } else {
            return 1 + size(current.left) + size(current.right);
        }
    }

    // this is a method that facilitates searching the tree based on the order of
    // the objects. We need to traverse the tree in order based on the compareTo
    // method
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(BTNode<T> current) {
        if (current == null) {
            return;
        }
        inOrder(current.left);
        System.out.println(current);
        inOrder(current.right);
    }

    // we would like to be able to find the object with the maximum value
    // based on the compare value --> bottom right of the tree (furthest position)
    public T findMax() {
        if (isEmpty()) {
            throw new TreeEmptyException();
        } else {
            return findMax(root);
        }
    }

    private T findMax(BTNode<T> current) {
        if (current.right == null) {
            return current.element;
        } else {
            return findMax(current.right);
        }
    }

    // We would like to be able to find the smallest element in the tree -->
    // this should be in the left most position of the tree.
    public T findMin() {
        if (isEmpty()) {
            throw new TreeEmptyException();
        } else {
            return findMin(root);
        }
    }

    private T findMin(BTNode<T> current) {
        if (current.left == null) {
            return current.element;
        } else {
            return findMax(current.left);
        }
    }

    // we need to be able to check if an element is in the tree
    public boolean contains(T element) {
        return contains(element, root);
    }

    private boolean contains(T element, BTNode<T> current) {
        if (current == null) {
            return false;
        } else {
            // now we need to search
            if (element.compareTo(current.element) == 0) {
                System.out.println("We found the element");
                return true;
            } else if (element.compareTo(current.element) < 0) {
                return contains(element, current.left);
            } else {
                return contains(element, current.right);
            }
        }
    }

    // we need to be able to remove an element from the tree. This is
    // challenging as we need to consider what we are removing and be
    // able to rebalance the tree to take into consideration the object
    // that was removed.
    public boolean remove(T element);

    // to be implemented
    public T findNode(T element);

    // to be implemented
    public T findParent(T element);

}