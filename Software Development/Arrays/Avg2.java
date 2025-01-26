/*
* Avg2.java
* @Guilherme Silveira
* Date: 07/11/2024
*/

public class Avg2 {
	private double nums[] = new double[5];
	private double sum = 0, avg;
	
	//Setter
	public void setNums(double nums[]){
		this.nums = nums;
	}
	
	//Compute
	public void computeAvg(){
		for(int i = 0; i < 5; i++){
			sum = sum + nums[i];
		}
		avg = sum / 5;
	}
	
	//Getter
	public double getAvg(){
		return avg;
	}
}