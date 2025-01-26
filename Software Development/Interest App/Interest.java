/*
* Interest.java
* @author Guilherme
* 07/10/24
*/

public class Interest{
		//Declare variables
		private int numMonths; private double amount; //Input variables
		double interest, totalAmount; //Output variables
		
		//Constructor
		public Interest(){
		}
		
		//Compute
		public void compute(){
			interest = numMonths * amount * 0.03;
			totalAmount = amount + interest;
		}
		
		//Getters and Setters
		public double getInterest(){
			return interest;
		}
		
		public double getTotalAmount(){
			return totalAmount;
		}
		
		public void setNumMonths(int numMonths){
			this.numMonths = numMonths;
		}
		
		public void setAmount(double amount){
			this.amount = amount;
		}
} //class