package Source_codes.p2;

class p2_class2
{
	static void meth1()
	{
		System.out.println("This is a static method");
	}
}

class p2_class1 extends p2_class2
{
	public static void main(String args[])
	{
		meth1();
	}
}