/*
Temperature
@author: Guilherme Silveira
@date: 08/10/2024
*/

public class Temperature{
	//Declare variables
	private int c, f;
	
	//Constructor
	public Temperature(){
		
	}
	
	//Setters
	public void setC(int c){
		this.c = c;
	}
	
	//Compute
	public void compute(){
		f = (c * 9 / 5) + 32;
	}
	
	//Getters
	public int getF(){
		return f;
	}
}