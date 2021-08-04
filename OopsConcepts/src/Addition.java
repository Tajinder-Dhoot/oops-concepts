import java.util.*;

public class Addition {
	
	private int sum = 0; // encapsulation

	public int sumTwoNumbers(int a, int b) {
		
		return a + b;
	}
	
	
	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int sumNumbers() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to add or \"0\" to end: ");
		
		int number = in.nextInt();
		if (number != 0) {
			
			sum += number;
			sumNumbers();
		} 
		return sum;
	}
}
