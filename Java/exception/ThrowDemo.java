class ThrowDemo
{
	static void meth1() throws IllegalAccessException
	{
		try
		{
			throw new IllegalAccessException("Demo");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		try
		{
			meth1();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}