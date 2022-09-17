class Autoboxing
{
	public static void main(String vars[])
	{
		Integer iob = Integer.valueOf(100);
		int i = iob.intValue();
		System.out.println("iob object: " + iob + "\nint: " + i);
		Double dob = 100.2;
		double d = dob;
		System.out.println("After autoboxing and unboxing");
		System.out.println("dob object: " + dob + "\ndouble: " + d);
		i = methodDemo(100);
		iob = methodDemo(200);
		System.out.println("Autoboxing and unboxing in method argument and return values");
		System.out.println("int i = " + i + "\nInteger iob = " + iob);
	}
	
	static int methodDemo(Integer iob)
	{
		return iob;
	}
}