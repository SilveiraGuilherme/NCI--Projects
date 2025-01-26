/* Cinema5
 * @Guilherme Silveira
 * @Oct 17 2024
 */

import javax.swing.JOptionPane;

public class Cinema5 {
	//vars
	private int age;
	private String day, cost;
	
	//constructor
	public Cinema5(){
		
	}
	
	//setters
	public void setDay(String day){
		this.day = day;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	//compute
	public void compute(){
		if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")){
			if(age < 10 || age > 65){
				cost = "Your ticket is free!";
			} else {
				cost = "Your ticket is 10 euros.";							
			}
		} else if (day.equals("friday") || day.equals("saturday") || day.equals("sunday")){
			if(age < 10){
				cost = "Your ticket is 20 euros!";
			} else if (age > 65){
				cost = "Your ticket is 10 euros.";							
			} else {
				cost = "Your ticket is 30 euros.";
			}
		} else {
			cost = "This is not a valid day.";			
		}
	}	
	//getters
	public String getCost(){
		return cost;
		}
	}