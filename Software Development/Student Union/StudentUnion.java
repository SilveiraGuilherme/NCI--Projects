/*
StudentUnion
@author: Guilherme Silveira
@date: 08/10/2024
*/

public class StudentUnion{
	//Declare variables
	private int numCaps, numShirts, numHoodies; //input variables
	private int totalCost; //output variable
	final private int COSTCAPS = 5, COSTSHIRTS = 10, COSTHOODIES = 20;
	
	//Constructor
	public StudentUnion(){
		
	}
	
	//Setters
	public void setNumCaps(int numCaps){
		this.numCaps = numCaps;
	}
	public void setNumShirts(int numShirts){
		this.numShirts = numShirts;
	}
	public void setNumHoodies(int numHoodies){
		this.numHoodies = numHoodies;
	}
	
	//Compute
	public void compute(){
		totalCost = (numCaps * COSTCAPS) + (numShirts * COSTSHIRTS) + (numHoodies * COSTHOODIES);	
	}
	
	//Getters
	public int getTotalCost(){
		return totalCost;
	}
}