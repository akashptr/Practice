package Source_codes.p1;

class p1_class1
{
	public int x;
	public p1_class1(int data)
	{
		x = data;
	}
	public void showx()
	{
		System.out.println("The value of x is: " + x);
	}
}

/*
should be in different file
public class p1_class2
{
	private int y;
	public p1_class2(int data)
	{
		y = data;
	}
	public void show()
	{
		System.out.println("The value of y is: " + y);
	}
}


class p1_class3
{
	private int y;
	p1_class3(int data)
	{
		y = data;
	}
	int gety()
	{
		return y;
	}
}
*/