/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/21/15
 */

package hw4;

public class Multiplication implements Command {
	double[] numbers;
	
	public Multiplication(double[] numbers) {
		this.numbers = numbers;
	}
	
	public void execute() {
		double result = 1;
		for(int i = 0; i < numbers.length; i++) {
			result = result * numbers[i];
		}
		
		System.out.println(result);
	}
}
