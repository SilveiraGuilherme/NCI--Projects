
public class Car {
    // declare variables
    String regist, oName, pDesc;
    boolean status;
    int fCost;

    public Car(String regist, String oName, String pDesc) {
        this.regist = regist;
        this.oName = oName;
        this.pDesc = pDesc;
        this.fCost = 0;
        this.status = false;
    }

    public String isReady(boolean status) {
        if (status) {
            return "Ready for collection";
        } else {
            return "Not ready for collection";
        }
    }

    public void setStatus(boolean ready) {
        this.status = ready;
    }

    public void setPrice(int cost) {
        this.fCost = cost;
    }

    @Override
    public String toString() {
        return "Registration: " + regist + "\nOwner's Name: " + oName + "\nProblem Description: " + pDesc
                + "\nFixing Cost: " + fCost + "\nStatus: " + isReady(status);
    }
}
