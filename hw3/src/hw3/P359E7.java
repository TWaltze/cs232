/**
 * Tyler Waltze
 * twaltze@bu.edu
 * U91283106
 * 
 * MET CS 232
 * 6/11/15
 */

package hw3;

public class P359E7 {
	private double fuelTankCapacity;
	private double currentFuel;
	private double maxSpeed;
	private double currentSpeed;
	private double motorEfficiency;
	private double distanceTraveled;
	
	public P359E7() {
		this(20.0, 100.0, 120.0, 0, 20.0, 0.0);
	}
	
	public P359E7(double capacity, double fuel, double max, double current, double efficiency, double distance) {
		this.fuelTankCapacity = capacity;
		this.currentFuel = fuel;
		this.maxSpeed = max;
		this.currentSpeed = current;
		this.motorEfficiency = efficiency;
		this.distanceTraveled = distance;
	}
	
	/**
	 * 
	 * @param n The speed to set the current speed to
	 * 
	 * @post The current speed is set to n
	 */
	public void setCurrentSpeed(double n) {
		this.currentSpeed = n;
		
		if (this.currentSpeed > this.maxSpeed) {
			this.currentSpeed = this.maxSpeed;
		}
	}
	
	/**
	 * 
	 * @param hours Amount to increase the distance traveled and decrease current fuel by
	 * 
	 * @post Increases distance traveled by currentSpeed * hours and decreases current fuel
	 */
	public void operateBoat(double hours) {
		double traveled = this.currentSpeed * hours;
		
		this.distanceTraveled += traveled;
		this.currentFuel -= traveled / this.motorEfficiency;
	}
	
	/**
	 * 
	 * @param fuel Amount of fuel to increase current fuel by
	 * 
	 * @post Increases currentFuel
	 */
	public void fillTank(double fuel) {
		this.currentFuel += fuel;
		
		if (this.currentFuel > this.fuelTankCapacity) {
			this.currentFuel = this.fuelTankCapacity;
		}
	}
	
	/**
	 * 
	 * @return The current fuel level (currentFuel)
	 */
	public double getCurrentFuel() {
		return this.currentFuel;
	}
	
	/**
	 * 
	 * @return The total distance traveled (distanceTraveled)
	 */
	public double getDistanceTraveled() {
		return this.distanceTraveled;
	}
	
	public static void main(String[] args) {
		P359E7 motorboat = new P359E7();
		
		motorboat.setCurrentSpeed(50.0);
		motorboat.operateBoat(2);
		
		System.out.println("Tank is " + motorboat.getCurrentFuel() + "% filled.");
		System.out.println("Boat has traveled " + motorboat.getDistanceTraveled() + " miles.");
	}
}
