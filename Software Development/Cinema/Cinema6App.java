/*
 * Cinema6App
 * @Guilherme Silveira
 * Oct 17 2024
 */
 
 import javax.swing.JOptionPane;
 
 public class Cinema6App {
	 public static void main(String[] args){
		 //Variables
		 String day, cost;
		 
		 //Objects
		 Cinema6 myC;
		 myC = new Cinema6();
		 
		 //Input
		 day = JOptionPane.showInputDialog(null, "Enter the day of the week");
		 day = day.toLowerCase();
		 
		 //Set
		 myC.setDay(day);
		 
		 //Compute
		 myC.compute();
		 
		 //Get
		 cost = myC.getCost();
		 
		 //Output
		 JOptionPane.showMessageDialog(null, cost);
	 }
 }
 