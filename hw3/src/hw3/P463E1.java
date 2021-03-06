/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/11/15
 */

package hw3;

public class P463E1 {
	public static double basicRate = 4.0;
	public static double luxuryRate = 10.0;
	
	public static double computeCostBasic(double price) {
		return price + (price * (basicRate / 100));
	}
	
	public static double computeCostLuxury(double price) {
		return price + (price * (luxuryRate / 100));
	}
	
	public static void changeBasicRateTo(double rate) {
		basicRate = rate;
	}
	
	public static void changeLuxuryRateTo(double rate) {
		luxuryRate = rate;
	}
	
	public static double roundToNearestPenny(double price) {
		return (double)Math.round(price * 100) / 100;
	}
	
	public static void main(String[] args) {
		System.out.println(roundToNearestPenny(12.456545));
	}
}
