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

public class P362P5 {
	public static int a;
	public static int b;
	public static int c;
	public static int d;
	public static int f;
	public static final int ASTERISK_TO_PERCENT = 2;
	public static final int LABEL_INCREMENTS = 10;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of A grades: ");
		a = scanner.nextInt();
		
		System.out.println("Please enter the number of B grades: ");
		b = scanner.nextInt();
		
		System.out.println("Please enter the number of C grades: ");
		c = scanner.nextInt();
		
		System.out.println("Please enter the number of D grades: ");
		d = scanner.nextInt();
		
		System.out.println("Please enter the number of F grades: ");
		f = scanner.nextInt();
		
		buildGraph();
	}
	
	public static int totalGrades() {
		return a + b + c + d + f;
	}
	
	public static double gradePercentage(int count) {
		return ((double)count / totalGrades()) * 100;
	}
	
	public static void buildGraph() {
		buildAxis();
		
		System.out.println(generateAsterisks(gradePercentage(a)) + "A");
		System.out.println(generateAsterisks(gradePercentage(b)) + "B");
		System.out.println(generateAsterisks(gradePercentage(c)) + "C");
		System.out.println(generateAsterisks(gradePercentage(d)) + "D");
		System.out.println(generateAsterisks(gradePercentage(f)) + "F");
	}
	
	public static void buildAxis() {
		// Generate number labels
		String numLabels = "";
		for(int i = 0; i <= 100; i += LABEL_INCREMENTS) {
			numLabels += i + generateLabelSpacing(i);
		}
		
		// Generate label ticks
		String labelTicks = "";
		for(int i = 0; i <= 100; i += LABEL_INCREMENTS) {
			labelTicks += "|" + generateLabelSpacing(1);
		}
		
		// Generate asterisks
		String asterisks = "";
		for(int i = 0; i < 100 / ASTERISK_TO_PERCENT; i++) {
			asterisks += "*";
		}
		
		// Finally generate complete axis
		System.out.println(numLabels);
		System.out.println(labelTicks);
		System.out.println(asterisks);
	}
	
	public static String generateLabelSpacing(int label) {
		int offset = 0;
		if (label > 9) {
			offset = 1;
		} else if (label > 99) {
			offset = 2;
		}
		
		String spaces = "";
		for(int i = 1; i < LABEL_INCREMENTS / ASTERISK_TO_PERCENT - offset; i++) {
			spaces += " ";
		}
		
		return spaces;
	}
	
	public static String generateAsterisks(double percent) {
		int numOfAsterisks = (int)percent / ASTERISK_TO_PERCENT;
		String asterisks = "";
		
		for(int i = 0; i < numOfAsterisks; i++) {
			asterisks += "*";
		}
		
		return asterisks;
	}
}
