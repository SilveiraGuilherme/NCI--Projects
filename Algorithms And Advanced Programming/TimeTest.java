import java.lang.*; // for currentTimeMillis()

public class TimeTest {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		System.out.println(sumN2(1000000000));
		
		long endTime = System.currentTimeMillis();
		
		long elapsedTime = endTime - startTime;
		
		System.out.println(elapsedTime);
		
	}
	
	public static long sumN1(long n) {
		long s = n * (n + 1)/2;
		return s;
	}
	
	public static long sumN2(long n) {
		long s = 0;
		for (int j = 0; j < n; j++){
			s = s + (j + 1);
		}
		return s;
	}
}