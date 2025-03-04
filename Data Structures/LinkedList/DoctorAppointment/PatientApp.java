public class PatientApp {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Jhon", "Main St, D01", 8855, "Nausea");
        Patient patient2 = new Patient("Jane", "Dublin 2", 6677, "Headache");
        Patient patient3 = new Patient("Richard", "Dublin 8", 5555, "Flu");
        Patient patient4 = new Patient("Carol", "Dublin 7", 444, "Toothache");
        Patient patient5 = new Patient("Carol", "Dublin7", 444, "Stomachache");

        PatientList pList = new PatientList();

        System.out.println(pList.isEmpty()); // Should return true

        pList.add(patient1);
        pList.add(patient2);
        pList.add(patient3);
        pList.add(patient4);
        pList.add(patient5);

        System.out.println(pList); // Should return a list with all the patients information
        System.out.println(pList.isEmpty()); // Should return false

        patient1.setDiag("Infection"); // Should set the Diagnose to "Infection"
        patient3.setDiag("COVID");

        System.out.println(pList.patientCompleted()); // Should return the number of diagnosed patients

        System.out.println(pList.currentProblems()); // Shoud return a list with the name of each patient and its
                                                     // respective symptoms

        pList.remove("Carol"); // Should remove all records of the patient called name Carol

        pList.add(new Patient("Jane", "Dublin 2", 6677, "Cramps")); // Should add this node on the third position of the
                                                                    // list
        System.out.println(pList); // Should return a list of four patients (Jhon, Jane, Jane and Richard,
                                   // respectively)
    }
}
