/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/11/15
 */

package hw3;

public class P463E2 {
	public int hour;
	public int minute;
	
	public P463E2() {
		this(0, 0);
	}
	
	public P463E2(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	private boolean isValid(int hour, int minute) {
		if (hour < 0 || hour > 23) {
			return false;
		} else if (minute < 0 || minute > 59) {
			return false;
		} else {
			return true;
		}
	}
	
	public void setTime(int hour, int minute) {
		if (isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		}
	}
	
	public void setTime(int hour, int minute, boolean isAM) {
		if (isAM) {
			hour += 12;
		}
		
		if (isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		}
	}
	
	public static void main(String[] args) {
		P463E2 clock = new P463E2();
		
		clock.setTime(14, 30, true);
		System.out.println("Current time: " + clock.hour + ":" + clock.minute);
	}
}
