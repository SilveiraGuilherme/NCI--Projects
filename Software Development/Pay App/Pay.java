/*
* Pay.java
* @author Guilherme
* 07/10/24
*/

public class Pay{
		//Declare variables
		private double basicPayRate, basicHours, overTimeHours; //Input variables
		private double basicPay, overTimePay, totalPay; //Output variables
		
		//Constructor
		public Pay(){
		}
		
		
		//Setters
		public void setBasicPayRate(double basicPayRate){
			this.basicPayRate = basicPayRate;
		}
		
		public void setBasicHours(double basicHours){
			this.basicHours = basicHours;
		}
		
		public void setOverTimeHours(double overTimeHours){
			this.overTimeHours = overTimeHours;
		}
		
		//Compute
		public void compute(){
			basicPay = basicPayRate * basicHours;
			overTimePay = overTimeHours * basicPayRate * 1.5;
			totalPay = basicPay + overTimePay;
		}
		
		//Getters
		public double getBasicPay(){
			return basicPay;
		}
		
		public double getOverTimePay(){
			return overTimePay;
		}
		
		public double getTotalPay(){
			return totalPay;
		}
		

} //class