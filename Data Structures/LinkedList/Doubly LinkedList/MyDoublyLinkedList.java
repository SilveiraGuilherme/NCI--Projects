/*
  This is the standard Double LinkedList that will be
  using the DLNodes
*/
public class MyDoublyLinkedList<T> {

  DLNode<T> first;
  DLNode<T> last;

  @Override
  public String toString() {
    String output = "=========================\n";
    DLNode<T> current = first;
    while (current != null) {
      output += current.element + "\n";
      current = current.next;
    }
    output += "=========================\n";
    return output;
  }

  // the size method to count backwards.
  public int size() {
    if (isEmpty()) {
      return 0;
    }
    int size = 1;
    DLNode<T> current = last;
    // countint in reverse
    while (current.previous != null) {
      current = current.previous;
      size++;
    }
    return size;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void add(T e) {
    if (isEmpty()) {
      first = new DLNode<>(e, null, null);
      last = first;
    } else {
      last.next = new DLNode<>(e, last, null);
      last = last.next;
    }
  }

  public void prepend(T e) {
    if (isEmpty()) {
      add(e);
    } else {
      // we know something is in the list and we want to insert before it
      first = new DLNode<>(e, null, first);
      // what used to be first is now first.next and it's previous would have pointed
      // to null
      // we update it to point to new first value
      first.next.previous = first;
    }
  }

  public T get(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException();
    } else {
      DLNode<T> current = first;
      // we need to return an element at a particular
      // index....
      for (int i = 0; i < index; i++) {
        current = current.next;
      }
      return current.element;
    }
  }

  // adding a new element at an index...
  public void add(int index, T e) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException();
    }
    if (index == 0) {
      // we will reuse prepend to put the element in at the start
      prepend(e);
    } else if (index == size() - 1) {
      add(e);
    } else {
      DLNode<T> previous = first;
      for (int i = 0; i < index - 1; i++) {
        previous = previous.next;
      }
      DLNode<T> succ = previous.next;
      DLNode<T> middle = new DLNode<>(e, previous, succ);
      previous.next = middle;
      if (succ == null) {
        last = middle;
      } else {
        succ.previous = middle;
      }
    }
  }

  /**
   * This method adds an element to the list in the position ,→ previous to
   * the first occurrence of the the target ,→ element
   *
   *
   */
  public void addBefore(T target, T elem) {
    /*
     * we would like to add something just before the target element
     * thats cool. So we just need to find the index of the target element....
     */
    int count = 0;
    DLNode<T> current = first;
    while (current != null) {
      // we need to check if the target element is found
      if (current.element.equals(target)) {
        add(count, elem);
        break;
      }
      current = current.next;
      count++;
    }
  }

  /**
   * This method adds an element to the list in the position ,→ after to the
   * first occurrence of the the target element
   *
   *
   */
  public void addAfter(T target, T elem) {
    if (target != last.element) {
      int count = 0;
      DLNode<T> current = first;
      while (current != null) {
        // we need to check if the target element is found
        if (current.element.equals(target)) {
          add(count + 1, elem);
          break;
        }
        current = current.next;
        count++;
      }
    } else {
      add(elem);
    }

  }

  // when we make a call to remove and pass in an integer value Java knows that we
  // are calling this method!!!
  public T remove(int index) {
    System.out.println("We are removing the :: " + index + " element from our linkedlist");
    /*
     * if we are taking in an index well we first should make sure that it is within
     * the bounds of the
     * linkedList. Now this really isnt a concern if we are only ever going to call
     * this method from above as
     * we are identifying the index in the above method.
     */
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException();
    }
    T element; // Declaring a variable called element that is of type T

    // if its the first element that is pretty easy...
    if (index == 0) {
      // this means that we are being asked to remove the first element...
      element = first.element; // initialising the variable called element to be equal to first.element
      first = first.next;
      if (first == null) { // == is a comparison operator
        last = null; // = is an assignment operator
      }
      return element;
    }

    // if the index is not the first element we need to change a few things...
    DLNode<T> pred = first;
    for (int k = 1; k <= index - 1; k++) {
      pred = pred.next;
    }

    element = pred.next.element; // this is the element that we are going to remove...
    pred.next = pred.next.next;// we are just jumping over the element that we are removing

    if (pred.next == null) {
      last = pred;
    }
    return element;
  }

  public T remove(T target) {

    /*
     * This method is designed to find the index of the element to be removed!!!
     * Once we know the index we are going to call the method below!!!
     */
    DLNode<T> current = first;
    int index = 0;

    // we need to be able to iterate over the linkedlist until we find the target
    // element!!!
    // as we are moving we need to be able to increase our counter by 1

    while (current != null && !current.element.equals(target)) {
      current = current.next; // move onto the next Node... next is defined in the DLNode object
      index++; // increment out counter variable by 1 (++), this is the index...
    }
    /*
     * so if we think about the execution of the while loop there are two possible
     * outcomes.
     * 1) we find the element in our linkedlist and the value of index is the
     * position of the element...Happy Days!!
     * 2) we didn't find the element and the we traversed through the full list and
     * now index holds the same value as
     * the number of elements in the list but the target element wasn't found. we
     * also know that the value of current must
     * now be null because that is how the while loop stopped.
     */
    if (current != null && current.element.equals(target)) {
      // if we have found the target element tell the remove method to remove it!!!
      return remove(index);
    }
    return null;
  }
}
