/*
 * Cinema4App
 * @Guilherme Silveira
 * Oct 14 2024
 */
 
 import javax.swing.JOptionPane;
 
 public class Cinema4App {
	 public static void main(String[] args){
		 //Variables
		 String weekDay;
		 String cost;
		 
		 //Objects
		 Cinema4 myC;
		 myC = new Cinema4();
		 
		 //Input
		 weekDay = JOptionPane.showInputDialog(null, "Enter the day of the week ");
		 weekDay = weekDay.toLowerCase();
		 
		 //Set
		 myC.setWeekDay(weekDay);
		 
		 //Compute
		 myC.compute();
		 
		 //Get
		 cost = myC.getCost();
		 
		 //Output
		 JOptionPane.showMessageDialog(null, cost);
	 }
 }
 