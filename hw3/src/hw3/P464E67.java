/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/11/15
 */

package hw3;

public class P464E67 {
	private int numberInRoom;
	private static int totalNumber;
	
	public P464E67() {
		this.numberInRoom = 0;
	}
	
	public void addOneToRoom() {
		this.numberInRoom++;
		totalNumber++;
	}
	
	public void removeOneFromRoom() {
		if (this.numberInRoom - 1 >= 0) {
			this.numberInRoom--;
			totalNumber--;	
		}
	}
	
	public int getNumber() {
		return this.numberInRoom;
	}
	
	public static int getTotal() {
		return totalNumber;
	}
	
	public static void main(String[] args) {
		P464E67 office = new P464E67();
		P464E67 conference = new P464E67();
		
		office.addOneToRoom();
		office.removeOneFromRoom();
		office.removeOneFromRoom();
		System.out.println(office.getNumber());
		
		conference.addOneToRoom();
		conference.addOneToRoom();
		System.out.println(conference.getNumber());
		
		System.out.println(P464E67.getTotal());
	}
}
