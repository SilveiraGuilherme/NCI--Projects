/*
Calculator
@author: Guilherme Silveira
@date: 08/10/2024
*/

public class Calculator{
	//Declare variables
	private double x, y, sum, diff;
	
	//Constructor
	public Calculator(){
		
	}
	
	//Setters
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	
	//Compute
	public void compute(){
		sum = x + y;
		diff = x - y;
	}
	
	//Getters
	public double getSum(){
		return sum;
	}
	public double getDiff(){
		return diff;
	}
}