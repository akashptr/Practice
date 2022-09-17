class demo
{
	demo dm;
	demo()
	{
		dm = new demo(); 
	}
	void show()
	{
		System.out.println(this);
	}
}

class Mainclass
{
	public static void main(String args[])
	{
		demo obj = new demo();
		obj.show();
	}
}