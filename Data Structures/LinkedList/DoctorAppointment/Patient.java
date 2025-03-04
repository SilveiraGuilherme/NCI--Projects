public class Patient {
    // variables
    private String pName, address, sympt, diag, presc;
    private int cNumber;

    // constructor
    public Patient(String pName, String address, int cNumber, String sympt) {
        this.pName = pName;
        this.address = address;
        this.cNumber = cNumber;
        this.sympt = sympt;
        diag = "TBD";
        presc = "TBD";
    }

    // methods
    // setters
    public void setPName(String pName) {
        this.pName = pName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCNumber(int cNumber) {
        this.cNumber = cNumber;
    }

    public void setSymp(String sympt) {
        this.sympt = sympt;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }

    public void setPresc(String presc) {
        this.presc = presc;
    }

    // getters
    public String getPName() {
        return pName;
    }

    public String getAddress() {
        return address;
    }

    public int getCNumber() {
        return cNumber;
    }

    public String getSympt() {
        return sympt;
    }

    public String getDiag() {
        return diag;
    }

    public String getPresc() {
        return presc;
    }

    // toString override
    @Override
    public String toString() {
        return "Patient Name: " + pName + "\nAddress: " + address + "\nContact Number: " + cNumber + "\nSymptoms: "
                + sympt + "\nDiagnoses: " + diag + "\nPrescription: " + presc;
    }
}