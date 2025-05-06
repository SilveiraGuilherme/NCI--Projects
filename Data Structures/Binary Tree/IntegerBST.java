public class IntegerBST extends BinarySearchTree<Integer> {
    // 1) Calculate the sum of all node values in a tree
    public int sum() {
        return sum(root);
    }

    private int sum(BTNode<Integer> current) {
        // current is a leaf node
        if (current.left == null && current.right == null) {
            return current.element;
        } // current has only a left child
        else if (current.left != null && current.right == null) {
            return current.element + sum(current.left);
        } // current has only a right child
        else if (current.left == null && current.right != null) {
            return current.element + sum(current.right);
        } // current has both children
        else {
            return current.element + sum(current.left) + sum(current.right);
        }
    }

    // Simpler version
    public int calcSum() {
        return calcSum(root);
    }

    private int calcSum(BTNode<Integer> current) {
        if (current == null) {
            return 0;
        }
        return current.element + calcSum(current.left) + calcSum(current.right);
    }

    // 2) Calculate the product of the values of the nodes in a tree
    public int prod() {
        return prod(root);
    }

    private int prod(BTNode<Integer> current) {
        if (current.left == null && current.right == null) {
            return current.element;
        } else if (current.left != null && current.right == null) {
            return current.element * prod(current.left);
        } else if (current.left == null && current.right != null) {
            return current.element * prod(current.right);
        } else {
            return current.element * prod(current.left) * prod(current.right);
        }
    }

    // Simpler version
    public int calcProd() {
        return calcProd(root);
    }

    private int calcProd(BTNode<Integer> current) {
        if (current == null) {
            return 1;
        }
        return current.element * calcProd(current.left) * calcProd(current.right);
    }

    // 3) Return the even numbers in a tree
    public void findEven() {
        findEven(root);
    }

    private void findEven(BTNode<Integer> current) {
        if (current == null) {
            return;
        }
        findEven(current.left);
        if (current.element % 2 == 0) {
            System.out.println("Number found: " + current.element);
        }
        findEven(current.right);
    }

    public static void main(String[] args) {
        IntegerBST numbers = new IntegerBST();

        numbers.insert(34);
        numbers.insert(12);
        numbers.insert(8);
        numbers.insert(5);
        numbers.insert(6);
        numbers.insert(45);
        numbers.insert(7);
        numbers.insert(3);
        numbers.insert(20);
        numbers.insert(9);
        numbers.insert(16);

        int sum = numbers.sum();
        int calcSum = numbers.calcSum();

        int prod = numbers.prod();
        int calcProd = numbers.calcProd();

        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Sum2 of the numbers: " + calcSum);
        System.out.println("\nProduct of the numbers: " + prod);
        System.out.println("Product2 of the numbers: " + calcProd);
        System.out.println("\nEven numbers in the tree:");
        numbers.findEven();

        numbers.remove(34);
        numbers.inOrder();
    }
}
