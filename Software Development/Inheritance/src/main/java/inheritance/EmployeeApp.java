package inheritance;

/**
 *
 * @author guilhermesilveira
 */
public class EmployeeApp {

    public static void main(String[] args) {
        Employee gui = new Employee("Gui", 34, 3000.00, 36000.00);
        System.out.println("Employee Enda: " + gui.toString());
        
        Employee liam = new Employee();
        liam.setName("Liam");
        System.out.println("Employee Liam" + liam.toString());
    }
}
