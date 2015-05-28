/**
 * Tyler Waltze
 * hello@tylerwaltze.com
 * 5/27/15
 * 
 * BU U91283106
 * MET CS 232
 * 
 * Purpose: Convert from fahrenheit to kelvin.
 */

package hw2;

import java.util.Scanner;

public class Attached {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number in Fahrenheit: ");
		
		while(!scanner.hasNextInt()) {
			System.out.print("Invalid integer. Please try again: ");
			scanner.next();
		}
		
		int temp = scanner.nextInt();
		
		System.out.print(temp + " in Kelvin is: " + fToK(temp));
	}
	
	public static double kToF(int k) {
		return (k * 9.0 / 5.0) - 459.67;
		
	}
	
	public static double fToK(int f) {
		return (f + 459.67) * (5.0 / 9.0);
	}
}