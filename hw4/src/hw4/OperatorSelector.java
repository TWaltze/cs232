/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/21/15
 */

package hw4;

import java.util.Scanner;

public class OperatorSelector {
	/*
	 * Main program.
	 * 
	 * Determine type of mathematical operation
	 * and collect inputs.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Command command;
		
		showMenu();
		
		int option;
		double[] inputs;
		while(true) {
			String error = "Invalid option. Please try again: ";
			
			System.out.print("Please make a selection: ");
			try {
				option = Integer.parseInt(keyboard.next());
				
				if (option < -1 || option > 4) {
					System.out.println(error);
				} else {
					if (option == -1) {
						System.out.println("Thanks for playing.");
						break;
					} else if(option == 0) {
						System.out.println("Choose a number, the program does the rest.");
						break;
					}
					
					if(option == 1) {
						inputs = gatherInputs(2);
						command = new Multiplication(inputs);
					} else if(option == 2) {
						inputs = gatherInputs(2);
						command = new Division(inputs);
					} else if(option == 3) {
						inputs = gatherInputs(2);
						command = new Subtraction(inputs);
					} else {
						inputs = gatherInputs(2);
						command = new Addition(inputs);
					}
					
					command.execute();
					break;
				}
				
			} catch(Exception e) {
				System.out.println(error);
			}
		}
	}
	
	/*
	 * Display main menu. Doesn't incorporate any interaction.
	 * Simply used for user direction.
	 */
	public static void showMenu() {
		System.out.println("Select a command below:");
		System.out.println("-1. Exit Program");
		System.out.println(" 0. Show Help");
		System.out.println(" 1. Multiplication");
		System.out.println(" 2. Division");
		System.out.println(" 3. Subtraction");
		System.out.println(" 4. Addition");
	}
	
	/*
	 * Collect <numberOfInputs> inputs.
	 * All inputs will be treated as a double.
	 */
	public static double[] gatherInputs(int numberOfInputs) {
		double[] numbers = new double[numberOfInputs];
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter " + numberOfInputs + " numbers: ");
		
		double value;
		for(int i = 0; i < numberOfInputs; i++) {
			while(true) {
				try {
					value = Double.parseDouble(keyboard.next());
					numbers[i] = value;
					
					break;
				} catch(Exception e) {
					System.out.print("Invalid number. Please try again: ");
				}
				
			}
		}

		return numbers;
	}
}
