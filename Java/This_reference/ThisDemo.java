class ThisDemo
{
	int a;
	float b;
	void assign(int a, float b)
	{
		this.a = a;
		this.b = b;
	}
	public static void main(String args[])
	{
		ThisDemo td1 = new ThisDemo();
		td1.assign(10, 3.141f);
		ThisDemo td2 = new ThisDemo();
		td2.assign(20, 102f);
		System.out.println("The value of a is: " + td1.a + " and the value of b is: " + td1.b);
		System.out.println("The value of a is: " + td2.a + " and the value of b is: " + td2.b);
	}
}