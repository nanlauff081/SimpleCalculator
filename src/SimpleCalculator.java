import java.util.Scanner;

public class SimpleCalculator {
	double double1;
	double double2;
	String symbol;
		public void enterNums() {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter your math problem here: ");
		double1 = keyboard.nextDouble();
		symbol = keyboard.next();
		double2 = keyboard.nextDouble();
		

	}
	public double calculate() {
		if (symbol.equals("+"))
		{
			return double1 + double2;
		}
		else if (symbol.equals("-"))
		{
			return double1 - double2;
		}
		else if (symbol.equals("*"))
		{
			return double1 * double2;
		}
		else if (symbol.equals("/"))
		{
			return double1 / double2;
		}
		else
		{
			System.err.println("Please use one of these 4 symbols: + - * /");
			
			return 0;
		}
		
	}
	
}
