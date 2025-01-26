/*
* Eggs2.java
* @author Guilherme
* 08/10/24
*/

public class Eggs2{
	//Declare variables
	private int eggs, boxes, eggsLeft;
		
	//Constructor
	public Eggs2(){
	}
		
	//Setters
	public void setEggs(int eggs){
		this.eggs = eggs;
	}
	
	//Compute
	public void compute(){
		eggsLeft = eggs%12;
		boxes = (eggs - eggsLeft) / 12;
	}
	
	//Getters
	public int getBoxes(){
		return boxes;
	}
	public int getEggsLeft(){
		return eggsLeft;
	}

} //class