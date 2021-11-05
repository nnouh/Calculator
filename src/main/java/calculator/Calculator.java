package calculator;

public class Calculator {

	public Calculator ()
	{

	}

	public int add(int x, int y) {
		return x+y;

	}

	public int subtract(int x, int y) {
		return x -y;

	}

	public int multiply(int x, int y) {
		return x * y;

	}

	public double divid(int x, int y)	{
		double result;
		if (y==0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result =Double.valueOf(x)/Double.valueOf(y);
		}
		return result;
	}

}

