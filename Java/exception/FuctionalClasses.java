import java.util.Random;

class RandomOperations
{
	void randomDivision()
	{
		int dividend, randOp1, randOp2;
		int result;
		Random rand = new Random();
		for(int i=0; i<100; i++)
		{
			dividend = rand.nextInt();
			randOp1 = rand.nextInt();
			randOp2 = rand.nextInt();
			System.out.println("Division no. " + i + "\nDividend = " + dividend + "\nRandom operand 1 = " + randOp1 + "\nRandom operand 2 = " + randOp2);
			try
			{
				result = dividend / (randOp1/randOp2);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception: " + e);
				result = 0;
			}
			System.out.println("Result = " + result);
		}
	}
	
	void twoExceptions(int param)
	{
		int division_result;
		String arr_str[] = {"Hello", "World"};
		try
		{
			division_result = 1234/param;
			System.out.println(arr_str[42]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: " + e);
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e);
		}
	}
	
	void nestedTryBlock()
	{
		int result;
		result = 10 / 2;
		try
		{
			result = 20 / 0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception: " + e);
		}
	}
	
	void nestedTryBlock2()
	{
		try
		{
			nestedTryBlock();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: " + e);
		}
	}
	
	void throwsExample() throws IllegalAccessException
	{
		throw new IllegalAccessException();
	}
}