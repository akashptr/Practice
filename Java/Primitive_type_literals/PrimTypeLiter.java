/* Primitive types and literals. */

class PrimTypeLiter
{
	public static void main(String args[])
	{
		/*WholeNumber w = new WholeNumber();
		w.size();
		w.range();
		w.literal_use();
		
		RealNumber r = new RealNumber();
		r.size();
		
		Char c = new Char();
		c.escapeChar();
		
		Conversion con;
		con = new Conversion();
		con.someConversions();*/
		
		ArrayDemo ad = new ArrayDemo();
		ad.oneDim();
		ad.oneD();
		ad.twoDim();
		ad.threeD();
	}
}

class WholeNumber
{
	byte b;
	short s;
	int i;
	long l;
	
	WholeNumber()
	{
		b = 127;
		s = 32767;
		i = (int)(Math.pow(2,Integer.SIZE) - 1);
		l = (long)(Math.pow(2,Long.SIZE) - 1);
	}
	
	void size()
	{
		System.out.println("size of byte: " + Byte.SIZE + " bits");
		System.out.println("size of short: " + Short.SIZE + " bits");
		System.out.println("size of int: " + Integer.SIZE + " bits");
		System.out.println("size of long: " + Long.SIZE + " bits");
	}
	
	void range()
	{
		System.out.println("The range of byte is: " + -1 * (b+1) + " to " + b);
		System.out.println("The range of short is: " + -1 * (s+1) + " to " + s);
		System.out.println("The range of int is: " + -1 * (i+1) + " to " + i);
		System.out.println("The range of long is: " + -1 * (l+1) + " to " + l);
	}
	
	void literal_use()
	{
		i = 0453;
		System.out.println("Octal 453 = " + i + " in decimal");
		l = 0x7fffffffffffffffl;
		System.out.println("Hexadecimal of 0x7fffffff = " + l + " in decimal");
		i = 0b1011;
		System.out.println("Binary 1011 = " + i + " in decimal");
		i = 0b1111_1111_1111_1111;
		System.out.println("Binary 1111_1111_1111_1111 = " + i + " in decimal");
	}
}

class RealNumber
{
	float f;
	double d;
	RealNumber()
	{
		f = 0x12.2p2f;
		d = 234_13.1_0_9;
	}
	void size()
	{
		System.out.println("The size of float is: " + Float.SIZE + " bits");
		System.out.println("The size of double is: " + Double.SIZE + " bits");
	}
}

class Char
{
	char ch;
	void escapeChar()
	{
		System.out.println("\\141 = \141");
		System.out.println("\\u0061 = \u0061");
		System.out.println("\\\\ = \\");
		System.out.println("\\' = \'");
		System.out.println("\\\" = \"");
		System.out.println("\\n = \n");
		System.out.println("\\r = \r");
		System.out.println("\\f = \f");
		System.out.println("\\t = |\t|");
		System.out.println("\\b = E\b|");
	}
}

class Conversion
{
	int i;
	byte b;
	double d;
	Conversion()
	{
		i = 257;
		d = 323.142;
	}
	
	void someConversions()
	{
		b = (byte)i;
		System.out.println("int to byte: i = " + i + " b = " + b);
		i = (int)d;
		System.out.println("double to int: d = " + d + " i = " + i);
		b = (byte)d;
		System.out.println("double to byte: d = " + d + " b = " + b);
	}
}

class ArrayDemo
{
	int arr[];
	
	void oneDim()
	{
		arr = new int[12];
		arr[0] = 31;
		arr[1] = 28;
		arr[2] = 31;
		arr[3] = 30;
		arr[4] = 31;
		arr[5] = 30;
		arr[6] = 31;
		arr[7] = 31;
		arr[8] = 30;
		arr[9] = 31;
		arr[10] = 30;
		arr[11] = 31;
		System.out.println(arr[7]);
	}
	
	void oneD()
	{
		int ar[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println(arr[10]);
	}
	
	void twoDim()
	{
		int ar[][] = new int[3][4];
		int aar[][];
		ar[0][0] = 1;
		System.out.println(ar[2][1]);
		aar = new int[3][];
		aar[0] = new int[1];
		aar[1] = new int[2];
		aar[2] = new int[3];
		aar[1][1] = 10;
		System.out.println(aar[1][1]);
		double m[][] = {
			{1,2,3},
			{4,5,6}
		};
		System.out.println(m[0][1]);
	}
	
	void threeD()
	{
		int arr[][][] = new int[3][][];
		arr[0] = new int[2][];
		arr[1] = new int[2][];
		arr[2] = new int[2][];
		arr[0][0] = new int[1];
		arr[0][1] = new int[1];
		arr[1][0] = new int[1];
		arr[1][1] = new int[1];
		arr[2][0] = new int[1];
		arr[2][1] = new int[1];
		for(int i=0;i<3;i++)
			for(int j=0;j<2;j++)
				arr[i][j][0] = i*j;
				
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
				System.out.print(arr[i][j][0] + " ");
			System.out.println();
		}
	}
}