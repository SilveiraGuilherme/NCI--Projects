public class MovieLinkedList {
    // variables
    Node<Movie> first;
    Node<Movie> last;

    // constructor
    public MovieLinkedList() {
        first = null;
        last = null;
    }

    // methods
    public boolean isEmpty() {
        return first == null;
    }

    public String genreSearch(String genre) {
        String output = "";
        Node<Movie> current = first;
        while (current != null) {
            if (current.element.getGenre() == genre) {
                output = output + current.element.getTitle() + "\n";
            }
            current = current.next;
        }
        if (output == "") {
            return "No movies found with this genre";
        }
        return output;
    }

    public double getAverage() {
        if (isEmpty()) {
            return 0;
        }
        Node<Movie> current = first;
        double sum = 0;
        while (current != null) {
            sum = sum + current.element.getRating();
            current = current.next;
        }
        return sum / size();
    }

    public void add(Movie movie) {
        Node<Movie> oldLast = last;
        last = new Node<Movie>(movie);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public int size() {
        int size = 0;
        Node<Movie> current = first;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean contains(String title) {
        boolean found = false;
        Node<Movie> current = first;
        while (current != null) {
            if ((current.element.getTitle().toLowerCase()).equals(title.toLowerCase())) {
                found = true;
                return found;
            }
            current = current.next;
        }
        return found;
    }

    public String remove(String target) {
        if (contains(target)) {
            if ((first.element.getTitle().toLowerCase()).equals(target.toLowerCase())) {
                first = first.next;
                return "The movie " + target + " was removed";
            }
            Node<Movie> prev = first;
            Node<Movie> current = first.next;
            while (current != null) {
                if ((current.element.getTitle().toLowerCase()).equals(target.toLowerCase())) {
                    if (current != last) {
                        prev.next = current.next;
                    } else {
                        prev = last;
                    }
                    return "The movie " + target + " was removed";
                }
                prev = prev.next;
                current = current.next;
            }
        }
        return "The movie " + target + " was not found";
    }

    @Override
    public String toString() {
        String output = "========== MOVIE LIST ==========\n\n";
        Node<Movie> curr = first;
        while (curr != null) {
            output = output + curr.element + "\n\n";
            curr = curr.next;
        }
        return output + "==============================";
    }
}
