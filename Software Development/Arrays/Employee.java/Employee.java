/*
* Employee.java
* @author Guilherme
* 
*
*/

public class Employee {
	//Declare variables
	private String name;
	private int age;
	private double mSal, ySal;
	
	//Constructor
	public Employee(){
		
	}
	
	public Employee(String name, int age, double mSal, double ySal){
		this.name = name;
		this.age = age;
		this.mSal = mSal;
		this.ySal = ySal;
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	// Setters and Getters
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String toString(){
		return "Employee{name " + name + ", age: " + age + ", mSal: " + mSal + ", ySal: " + ySal + "}";
	}
}