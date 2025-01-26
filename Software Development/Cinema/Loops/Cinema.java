/*
* Cinema.java
* @author Enda
* 21/10/2024
*/

public class Cinema{
	// Declare variables
	private int age;
	private double cost;

	// Constructor
	public Cinema(){
		//age = 0;
		//cost = 0.0;
	}

	// Compute
	public void compute(){
		if(age < 5){
			cost = 0.0;
		}
		else if(age >= 5 && age <= 14){
			cost = 5.0;
		}
		else if (age >= 15 && age <= 65){
			cost = 10.0;
		}
		else {cost = 0.0;}
	}

	// Getters and Setters
	public void setAge(int age){
		this.age = age;
	}

	public void setCost(double cost){
		this.cost = cost;
	}

	public double getCost(){
		return cost;
	}

	public int getAge(){
		return age;
	}
}