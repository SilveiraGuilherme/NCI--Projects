/*
* Guess.java
* @author Guilherme Silveira
* 24/10/2024
*/

public class Guess{
	//Declare Variables
	private int userNum, randomNum;
	private String msg;
	
	//Constructor
	public Guess(){
	}
	
	//Setters
	public void setUserNum(int userNum){
		this.userNum = userNum;
	}
	
	//Compute method
	public void compute(){
		randomNum = (int) (Math.random() * 10) + 1;
		
		if(userNum == randomNum) {
			msg = "Congratulations, you guessed correctly!";
		} else if(userNum < randomNum) {
			msg = "You guessed too low, sorry!";
		} else {
			msg = "You guessed too high, sorry!";
		}
	}
	
	//Getters
	public int getRandomNum(){
		return randomNum;
	}	
	public String getMsg(){
		return msg;
	}
}
