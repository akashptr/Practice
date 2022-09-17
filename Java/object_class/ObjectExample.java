// Object class practice.

class MyClass
{
	private int value;
	MyClass(int data)
	{
		value = data;
	}
	public String toString()
	{
		String description = this.getClass() + "\nHash code: " + this.hashCode();
		return description;
	}
}

class ObjectExample
{
	public static void main(String args[])
	{
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		System.out.println(mc1.equals(mc2));
		MyClass mc3 = mc1;
		if(mc1.equals(mc2))
			System.out.println(mc1 + "\n" + mc2 + "\nare equal");
		else
			System.out.println(mc1 + "\n" + mc2 + "\nare not equal");
			
		if(mc1.equals(mc3))
			System.out.println(mc1 + "\n" + mc3 + "\nare equal");
		else
			System.out.println(mc1 + "\n" + mc3 + "\nare not equal");
	}
}