/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/21/15
 */

package hw4;

public class Subtraction implements Command {
	double[] numbers;
	
	public Subtraction(double[] numbers) {
		this.numbers = numbers;
	}
	
	public void execute() {
		double result = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			result = result - numbers[i];
		}
		
		System.out.println(result);
	}
}
