/*
 * Cinema3App
 * @Guilherme Silveira
 * Oct 14 2024
 */
 
 import javax.swing.JOptionPane;
 
 public class Cinema3App {
	 public static void main(String[] args){
		 //Variables
		 int age;
		 String cost;
		 
		 //Objects
		 Cinema3 myC;
		 myC = new Cinema3();
		 
		 //Input
		 age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age "));
		 
		 //Set
		 myC.setAge(age);
		 
		 //Compute
		 myC.compute();
		 
		 //Get
		 cost = myC.getCost();
		 
		 //Output
		 JOptionPane.showMessageDialog(null, "Since you are " + age + ", your ticket is " + cost + ".");
	 }
 }
 