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
    public boolean remove(T element) {
        // a reference to the node that we are going to remove
        BTNode<T> toRemove = findNode(element);

        if (toRemove == null) {
            System.out.println("Can't find the node in the tree");
        }
        // we have a reference to the parent node
        BTNode<T> parent = findParent(element);

        // if we want to remove a leaf node, we need to identify if a node is a leaf
        // node.
        if (toRemove.left == null && toRemove.right == null) {
            // we need to figure out which child to remove
            if (toRemove.element.compareTo(parent.element) == -1) {
                parent.left = null;
                return true;
            } else {
                parent.right = null;
                return true;
            }
            // if the node has only one child, has a left child and no right child
        } else if (toRemove.left != null && toRemove.right == null) {
            toRemove = toRemove.left;
        }
        // to remove a node in the middle of the tree we need to look at the portion of
        // the tree to the left (for example) which will all have bigger values than
        // that node to be removed. Therefore we find the minimum value of that portion,
        // set it to null and replace that value on the current node. If we look at the
        // left side of the tree, we will replace it with maximum value of that tree.
    }

    // we need to find the node based on the value of T
    public BTNode<T> findNode(T element) {
        return findNode(element, root);
    }

    private BTNode<T> findNode(T elem, BTNode<T> current) {
        if (current == null) {
            return null;
        }
        // return element we are looking for is equal to the current
        if (current.element.equals(elem)) {
            return current;
        } else if (current.element.compareTo(elem) == -1) {
            // search right - current element is smaller than the element we are looking for
            return findNode(elem, current.right);
        } else {
            return findNode(elem, current.left);
        }
    }

    // this method should be able to find the parent of an element. A node that has
    // the element as a child
    public BTNode<T> findParent(T element) {
        return findParent(element, root);
    }

    private BTNode<T> findParent(T element, BTNode<T> current) {
        if (element.equals(root.element)) {
            return null;
        }
        BTNode<T> parent = current;
    }

}