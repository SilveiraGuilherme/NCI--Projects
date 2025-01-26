/* Cinema4
 * @Guilherme Silveira
 * @Oct 14 2024
 */

import javax.swing.JOptionPane;

public class Cinema4 {
	//vars
	private String weekDay;
	private String cost;
	
	//constructor
	public Cinema4(){
		
	}
	
	//setters
	public void setWeekDay(String weekDay){
		this.weekDay = weekDay;
	}
	
	//compute
	public void compute(){
		if (weekDay.equals("monday") || weekDay.equals("tuesday") || weekDay.equals("wednesday") || weekDay.equals("thursday")){
			cost = "The ticket is 10 euros.";			
		} else if (weekDay.equals("friday") || weekDay.equals("saturday") || weekDay.equals("sunday")){
			cost = "The ticket is 20 euros.";			
		} else {
			cost = "This is not a valid day.";			
		}
	}	
	//getters
	public String getCost(){
		return cost;
		}
	}