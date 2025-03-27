public class Grade {
    // variables
    private String subName;
    private int subGrade;

    // constructors
    public Grade(String subName, int subGrade) {
        this.subName = subName;
        this.subGrade = subGrade;
    }

    public Grade() {
        this.subName = "";
        this.subGrade = 0;
    }

    // getters and setters
    public String getSubName() {
        return subName;
    }

    public int getSubGrade() {
        return subGrade;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public void setSubGrade(int subGrade) {
        this.subGrade = subGrade;
    }

    // methods
    @Override
    public String toString() {
        return subName + ": " + subGrade;
    }
}
