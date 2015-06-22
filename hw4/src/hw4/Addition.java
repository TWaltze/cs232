package hw4;

public class Addition implements Command {
	private double left;
	private double right;
	
	public Addition(double left, double right) {
		this.left = left;
		this.right = right;
	}
	public void execute() {
		System.out.println(left + " + " + right + " = " + (left + right));
	}
}
