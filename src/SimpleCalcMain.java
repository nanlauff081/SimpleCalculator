
public class SimpleCalcMain {
	public static void main (String[] args)
	{
		SimpleCalculator calculator = new SimpleCalculator();
		
		calculator.enterNums();
		double result = calculator.calculate();
		System.out.println(result + " is the answer");
		
	}

}
