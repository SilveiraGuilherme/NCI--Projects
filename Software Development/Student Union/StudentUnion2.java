/*
StudentUnion2
@author: Guilherme Silveira
@date: 17/10/2024
*/

public class StudentUnion2{
	//Declare variables
	private int numCaps, numShirts, numHoodies; //input variables
	private int costCaps = 5, costShirts = 10, costHoodies = 20;
	private int totalCost; //output variable
	
	//Constructor
	public StudentUnion2(){
		
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
		if (numCaps >= 5 || numShirts >= 5 || numHoodies >= 5) {
			costCaps = 3;
			costShirts = 7;
			costHoodies = 15;
		} else {
			
		}
		totalCost = (numCaps * costCaps) + (numShirts * costShirts) + (numHoodies * costHoodies);	
	}
	
	//Getters
	public int getTotalCost(){
		return totalCost;
	}
}