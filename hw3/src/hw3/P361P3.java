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

public class P361P3 {
	public double quizOne;
	public double quizTwo;
	public double midterm;
	public double exam;
	public double finalScore;
	public char finalGrade;
	
	public static void main(String[] args) {
		P361P3 student = new P361P3();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the student's first quiz: ");
		student.quizOne = scanner.nextDouble() / 10;
		
		System.out.println("Please enter the student's second quiz: ");
		student.quizTwo = scanner.nextDouble() / 10;
		
		System.out.println("Please enter the student's midterm: ");
		student.midterm = scanner.nextDouble() / 100;
		
		System.out.println("Please enter the student's final exam: ");
		student.exam = scanner.nextDouble() / 100;
		
		student.finalScore();
		student.finalGrade();
		
		System.out.println("The student's final grade is a " + student.finalGrade);
	}
	
	public void finalScore() {
		double quizScore = (quizOne * .125) + (quizTwo * .125);
		double midtermScore = midterm * .25;
		double examScore = exam * .5;
		
		finalScore = (quizScore + midtermScore + examScore) * 100;
	}
	
	public void finalGrade() {
		System.out.println(finalScore);
		if (finalScore >= 90) {
			finalGrade = 'A';
		} else if (finalScore >= 80) {
			finalGrade = 'B';
		} else if (finalScore >= 70) {
			finalGrade = 'C';
		} else if (finalScore >= 60) {
			finalGrade = 'D';
		} else {
			finalGrade = 'F';
		}
	}
}
