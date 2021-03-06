/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/11/15
 */

package hw3;

public class P358E6 {
	private int numberSold;
	private double totalSales;
	private double totalDiscounts;
	private double costPerItem;
	private int bulkQuantity;
	private double bulkDiscountPercentage;
	
	public P358E6() {
		this(1.0, 10, 15.0);
	}
	
	public P358E6(double costPerItem, int bulkQuantity, double bulkDiscountPercentage) {
		this.costPerItem = costPerItem;
		this.bulkQuantity = bulkQuantity;
		this.bulkDiscountPercentage = bulkDiscountPercentage;
	}
	
	public void registerSale(int n) {
		this.numberSold += n;
		double discount = 0;
		double totalCost = n * this.costPerItem;
		
		if (n > this.bulkQuantity) {
			discount = totalCost * (this.bulkDiscountPercentage / 100);
			
			this.totalDiscounts += discount;
		}
		
		totalCost -= discount;
		this.totalSales += totalCost;
	}
	
	public void displaySales() {
		System.out.println("Total sold: " + this.numberSold);
		System.out.println("Total sales: " + this.totalSales);
		System.out.println("Total discounts: " + this.totalDiscounts);
	}
	
	public static void main(String[] args) {
		P358E6 item = new P358E6();
		
		item.registerSale(5);
		item.registerSale(70);
		item.displaySales();
	}
}
