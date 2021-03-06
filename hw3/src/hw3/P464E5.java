/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/11/15
 */

package hw3;

import java.util.Scanner;

public class P464E5 {
	private String description;
	private int rating;
	
	public P464E5(String description) {
		this.description = description;
		this.rating = 0;
	}
	
	private boolean isValid(int rating) {
		if (rating > 10 || rating < 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public void setRating() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a rating: ");
		
		while(true) {
			if (scanner.hasNextInt()) {
				int input = scanner.nextInt();
				
				if(isValid(input)) {
					this.rating = input;
					
					break;
				}
			}
			
			System.out.print("Invalid integer. Please try again: ");
			scanner.next();
		}
		
		System.out.println(this.rating);
	}
	
	public static void main(String[] args) {
		P464E5 characteristic = new P464E5("test");
		
		characteristic.setRating();
	}
}
