/*
 * Cinema5App
 * @Guilherme Silveira
 * Oct 17 2024
 */
 
 import javax.swing.JOptionPane;
 
 public class Cinema5App {
	 public static void main(String[] args){
		 //Variables
		 int age;
		 String day, cost;
		 
		 //Objects
		 Cinema5 myC;
		 myC = new Cinema5();
		 
		 //Input
		 day = JOptionPane.showInputDialog(null, "Enter the day of the week");
		 day = day.toLowerCase();
		 age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
		 
		 //Set
		 myC.setDay(day);
		 myC.setAge(age);
		 
		 //Compute
		 myC.compute();
		 
		 //Get
		 cost = myC.getCost();
		 
		 //Output
		 JOptionPane.showMessageDialog(null, cost);
	 }
 }
 