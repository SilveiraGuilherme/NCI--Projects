/*
* EmployeeApp.java
* @author Guilherme
* 
*
*/

public class EmployeeApp {
	public static void main(String[] args){
		Employee enda = new Employee("Enda");
		
		System.out.println("Employee enda: " + enda.toString());
		
		enda.setAge(34);
		
		System.out.println("Employee enda2: " + enda.toString());
		
		Employee mom = new Employee("Mom", 55, 5000, 60000);
		
		System.out.println("Employee mom: " + mom.toString());
		
		int nums[] = new int[5];
		Employee emps[] = new Employee[5];
		
		emps[0] = enda;
	}
}