package hw3;

public class P361P2 {
	private int count;
	
	public void reset() {
		this.count = 0;
	}
	
	public void increase() {
		this.count++;
	}
	
	public void decrease() {
		this.count--;
		
		if (this.count < 0) {
			this.count = 0;
		}
	}
	
	public int currentCount() {
		return this.count;
	}
	
	public String toString() {
		return "The current count is " + this.count;
	}
	
	public static void main(String[] args) {
		P361P2 counter = new P361P2();
		
		System.out.println(counter);
		
		counter.increase();
		counter.increase();
		System.out.println(counter);
		
		counter.decrease();
		System.out.println(counter);
		
		counter.decrease();
		counter.decrease();
		System.out.println(counter);
		
		counter.increase();
		counter.reset();
		System.out.println(counter);
	}
}
