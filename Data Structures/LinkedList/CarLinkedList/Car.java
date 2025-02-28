
public class Car {
    // declare variables
    String regist, oName, pDesc;
    boolean status;
    int fCost;

    // constructor
    public Car(String regist, String oName, String pDesc) {
        this.regist = regist;
        this.oName = oName;
        this.pDesc = pDesc;
        fCost = 0;
        status = false;
    }

    // methods
    // getters and setters
    public void setRegist(String regist) {
        this.regist = regist;
    }

    public void setOName(String oName) {
        this.oName = oName;
    }

    public void setPDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public void setStatus(boolean ready) {
        this.status = ready;
    }

    public void setPrice(int cost) {
        this.fCost = cost;
    }

    public String getRegist() {
        return regist;
    }

    public String getOName() {
        return oName;
    }

    public String getPDesc() {
        return pDesc;
    }

    public boolean getStatus() {
        return status;
    }

    public int getFCost() {
        return fCost;
    }

    public String isReady(boolean status) {
        if (status) {
            return "Ready for collection";
        } else {
            return "Not ready for collection";
        }
    }

    @Override
    public String toString() {
        return "Registration: " + regist + "\nOwner's Name: " + oName + "\nProblem Description: " + pDesc
                + "\nFixing Cost: " + fCost + "\nStatus: " + isReady(status);
    }

    public static void main(String[] args) {
        Car car = new Car("nkdjfb", "kejrf", "nkwejbf");
        System.out.println(car);
    }
}
