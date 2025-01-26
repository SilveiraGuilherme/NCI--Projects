/* Cinema3
 * @Guilherme Silveira
 * @Oct 14 2024
 */
 
public class Cinema3 {
	//vars
	private int age;
	private String cost;
	
	//constructor
	public Cinema3(){
		
	}
	
	//setters
	public void setAge(int age){
		this.age = age;
	}
	
	//compute
	public void compute(){
		if (age < 5 || age > 65){
			cost = "free";
		} else if (age >= 5 && age < 15){
			cost = "5 euros";
		} else {
			cost = "10 euros";
		}
	}	
	//getters
	public String getCost(){
		return cost;
		}
	}
	