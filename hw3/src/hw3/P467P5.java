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

public class P467P5 {
	public static Pet[] pets;
	
	public static void main(String[] args) {
		final int totalPets = 2;
		pets = new Pet[totalPets];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < totalPets; i++) {
			System.out.println("Please enter the name for pet " + i);
			String name = scanner.next();
			
			System.out.println("Please enter the age for pet " + i);
			int age = scanner.nextInt();
			
			System.out.println("Please enter the weight for pet " + i);
			double weight = scanner.nextDouble();
			
			pets[i] = new Pet(name, age, weight);
		}
		
		System.out.println("The smallest pet is " + getSmallest().getName());
		System.out.println("The largest pet is " + getLargest().getName());
		System.out.println("The youngest pet is " + getYoungest().getName());
		System.out.println("The oldest pet is " + getOldest().getName());
		
		System.out.println("The average age is " + averageAge());
		System.out.println("The average weight is " + averageWeight());
	}
	
	public static Pet getSmallest() {
		Pet smallest = pets[0];
		
		for (Pet p : pets) {
			if(p.getWeight() < smallest.getWeight()) {
				smallest = p;
			}
		}
		
		return smallest;
	}
	
	public static Pet getLargest() {
		Pet largest = pets[0];
		
		for (Pet p : pets) {
			if(p.getWeight() > largest.getWeight()) {
				largest = p;
			}
		}
		
		return largest;
	}
	
	public static Pet getOldest() {
		Pet oldest = pets[0];
		
		for (Pet p : pets) {
			if(p.getAge() > oldest.getAge()) {
				oldest = p;
			}
		}
		
		return oldest;
	}
	
	public static Pet getYoungest() {
		Pet youngest = pets[0];
		
		for (Pet p : pets) {
			if(p.getAge() < youngest.getAge()) {
				youngest = p;
			}
		}
		
		return youngest;
	}
	
	public static double averageAge() {
		int total = 0;
		
		for (Pet p : pets) {
			total += p.getAge();
		}
		
		return total / pets.length;
	}
	
	public static double averageWeight() {
		int total = 0;
		
		for (Pet p : pets) {
			total += p.getWeight();
		}
		
		return total / pets.length;
	}
}
