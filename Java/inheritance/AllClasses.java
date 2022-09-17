class Box
{
	private short length;
	private short width;
	private short height;
	static int st;
	Box()
	{
		length = width = height = 0;
		st = 10;
	}
	Box(short dim)
	{
		length = width = height = dim;
	}
	Box(short dim1, short dim2, short dim3)
	{
		length = dim1;
		width = dim2;
		height = dim3;
	}
	Box(Box b)
	{
		length = b.length;
		width = b.width;
		height = b.height;
	}
	int volumn()
	{
		int volumn = length * width * height;
		return volumn;
	}
	void show()
	{
		System.out.println("Length: " + length + "\nWidth: " + width + "\nHeight: " + height);
	}
}

class BoxWeight extends Box
{
	private short weight;
	
	BoxWeight()
	{
		weight = 0;
	}
	BoxWeight(short dim)
	{
		super(dim);
		weight = 0;
	}
	BoxWeight(short dim, short w)
	{
		super(dim);
		weight = w;
	}
	BoxWeight(short dim1, short dim2, short dim3, short w)
	{
		super(dim1, dim2, dim3);
		weight = w;
	}
	void show()
	{
		super.show();
		System.out.println("Weight: " + weight + "static st: " + Box.st);
	}
}

abstract class Figure
{
	int dim1;
	int dim2;
	Figure(int d1, int d2)
	{
		dim1 = d1;
		dim2 = d2;
	}
	abstract double area();
	final void className()
	{
		System.out.println("This is Figure class");
	}
}

final class Triangle extends Figure
{
	Triangle(int base, int height)
	{
		super(base, height);
	}
	double area()
	{
		return (dim1 * dim2)/2;
	}
/*	void className()
	{
		System.out.println("This is Triangle class");
	}*/
}

/*class EquilateralTriangle extends Triangle
{
	EquilateralTriangle(int side)
	{
		super(side, side);
	}
}*/