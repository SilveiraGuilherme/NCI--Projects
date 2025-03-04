public class PatientList {
    // variables
    DLNode<Patient> first;
    DLNode<Patient> last;

    // constructor
    public PatientList() {
        first = null;
        last = null;
    }

    // methods
    // check if the list is empty
    public boolean isEmpty() {
        return first == null;
    }

    // check and show how many patients have a diagnose
    public int patientCompleted() {
        DLNode<Patient> curr = first;
        int diagnosed = 0;
        while (curr != null) {
            if (!curr.elem.getDiag().equals("TBD")) {
                diagnosed++;
            }
            curr = curr.next;
        }
        return diagnosed;
    }

    // provide a list of all patients names with their respective symptoms
    public String currentProblems() {
        String output = "LIST OF SYMPTOMS:\n";
        DLNode<Patient> curr = first;
        while (curr != null) {
            output = output + curr.elem.getPName() + ": " + curr.elem.getSympt() + "\n";
            curr = curr.next;
        }
        return output;
    }

    public boolean contains(String name) {
        DLNode<Patient> curr = first;
        boolean found = false;
        while (curr != null) {
            if (curr.elem.getPName().toLowerCase().equals(name.toLowerCase())) {
                found = true;
                return found;
            }
            curr = curr.next;
        }
        return found;
    }

    // add a node after the last occurrence of the last added node related to the
    // last same patient or at the end of the list in case there is no occurrence
    public void add(Patient patient) {
        if (isEmpty()) {
            first = new DLNode<Patient>(patient);
            last = first;
            return;
        }
        DLNode<Patient> oldLast = last;
        if (!contains(patient.getPName())
                || last.elem.getPName().toLowerCase().equals(patient.getPName().toLowerCase())) {
            last = new DLNode<Patient>(patient, oldLast, null);
            oldLast.next = last;
        } else {
            DLNode<Patient> prev = last.previous;
            DLNode<Patient> curr = last;
            while (prev != null) {
                if (prev.elem.getPName().toLowerCase().equals(patient.getPName().toLowerCase())) {
                    prev.next = new DLNode<Patient>(patient, prev, curr);
                    curr.previous = prev.next;
                }
                prev = prev.previous;
                curr = curr.previous;
            }
        }
    }

    // remove all occurences of a Patient determined by its name
    public String remove(String pName) {
        if (isEmpty()) {
            return "The list is empty";
        }
        if (!contains(pName)) {
            return "No records found under the name of " + pName;
        } else {
            DLNode<Patient> curr = last;
            int counter = 0;
            while (curr != null) {
                if (curr.elem.getPName().toLowerCase().equals(pName.toLowerCase())) {
                    while (curr.elem.getPName().toLowerCase().equals(pName.toLowerCase())) {
                        curr.previous.next = curr.next;
                        if (curr.next != null) {
                            curr.next.previous = curr.previous;
                        }
                        curr = curr.previous;
                        counter++;
                    }
                }
                curr = curr.previous;
            }
            return Integer.toString(counter) + "records under the name of " + pName + " were deleted";
        }
    }

    @Override
    public String toString() {
        String output = "LIST OF PATIENTS:\n\n";
        DLNode<Patient> curr = first;
        while (curr != null) {
            output = output + curr.elem + "\n\n";
            curr = curr.next;
        }
        return output;
    }

}
