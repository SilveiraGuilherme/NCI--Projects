/*
* PayApp.java
* @author Guilherme
* 07/10/24
*/

//Import the address to the code
import java.util.Scanner;

public class PayApp{
	public static void main(String[] args){
		//Declare variables
		double basicPayRate, basicHours, overTimeHours;
		double	basicPay, overTimePay, totalPay;
		
		//Declare and create object
		Scanner sc = new Scanner (System.in);
		Pay myP = new Pay();
		
		//Input
		System.out.println("Please, enter the basic pay rate:");
		basicPayRate = sc.nextDouble();
		
		System.out.println("Please, enter the number of basic hours worked:");
		basicHours = sc.nextDouble();
		
		System.out.println("Please, enter the number of over time hours worked:");
		overTimeHours = sc.nextDouble();
		
		//Process
		myP.setBasicHours(basicHours);
		myP.setOverTimeHours(overTimeHours);
		myP.setBasicPayRate(basicPayRate);
		
		myP.compute();
		
		//Output
		basicPayRate = myP.getBasicPay();
		overTimeHours = myP.getOverTimePay();
		totalPay = myP.getTotalPay();
		
		System.out.println("Basic pay: " + basicPayRate + ". Overtime hours pay: " + overTimeHours + ". Total pay: " + totalPay + ".");
		
}
}