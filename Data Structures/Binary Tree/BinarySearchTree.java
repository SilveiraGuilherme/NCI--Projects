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

    public BTNode<T> findNode(T element) {
        return findNode(element, root);
    };

    private BTNode<T> findNode(T element, BTNode<T> current) {
        if (current == null) {
            // not in the tree
            return null;
        }
        if (element.compareTo(current.element) == 0) {
            return current;
        } else if (element.compareTo(current.element) < 0) {
            return findNode(element, current.left);
        } else {
            return findNode(element, current.right);
        }
    }

    public BTNode<T> findParent(T element) {
        return findParent(element, root);
    }

    private BTNode<T> findParent(T element, BTNode<T> current) {
        // element is the root => no parent
        if (element.compareTo(root.element) == 0) {
            return null;
        }
        if (element.compareTo(current.element) < 0) {
            if (current.left == null) {
                // not in the tree
                return null;
            } else if (element.compareTo(current.left.element) == 0) {
                return current;
            } else {
                return findParent(element, current.left);
            }
        } else {
            if (current.right == null) {
                // not in the tree
                return null;
            } else if (element.compareTo(current.right.element) == 0) {
                return current;
            } else {
                return findParent(element, current.right);
            }
        }
    }

    // we need to be able to remove an element from the tree. This is
    // challenging as we need to consider what we are removing and be
    // able to rebalance the tree to take into consideration the object
    // that was removed.

    public boolean remove(T element) {
        // We need to locate the node that we want to remove
        BTNode<T> toRemove = findNode(element);
        if (toRemove == null) {
            System.out.println("Not found!");
            return false;
        }
        System.out.println("To remove: " + toRemove);

        // we need to find its parent
        BTNode<T> parent = findParent(element);
        System.out.println("Parent: " + parent);

        // Simplest case: The removal of a leaf node
        if (toRemove.left == null && toRemove.right == null) {
            // determine which child it is
            if (toRemove.element.compareTo(parent.element) < 0) {
                // It is the left child
                parent.left = null;
            } else {
                // It is the right child
                parent.right = null;
            }
            return true;

            // The node might have only a left or right child
        } else if (toRemove.left != null && toRemove.right == null) { // the node only has a left child
            // We need to link the parent node to the left child of the removed node
            // Let's find out if the node to be removed is the left or right child of its
            // parent
            if (toRemove.element.compareTo(parent.element) < 0) {
                // the element is the left child, so we need to link its parent to its left
                // child
                // we shouldn't get rid of the node, only change the data piece of the object
                parent.left = toRemove.left;
            } else { // the element is the right child
                parent.right = toRemove.left;
            }
            return true;

        } else if (toRemove.left == null && toRemove.right != null) { // the node only has a right child
            if (toRemove.element.compareTo(parent.element) < 0) {
                parent.left = toRemove.right;
            } else {
                parent.right = toRemove.right;
            }
            return true;

        } else if (toRemove.left != null && toRemove.right != null) { // the node to be removed has both left and right
                                                                      // child
            // find the max value in the left subtree or the minimum in the right subtree
            T maxValue = findMax(toRemove.left);
            BTNode<T> replacement = findNode(maxValue);
            BTNode<T> replacementParent = findParent(maxValue);
            System.out.println("Replacement: " + replacement + "\nReplacement parent: " + replacementParent);

            // if the replacement parent is the node to be removed, its left child will
            // replace it
            if (replacementParent.element.compareTo(toRemove.element) == 0) {
                replacementParent.left = null;
            } else {
                replacementParent.right = null;
            }
            toRemove.element = replacement.element;
            return true;
        }
        System.out.println("Parent: " + parent);
        return false;
    };

    public static void main(String[] args) {
        BinaryTree<Integer> numbers = new BinarySearchTree<>();
        numbers.insert(12);
        numbers.insert(4);
        numbers.insert(6);
        numbers.insert(5);
        numbers.insert(8);
        numbers.insert(34);
        numbers.insert(100);
        numbers.insert(2);

        System.out.println("------------------");
        numbers.inOrder();

        System.out.println("------------------");
        System.out.println("Size of BST: " + numbers.size());

        System.out.println("------------------");
        System.out.println("Max elem of BST: " + numbers.findMax());

        System.out.println("------------------");
        System.out.println("Min elem of BST: " + numbers.findMin());

        System.out.println("______________________");
        numbers.remove(6);

        System.out.println("______________________");
        numbers.inOrder();

        System.out.println("______________________");
    }
}