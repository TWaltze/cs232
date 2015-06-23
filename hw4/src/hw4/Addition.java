/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/21/15
 */

package hw4;

public class Addition implements Command {
	double[] numbers;
	
	public Addition(double[] numbers) {
		this.numbers = numbers;
	}
	
	public void execute() {
		double result = 0;
		for(int i = 0; i < numbers.length; i++) {
			result = result + numbers[i];
		}
		
		System.out.println(result);
	}
}
