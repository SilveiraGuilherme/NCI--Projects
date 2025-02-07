public class Car {
    // declare variables
    String regist, oName, pDesc, status;
    int fCost;

    public Car(String regist, String oName, String pDesc, int fCost, String status) {
        this.regist = regist;
        this.oName = oName;
        this.pDesc = pDesc;
        this.fCost = fCost;
        this.status = status;
    }

    public boolean isReady(String status) {
        if (status == "Ready for collection") {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Registration: " + regist + "\nOwner's Name: " + oName + "\nProblem Description: " + pDesc
                + "\nFixing Cost: " + fCost + "\nStatus: " + status;
    }

}
