public class Staff implements Comparable<Staff> {
    // variables
    private int staffId;
    private String name;
    private int age;
    private int height;
    private static int sortingChoice;

    // constructors
    public Staff() {
        staffId = 0;
        name = "default";
        age = 20;
        height = 170;
        sortingChoice = 1;
    }

    public Staff(int id, String name, int age, int height) {
        this.staffId = id;
        this.name = name;
        this.age = age;
        this.height = height;
        sortingChoice = 1;
    }

    // getters and setters
    public static void setSortingChoice(int choice) {
        sortingChoice = choice;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Staff otherStaff) {
        switch (sortingChoice) {
            case 1: // compare staff IDs
                return staffId - otherStaff.getStaffId();
            case 2: // compare names
                return name.toLowerCase().compareTo(otherStaff.getName().toLowerCase());
            case 3: // compare age
                return age - otherStaff.getAge();
            case 4: // compare height
                return height - otherStaff.getHeight();
            default: // compare staff IDs
                return staffId - otherStaff.getStaffId();
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
