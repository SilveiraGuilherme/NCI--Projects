/* 
 * Cinema6
 * @Guilherme Silveira
 * @Oct 17 2024
 */

public class Cinema6 {
	//vars
	private String day, cost;
	
	//constructor
	public Cinema6(){
		
	}
	
	//setters
	public void setDay(String day){
		this.day = day;
	}

	//compute
	public void compute(){
		switch (day){
			case "monday":
			case "tuesday":
				cost = "Your ticket is 5 euros.";
				break;
			case "wednesday":
			case "thursday":
				cost = "Your ticket is 10 euros.";
				break;
			case "friday":
				cost = "Your ticket is 20 euros.";
				break;
			case "saturday":
			case "sunday":
				cost = "Your ticket is 30 euros.";
				break;
			default:
				cost = "This is not a valid day.";
		}
	}
	//getters
	public String getCost(){
		return cost;
		}
	}