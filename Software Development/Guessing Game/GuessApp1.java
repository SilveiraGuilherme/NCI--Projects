/*
GuessApp1
@author: Guilherme Silveira
@date: 24/10/2024
*/

import javax.swing.JOptionPane;

public class GuessApp1{
	public static void main(String[] args){
		//Variables
		int userNum, randomNum;
		String msg;
		
		//Declare and create objects
		Guess myG = new Guess();
		
		//Input
		userNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, enter your guess, a number between 1 and 10. You have 2 attempts."));
		
		//Set
		myG.setUserNum(userNum);
		
		//Compute
		myG.compute();
		
		//Get
		randomNum = myG.getRandomNum();
		msg = myG.getMsg();
		
		//Output
		JOptionPane.showMessageDialog(null, "The secret number was " + randomNum + " and you guessed " + userNum + ". " + msg);
	}
}